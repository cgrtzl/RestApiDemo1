package com.cgr.hibernateAndJpa.DataAccess;

import com.cgr.hibernateAndJpa.Entities.Cities;

import java.util.List;

public interface ICitiesDal {
    List<Cities> getAll();
    void add(Cities cities);
    void update(Cities cities);
    void delete(Cities cities);
    Cities getById(int id);
}
