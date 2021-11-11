package com.example.test.controller;

import com.example.test.model.SelfAssesmentForm;
import com.example.test.model.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userServiceImpl;


    @GetMapping("/user")
    public String getuser() {
        return "Hello User" ;
    }


    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }


    @GetMapping("/user/selfAssement/")
    public Long selfAssesmentReport(@RequestBody SelfAssesmentForm selfAssesmentForm) {
        return Long.valueOf(userServiceImpl.getSelfAssesmentScore(selfAssesmentForm));
    }

}
