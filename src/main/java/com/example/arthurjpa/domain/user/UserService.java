package com.example.arthurjpa.domain.user;

import com.example.arthurjpa.domain.user.entity.User;
import com.example.arthurjpa.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User get(String email){
        return userRepository.findByEmail(email);
    }
}
