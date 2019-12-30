package com.example.clydescards.clydescards.controller;

import com.example.clydescards.clydescards.model.Transaction;
import com.example.clydescards.clydescards.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clydescards.example.com")
@RequiredArgsConstructor
@Slf4j
public class MainController {

    int requestsCounter = 0;
    int transactionsRequestsCounter = 0;
    @RequestMapping(value = "/transactions")
    public ResponseEntity<List<Transaction>> getUserTransactions() {
        Transaction transaction1;
        Transaction transaction2;
        if(transactionsRequestsCounter%2 == 0){
            transaction1 = new Transaction("transaction_1", "2019-12-28", "AUTHORIZED", 50.0);
            transaction2 = new Transaction("transaction_2", "2019-12-28", "SETTLED", 50.0);
        } else {
            transaction1 = new Transaction("transaction_1", "2019-12-28", "AUTHORIZED", 70.0);
            transaction2 = new Transaction("transaction_2", "2019-12-28", "SETTLED", 80.0);
        }

        List<Transaction> transactionsList = new ArrayList<>();
        transactionsList.add(transaction1);
        transactionsList.add(transaction2);
        transactionsRequestsCounter++;
        log.info("Requests received: " + requestsCounter++);
        return new ResponseEntity<List<Transaction>>(transactionsList, HttpStatus.OK);
    }

    @RequestMapping(value = "/users")
    public ResponseEntity<List<User>> getUsers() {
        User user1 = new User("user_1", "1 Jan 2019");
        List<User> usersList = new ArrayList<>();
        usersList.add(user1);

        log.info("Requests received: " + requestsCounter++);
        return new ResponseEntity<List<User>>(usersList, HttpStatus.OK);
    }
}
