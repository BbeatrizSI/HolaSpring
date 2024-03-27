package com.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="Specie")
@Table(name="Species")
public class Specie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idSpecie")
    private Integer idSpecie;

    @Column(name="commonName", nullable = false)
    private String commonName;

    @Column(name="scientistName", nullable = false)
    private String scientistName;

    @Column(name="habitat")
    private String habitat;

    @Column(name="animalType")
    private String animalType;

}

