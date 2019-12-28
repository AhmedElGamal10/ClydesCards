package com.example.clydescards.clydescards.service;

import com.example.clydescards.clydescards.model.Transaction;

import java.util.Date;
import java.util.List;

public interface TransactionService {
    List<Transaction> getTransactions(String userId, Date startDate, Date endDate);
}
