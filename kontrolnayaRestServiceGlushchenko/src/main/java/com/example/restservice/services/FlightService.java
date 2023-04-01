package com.example.restservice.services;

import com.example.restservice.models.Flight;
import com.example.restservice.repositories.FlightRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class FlightService {
    @Autowired
    FlightRepo flightRepo;

    public List<Flight> getAllFlights() {
        return flightRepo.findAll();
    }

    public void save(Flight flight) {
        flightRepo.save(flight);
    }

    public Flight getFlight(Integer id) { return flightRepo.findById(id).get();
    }

    public void delete(Integer id) {flightRepo.deleteById(id);
    }
}
