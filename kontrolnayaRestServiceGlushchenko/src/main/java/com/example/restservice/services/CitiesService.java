package com.example.restservice.services;

import com.example.restservice.models.City;
import com.example.restservice.repositories.CitiesRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CitiesService {
    @Autowired
    CitiesRepo sitiesrepo;

    public List<City> getAllCities() {
        return sitiesrepo.findAll();
    }

    public City getCity(Integer id) {
        return sitiesrepo.findById(id).get();
    }

    public void save(City city) { sitiesrepo.save(city);}

    public void delete(Integer id) {sitiesrepo.deleteById(id);
    }
}
