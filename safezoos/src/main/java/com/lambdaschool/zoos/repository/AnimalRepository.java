package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.view.CountAnimals;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    Animal findByAnimaltype(String type);

    // custom query that lists the animals and count of how many zoos
    // where they can be found
    @Query(value = "SELECT a.animaltype animal, count(z.zooid) as count FROM animal a LEFT JOIN zooanimals z ON a.animalid = z.animalid GROUP BY animaltype ORDER BY count desc", nativeQuery = true)
    List<CountAnimals> getCountAnimals();
}