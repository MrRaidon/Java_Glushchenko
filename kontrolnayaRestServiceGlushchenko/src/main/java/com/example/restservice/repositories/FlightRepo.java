package com.example.restservice.repositories;

import com.example.restservice.models.City;
import com.example.restservice.models.Flight;
import com.example.restservice.models.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepo extends JpaRepository<Flight, Integer> {
    List<Flight> findAllById(Integer id);
}
