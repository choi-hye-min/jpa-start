package com.example.arthurjpa.service;

import com.example.arthurjpa.domain.user.UserService;
import com.example.arthurjpa.domain.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserApiService {

    @Autowired
    UserService userService;

    public User get(String email){
        return userService.get(email);
    }
}
