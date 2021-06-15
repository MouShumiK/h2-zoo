package com.example.h2zoo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mammals {

    @Id
    @GeneratedValue

    private Long id;
    private final String name;
    private final String species;
    private final String color;


    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }



    public Mammals(String name, String species, String color) {

        this.name= name;
        this.species= species;
        this.color= color;

    }
}