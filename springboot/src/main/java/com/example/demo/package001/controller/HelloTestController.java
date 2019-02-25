package com.example.demo.package001.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {

    @RequestMapping("/hello2")
    public String hello(){
        return "Greeting from Spring Boot2";
    }
}