package com.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@Entity(name = "FoodRegister")
@Table(name = "FoodRegistration")
public class FoodRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegister")
    private Integer idRegister;

    @ManyToOne
    @JoinColumn(name = "idKeeper")
    private Keeper keeper;

    @ManyToOne
    @JoinColumn(name = "idAnimal")
    private Animal animal;

    @Column(name = "foodName")
    private String foodName;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "date")
    private Timestamp date;

}
