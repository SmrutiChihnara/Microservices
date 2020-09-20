package com.example.PaymentServices.controller;

import com.example.PaymentServices.model.Payment;
import com.example.PaymentServices.servicess.PaymentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentCont {
    @Autowired
    PaymentSer paymentSer;
@PostMapping("doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return paymentSer.doPayment (payment);
    }
}
