package com.example.restservice.repositories;

import com.example.restservice.models.City;
import com.example.restservice.models.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoutesRepo extends JpaRepository<Route, Integer> {
    List<Route> findAllById(Integer id);
}
