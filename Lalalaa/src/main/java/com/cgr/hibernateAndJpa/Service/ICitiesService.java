package com.cgr.hibernateAndJpa.Service;

import com.cgr.hibernateAndJpa.Entities.Cities;

import java.util.List;

public interface ICitiesService {
    List<Cities> getAll();
    void add(Cities cities);
    void update(Cities cities);
    void delete(Cities cities);
    Cities getById(int id);
}
