package com.example.payment.service;

import com.example.payment.entity.PaymentTransaction;
import com.example.payment.entity.UserPoints;
import com.example.payment.repository.PaymentTransactionRepository;
import com.example.payment.repository.UserPointsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class PaymentService {

    @Autowired
    private PaymentTransactionRepository paymentRepo;

    @Autowired
    private UserPointsRepository pointsRepo;

    public String processPayment(String userId, double amount) {
        // Step 1: Save payment transaction
        PaymentTransaction payment = new PaymentTransaction();
        payment.setUserId(userId);
        payment.setAmount(amount);
        payment.setTimestamp(LocalDateTime.now());
        payment.setStatus("SUCCESS");
        paymentRepo.save(payment);

        // Step 2: Award loyalty points (1 point per $1 spent)
        int earnedPoints = (int) amount;
        UserPoints userPoints = pointsRepo.findByUserId(userId)
                .orElse(new UserPoints(userId, 0)); // Corrected initialization

        userPoints.setPoints(userPoints.getPoints() + earnedPoints);
        pointsRepo.save(userPoints);

        return "Payment processed! Points earned: " + earnedPoints;
    }

    public int getPointsBalance(String userId) {
        return pointsRepo.findByUserId(userId).map(UserPoints::getPoints).orElse(0);
    }
}