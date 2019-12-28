package com.example.clydescards.clydescards.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Transaction {

    public enum State {
        AUTHORIZED, SETTLED
    }

    String id;
    String date;
    String state;
    double amount;
}
