package com.example.repositories;
import com.example.models.Keeper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeeperRepository extends JpaRepository<Keeper, Integer> {
}