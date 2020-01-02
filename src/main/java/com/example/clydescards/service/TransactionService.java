package com.example.clydescards.service;

import com.example.clydescards.model.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getUserTransactions(int transactionsRequestsCounter);
}
