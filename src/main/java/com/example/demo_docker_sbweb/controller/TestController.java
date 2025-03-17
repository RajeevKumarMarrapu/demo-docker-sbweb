package com.example.demo_docker_sbweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @Value("${demo.env}")
    private String env;

    @GetMapping("/env")
    public String whichenv() {
        return env;
    }
}
