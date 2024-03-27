package com.example.services;

import com.example.models.Animal;
import com.example.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired
    AnimalRepository animalRepository;
    public List<Animal> getAnimals(){
        return animalRepository.findAll();
    }
    public Optional<Animal> getAnimal(int id){
        return animalRepository.findById(id);
    }
    public void saveOrUpdate(Animal animal){
        animalRepository.save(animal);
    }
    public void delete(int id){
        animalRepository.deleteById(id);
    }
}
