package com.example.repositories;

import com.example.models.FoodRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRegisterRepository extends JpaRepository<FoodRegister, Integer> {
}
