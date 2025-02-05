package com.example.payment.repository;

import com.example.payment.entity.UserPoints;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserPointsRepository extends JpaRepository<UserPoints, Long> {
    Optional<UserPoints> findByUserId(String userId); // Custom query method
}
