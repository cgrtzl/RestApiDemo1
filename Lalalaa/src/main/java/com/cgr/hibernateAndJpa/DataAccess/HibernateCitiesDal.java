package com.cgr.hibernateAndJpa.DataAccess;

import com.cgr.hibernateAndJpa.Entities.Cities;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HibernateCitiesDal implements ICitiesDal{

    private EntityManager entityManager;
    @Autowired
    public HibernateCitiesDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Cities> getAll() {
        Session session =entityManager.unwrap(Session.class);
        List<Cities> cities = session.createQuery("from Cities",Cities.class).getResultList();
        return cities;
    }

    @Override
    public void add(Cities cities) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(cities);
    }

    @Override
    public void update(Cities cities) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(cities);
    }

    @Override
    public void delete(Cities cities) {
        Session session = entityManager.unwrap(Session.class);
        Cities citiesToDelete = session.get(Cities.class, cities.getId());
        session.delete(citiesToDelete);
    }

    @Override
    public Cities getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Cities cities = session.get(Cities.class, id);
        return cities;
    }
}
