package com.example.clydescards.clydescards.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Transaction {
    private String id;
    private String created;
    private String state;
    private Double amount;
}
