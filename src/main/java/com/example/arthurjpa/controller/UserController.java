package com.example.arthurjpa.controller;

import com.example.arthurjpa.domain.user.entity.User;
import com.example.arthurjpa.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(){
        return "{'a':133}";
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public User index(@PathVariable("email") String email){

        User user = userRepository.findByEmail(email);

        return user;
    }
}
