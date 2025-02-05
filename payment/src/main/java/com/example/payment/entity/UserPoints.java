package com.example.payment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor  
// Removed @AllArgsConstructor to avoid conflicting constructors
public class UserPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private int points;

    // Custom constructor for (userId, points)
    public UserPoints(String userId, int points) {
        this.userId = userId;
        this.points = points;
    }
}
