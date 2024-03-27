package com.example.repositories;

import com.example.models.Specie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecieRepository extends JpaRepository<Specie, Integer> {
}

