package com.example.OrderServices.common;

import com.example.OrderServices.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class TragractionRequest {
    private Order order;
    private Payment payment;
}
