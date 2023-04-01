package com.example.restservice.controllers;

import com.example.restservice.models.Flight;
import com.example.restservice.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping("")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Integer id) {
        return flightService.getFlight(id);

    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Flight flight) {
        flightService.save(flight);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Flight flight, @PathVariable Integer id) {
        try {
            flightService.getFlight(id);
            flight.setId(id);
            flightService.save(flight);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Flight>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        flightService.delete(id);
    }

}
