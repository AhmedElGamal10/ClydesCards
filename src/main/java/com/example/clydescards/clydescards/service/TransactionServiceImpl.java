package com.example.clydescards.clydescards.service;

import com.example.clydescards.clydescards.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    /* In a real system, this function would take necessary params userId, startDate and endDate instead of the counter parameter */
    @Override
    public List<Transaction> getUserTransactions(int transactionsRequestsCounter) {
        Transaction transaction1 = null;
        Transaction transaction2 = null;
        if (transactionsRequestsCounter == 2) {
            transaction1 = new Transaction("transaction_1", "2019-12-28", "AUTHORIZED", 50.0);
            transaction2 = new Transaction("transaction_2", "2019-12-28", "SETTLED", 50.0);
        } else {
            transaction1 = new Transaction("transaction_1", "2019-12-28", "AUTHORIZED", 70.0);
            transaction2 = new Transaction("transaction_2", "2019-12-28", "SETTLED", 80.0);
        }

        List<Transaction> transactionsList = new ArrayList<>();
        transactionsList.add(transaction1);
        transactionsList.add(transaction2);

        return transactionsList;
    }
}
