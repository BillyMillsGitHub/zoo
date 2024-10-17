package com.example.application.Controller;

import com.example.application.Model.Animal;
import com.example.application.Repository.ZooRepository;
import com.example.application.Service.ZooService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.lang.Iterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RestMapping
public class ZooController {

    private ZooRepository zooRepository;

    @Autowired
    private ZooService zooService;

    @Autowired
    public void ZooController(ZooRepository zooRepository) {
        this.zooRepository = zooRepository;
    }

    @GetMapping("/animals")
    public Iterable<Animal> getAnimals()  {
    return this.zooRepository.findAll();
    }

    @GetMapping("/animal/{id}")
    public Animal getAnimalById(@PathVariable("id") String id) throws ResponseStatusExcpetion {
        Optional<Animal> animal = this.zooRepository.findById((long) Integer.parseInt(id));
        System.out.println(" Here is the received animal id : " + id);
        if (animal.isPresent()) {
            return animal.get();
        } else {

            throw new ResponseStatusExcpetion(HttpStatus.NOT_FOUND, " Animal not found ");
        }


    }

    @GetMapping("/animal/search")
    public List<Animal> searchAnimal(@RequestParam(name = " name ", required = false) String name) {
        if (name != null) {
            return this.zooRepository.findByName(name);
        } else {
            return new ArrayList<>();
        }
        }

        @PostMapping("/animal")
        @ResponseStatus(HttpStatus.CREATED)
    public Animal createNewAnimal(@RequestBody Animal animal) {
        System.out.println(" Here is the requested animal : " + animal.getName());
        return zooRepository.save(animal);

    }

    }
