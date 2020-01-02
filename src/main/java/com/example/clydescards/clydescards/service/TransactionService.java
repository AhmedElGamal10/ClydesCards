package com.example.clydescards.clydescards.service;

import com.example.clydescards.clydescards.model.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getUserTransactions(int transactionsRequestsCounter);
}
