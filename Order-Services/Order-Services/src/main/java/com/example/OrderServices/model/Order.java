package com.example.OrderServices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
@Table(name = "ORDER_TB")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int qut;
    private double price;
}
