package com.spring.springSection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome()
    {
        System.out.println("Welcome to Spring Framework");
        return "Welcome to Spring Boot Application  security";
    }

}
