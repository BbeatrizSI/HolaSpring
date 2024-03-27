package com.example.controllers;

import com.example.models.Tank;
import com.example.services.TankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "api/v1/Tanks")
public class tankController {
    @Autowired
    private TankService tankService;

    @GetMapping
    public List<Tank> getAll(){
    return tankService.getTanks();
    }
    @PostMapping
    public void saveUpdate(@RequestBody Tank tank){
        tankService.saveOrUpdate(tank);
    }
    @DeleteMapping("/{tankId}")
    public void saveUpdate(@PathVariable("tankId") Integer tankId){
        tankService.delete(tankId);
    }
    @GetMapping("/{tankId}")
    public Optional<Tank> getById(@PathVariable("tankId") Integer tankId){
        return tankService.getTank(tankId);
    }
}
