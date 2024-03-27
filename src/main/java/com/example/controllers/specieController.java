package com.example.controllers;

import com.example.models.Specie;
import com.example.services.SpecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "api/v1/Species")
public class specieController {
    @Autowired
    private SpecieService specieService;

    @GetMapping
    public List<Specie> getAll(){
    return specieService.getSpecies();
    }
    @PostMapping
    public void saveUpdate(@RequestBody Specie specie){
        specieService.saveOrUpdate(specie);
    }
    @DeleteMapping("/{specieId}")
    public void saveUpdate(@PathVariable("specieId") Integer specieId){
        specieService.delete(specieId);
    }
    @GetMapping("/{specieId}")
    public Optional<Specie> getById(@PathVariable("specieId") Integer specieId){
        return specieService.getSpecie(specieId);
    }
}
