package com.example.controllers;

import com.example.models.Animal;
import com.example.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "api/v1/Animals")
public class animalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAll(){
        return animalService.getAnimals();
    }
    @PostMapping
    public void saveUpdate(@RequestBody Animal animal){
        animalService.saveOrUpdate(animal);
    }
    @DeleteMapping("/{animalId}")
    public void saveUpdate(@PathVariable("animalId") Integer animalId){
        animalService.delete(animalId);
    }
    @GetMapping("/{animalId}")
    public Optional<Animal> getById(@PathVariable("animalId") Integer animalId){
        return animalService.getAnimal(animalId);
    }
}
