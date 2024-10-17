package com.example.application.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "ZOO")
public class Animal {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AREAS")
    private String areas;

    @Column(name = "ANIMAL")
    private String animal;

    @Column(name = "FLOORS")
    private int floors;

    @Column(name = "EXISTS")
    private Boolean exists;

    public Animal(Long id, String name, String areas, String animal, int floors, Boolean exists) {
        this.id = id;
        this.name = name;
        this.areas = areas;
        this.animal = animal;
        this.floors = floors;
        this.exists = exists;

    }
    //getters and setters
    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getAreas() {
        return this.areas;
    }
    public String getAnimal() {
        return this.animal;
    }
    public int getFloors() {
        return this.floors;
    }
    public Boolean getExists() {
        return exists;
    }


    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAreas(String areas) {
        this.areas = areas;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setExists(Boolean exists) {
        this.exists = exists;
    }



}
