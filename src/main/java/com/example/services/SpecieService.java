package com.example.services;

import com.example.models.Specie;
import com.example.repositories.SpecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecieService {
    @Autowired
    SpecieRepository specieRepository;
    public List<Specie> getSpecies(){
        return specieRepository.findAll();
    }
    public Optional<Specie> getSpecie(int id){
        return specieRepository.findById(id);
    }
    public void saveOrUpdate(Specie animal){
        specieRepository.save(animal);
    }
    public void delete(int id){
        specieRepository.deleteById(id);
    }
}
