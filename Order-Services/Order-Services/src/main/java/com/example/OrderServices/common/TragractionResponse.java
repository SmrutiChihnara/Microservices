package com.example.OrderServices.common;

import com.example.OrderServices.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class TragractionResponse {
    private Order order;
    private double amount;
    private String tragractionId;
    private String message;

}
