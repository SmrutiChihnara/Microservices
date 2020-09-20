package com.example.OrderServices.servicess;

import com.example.OrderServices.common.Payment;
import com.example.OrderServices.common.TragractionRequest;
import com.example.OrderServices.common.TragractionResponse;
import com.example.OrderServices.model.Order;
import com.example.OrderServices.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderSer {
    @Autowired
    OrderRepo orderRepo;
    @Autowired
            @LoadBalanced
    RestTemplate restTemplate;

    public TragractionResponse TragractionResponse(TragractionRequest tragractionRequest) {
        String response;
        Order order = tragractionRequest.getOrder ();
        Payment payment = tragractionRequest.getPayment ();
        payment.setOrderId (order.getId ());
        payment.setAmount (order.getPrice ());
        Payment paymentResponse = restTemplate.postForObject ("http://PAYMENT-SERVICESS/payment/doPayment", payment, Payment.class);
        response = paymentResponse.getPaymentStatus ().equals ("sucess") ? "pay sucss" : "payment failed";
        orderRepo.save (order);
        return new TragractionResponse (order, paymentResponse.getAmount (), paymentResponse.getPaymenTraractionId (), response);
    }
}
