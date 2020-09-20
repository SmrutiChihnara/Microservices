package com.example.OrderServices.controller;

import com.example.OrderServices.common.Payment;
import com.example.OrderServices.common.TragractionRequest;
import com.example.OrderServices.common.TragractionResponse;
import com.example.OrderServices.model.Order;
import com.example.OrderServices.servicess.OrderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderCon {
    @Autowired
    OrderSer orderSer;

    @PostMapping("bookOrder")
    public TragractionResponse bookOrder(@RequestBody TragractionRequest tragractionRequest) {


        return orderSer.TragractionResponse (tragractionRequest);
    }
}
