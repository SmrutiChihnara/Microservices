package com.example.PaymentServices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor@NoArgsConstructor@Entity@Table(name = "Payment_DB")
public class Payment {
    @Id@GeneratedValue
    private int paymentId;
    private String paymentStatus;
    private String paymenTraractionId;
}
