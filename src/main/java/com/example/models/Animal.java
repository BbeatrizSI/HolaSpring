package com.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="Animal")
@Table(name="Animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAnimal")
    private Integer idAnimal;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="idSpecie")
    private Specie idSpecie;

    @Column(name="image")
    private String image;

    @Column(name="foodRestrictions")
    private String foodRestrictions;

    @ManyToOne
    @JoinColumn(name="idTank")
    private Tank idTank;

    @Column(name="sex")
    private String sex;

}

