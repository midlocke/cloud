package com.example.demo.package001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-application")
public class ApplicationTestController {

    @Value("${my.name}")
    private String myName;
    @Value("${my.age}")
    private String myAge;

    @RequestMapping("/my-info")
    public String selectMyInfo(){
        return myName+myAge;
    }
}