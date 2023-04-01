package com.example.restservice.repositories;

import com.example.restservice.models.City;
import com.example.restservice.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitiesRepo extends JpaRepository<City, Integer> {
    List<City> findAllById(Integer id);
}
