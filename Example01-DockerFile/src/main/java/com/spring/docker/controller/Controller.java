package com.spring.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class Controller {

    @GetMapping
    public String printMessage() {
        return "Hello from Docker Image";
    }
}