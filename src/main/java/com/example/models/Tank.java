package com.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="Tank")
@Table(name="Tanks")
public class Tank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idTank")
    private Integer idTank;

    @Column(name="volume", nullable = false)
    private Integer volume;

    @Column(name="temperature", nullable = false)
    private Integer temperature;

    @Column(name="type", nullable = false)
    private String type;

}

