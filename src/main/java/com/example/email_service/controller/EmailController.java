package com.example.emailservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @GetMapping("/status")
    public String status() {
        return "Email service is running ✅";
    }

    @PostMapping("/send")
    public String sendEmail(@RequestParam String to, @RequestParam String subject) {
        return "Email sent to: " + to + " with subject: " + subject;
    }
}
