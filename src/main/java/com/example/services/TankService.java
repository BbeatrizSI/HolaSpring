package com.example.services;

import com.example.models.Tank;
import com.example.repositories.TankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TankService {
    @Autowired
    TankRepository tankRepository;
    public List<Tank> getTanks(){
        return tankRepository.findAll();
    }
    public Optional<Tank> getTank(int id){
        return tankRepository.findById(id);
    }
    public void saveOrUpdate(Tank tank){
        tankRepository.save(tank);
    }
    public void delete(int id){
        tankRepository.deleteById(id);
    }
}
