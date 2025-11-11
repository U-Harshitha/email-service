package com.example.emailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.emailservice")
public class EmailServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailServiceApplication.class, args);
    }
}
