package com.example.PaymentServices.servicess;

import com.example.PaymentServices.model.Payment;
import com.example.PaymentServices.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import sun.plugin.util.UIUtil;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentSer {
    @Autowired
    PaymentRepo paymentRepo;

    public Payment doPayment(Payment payment) {
        payment.setPaymentStatus (paymentProcess ());
        payment.setPaymenTraractionId (UUID.randomUUID ().toString ());
        return paymentRepo.save (payment);
    }

    public String paymentProcess() {
        return new Random ().nextBoolean () ? "Success" : "False";
    }

}
