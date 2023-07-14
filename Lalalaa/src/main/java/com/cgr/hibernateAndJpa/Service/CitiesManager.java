package com.cgr.hibernateAndJpa.Service;

import com.cgr.hibernateAndJpa.DataAccess.ICitiesDal;
import com.cgr.hibernateAndJpa.Entities.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CitiesManager implements ICitiesService{

    private ICitiesDal citiesDal;

    @Autowired
    public CitiesManager(ICitiesDal citiesDal) {
        this.citiesDal = citiesDal;
    }

    @Override
    @Transactional
    public List<Cities> getAll() {
        return this.citiesDal.getAll();
    }

    @Override
    @Transactional
    public void add(Cities cities) {
        this.citiesDal.add(cities);
    }

    @Override
    @Transactional
    public void update(Cities cities) {
        this.citiesDal.update(cities);
    }

    @Override
    @Transactional
    public void delete(Cities cities) {
        this.citiesDal.delete(cities);
    }

    @Override
    @Transactional
    public Cities getById(int id) {
        return this.citiesDal.getById(id);
    }
}
