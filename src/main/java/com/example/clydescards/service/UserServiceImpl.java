package com.example.clydescards.service;

import com.example.clydescards.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getSystemUsers() {
        User user1 = new User("user_1", "2019-12-28");
        List<User> usersList = new ArrayList<>();
        usersList.add(user1);

        return usersList;
    }
}
