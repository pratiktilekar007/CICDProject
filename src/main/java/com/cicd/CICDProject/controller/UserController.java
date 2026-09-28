package com.cicd.CICDProject.controller;

import com.cicd.CICDProject.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){

        List<User> user = new ArrayList<>();

        user.add(new User(101,"Pratik","pratik@gmail.com",
                "9876543210"));

        user.add(new User(102,"Akshay","akshay@gmail.com",
                "9876543210"));

        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }
}
