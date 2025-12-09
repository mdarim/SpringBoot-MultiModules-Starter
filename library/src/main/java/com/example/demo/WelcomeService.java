package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public WelcomeService() {
    }

    public String getWelcomeMessage() {
        return "Welcome Message from this Module";
    }
}
