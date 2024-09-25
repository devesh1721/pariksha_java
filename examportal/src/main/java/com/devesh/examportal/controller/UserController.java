package com.devesh.examportal.controller;


import com.devesh.examportal.model.User;
import com.devesh.examportal.service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class UserController {

    @Autowired
    private SignUpService signUpService;


    @PostMapping(value = "/user/signup")
    ResponseEntity<Object> registerUser(){
        log.info("Inside registerUser() of UserController.java : START");
        signUpService.registerUser(null,null);
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
