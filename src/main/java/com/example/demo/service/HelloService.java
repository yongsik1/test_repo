package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getGreeting() {
        return "Hello, World";
    }
}
