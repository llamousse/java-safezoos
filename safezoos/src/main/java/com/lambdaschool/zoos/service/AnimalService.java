package com.lambdaschool.zoos.service;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.view.CountAnimals;

import java.util.ArrayList;
import java.util.List;

public interface AnimalService
{
    ArrayList<Animal> findAll();

    Animal findAnimalByType(String type);

    List<CountAnimals> getCountAnimals();
}
