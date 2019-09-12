package com.lambdaschool.zoos.service;

import com.lambdaschool.zoos.model.Zoo;
import com.lambdaschool.zoos.view.JustTheCount;

import java.util.ArrayList;

public interface ZooService
{
    ArrayList<Zoo> findAll();

    Zoo findZooById(long id);

    Zoo findZooByName(String name);

    void delete(long id);

    Zoo save(Zoo zoo);

    Zoo update(Zoo zoo, long id);
}
