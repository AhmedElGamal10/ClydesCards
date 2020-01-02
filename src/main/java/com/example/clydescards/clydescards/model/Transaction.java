package com.example.clydescards.clydescards.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Transaction {
    private String id;
    private String created;
    private String state;
    private Double amount;
}
