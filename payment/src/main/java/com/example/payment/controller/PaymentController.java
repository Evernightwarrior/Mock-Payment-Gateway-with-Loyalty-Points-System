package com.example.payment.controller;

import com.example.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String processPayment(
        @RequestParam String userId,
        @RequestParam double amount) {
        return paymentService.processPayment(userId, amount);
    }

    @GetMapping("/points/{userId}")
    public int getPoints(@PathVariable String userId) {
        return paymentService.getPointsBalance(userId);
    }
}
