package com.example.payment.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class PaymentTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private double amount;
    private LocalDateTime timestamp;
    private String status; // e.g., "SUCCESS", "FAILED"
}
