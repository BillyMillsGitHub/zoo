package com.example.application.Repository;

import com.example.application.Model.Animal;
import org.springframework.data.repository.Repository;
import java.util.List;
import java.util.Optional;

public interface ZooRepository extends Repository<Animal, Long> {
    Optional<Animal> findById(Long id);
    List<Animal> findByName(String name);


    Iterable findAll();

    Animal save(Animal animal);

    void deleteById(Long id);
}
