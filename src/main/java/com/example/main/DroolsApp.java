package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class DroolsApp {
    public static void main(String[] args) {
        SpringApplication.run(DroolsApp.class, args);
    }
}