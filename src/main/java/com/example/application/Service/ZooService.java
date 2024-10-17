package com.example.application.Service;

import com.example.application.Model.Animal;
import com.example.application.Repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ZooService {

        private final ZooRepository zooRepository;
        public Object getAllAnimals;

        @Autowired
        public ZooService(final ZooRepository zooRepository) {
            this.zooRepository = zooRepository;
        }

    public List<Animal> getAllAnimals() {
            return (List<Animal>) zooRepository.findAll();
        }

        public Animal getAnimalById(Long id) {
            return zooRepository.findById(id).orElse(null);
        }

        public void addAnimal(Animal animal) {
            zooRepository.save(animal);
        }

        public void updateAnimal(Animal animal) {
            zooRepository.save(animal);
        }

        public void deleteAnimal(Long id) {
            zooRepository.deleteById(id);
        }
    }

