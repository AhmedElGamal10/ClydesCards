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

    @RequestMapping(value = "/transactions")
    public ResponseEntity<List<Transaction>> getUserTransactions() {
        Transaction transaction1 = new Transaction("transaction_1", "1 Dec 2019", "AUTHORIZED", 50);
        Transaction transaction2 = new Transaction("transaction_1", "1 Dec 2019", "SETTLED", 50);

        List<Transaction> transactionsList = new ArrayList<>();
        transactionsList.add(transaction1);
        transactionsList.add(transaction2);
        log.info("Requests received: " + requestsCounter++);
        return new ResponseEntity<List<Transaction>>(transactionsList, HttpStatus.OK);
    }

    @RequestMapping(value = "/users")
    public ResponseEntity<List<User>> getUsers() {
        User user1 = new User("user_1", "1 Jan 2019");
        User user2 = new User("user_2", "1 Feb 2019");

        List<User> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);

        log.info("Requests received: " + requestsCounter++);
        return new ResponseEntity<List<User>>(usersList, HttpStatus.OK);
    }
}
