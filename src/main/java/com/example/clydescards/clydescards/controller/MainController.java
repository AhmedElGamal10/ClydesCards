package com.example.clydescards.clydescards.controller;

import com.example.clydescards.clydescards.model.Transaction;
import com.example.clydescards.clydescards.model.User;
import com.example.clydescards.clydescards.service.TransactionService;
import com.example.clydescards.clydescards.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clydescards.example.com")
@Slf4j
public class MainController {
    @Autowired
    private TransactionService transactionService;

    @Autowired
    private UserService userService;

    /* For TDD purposes */
    int requestsCounter = 0;
    volatile int transactionsRequestsCounter = 0;

    @RequestMapping(value = "/transactions")
    public ResponseEntity<List<Transaction>> getUserTransactions() {
        log.info("Requests received: " + requestsCounter++);
        return new ResponseEntity<>(transactionService.getUserTransactions(transactionsRequestsCounter++), HttpStatus.OK);
    }

    /* For TDD purposes */
    @RequestMapping(value = "/reset")
    public void resetCounter() {
        transactionsRequestsCounter = 0;
    }

    @RequestMapping(value = "/users")
    public ResponseEntity<List<User>> getUsers() {
        log.info("Requests received: " + requestsCounter++);
        return new ResponseEntity<>(userService.getSystemUsers(), HttpStatus.OK);
    }
}
