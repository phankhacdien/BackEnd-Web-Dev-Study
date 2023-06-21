package com.example_security.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
public class welcomeController {

    @GetMapping
    public ResponseEntity<String> sayWelcome() {
        return ResponseEntity.ok("Welcome to first page");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> sayGoodbye(){
        return ResponseEntity.ok("Good~Bye!!!");
    }
}

