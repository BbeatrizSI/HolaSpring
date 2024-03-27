package com.example.repositories;

import com.example.models.Tank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TankRepository extends JpaRepository<Tank, Integer> {
}

