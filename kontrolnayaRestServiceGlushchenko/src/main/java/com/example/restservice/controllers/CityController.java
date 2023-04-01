package com.example.restservice.controllers;

import com.example.restservice.models.City;
import com.example.restservice.services.CitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    CitiesService CitiesService;

    @GetMapping("")
    public List<City> getAllCities() {
        return CitiesService.getAllCities();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable Integer id) {
        return CitiesService.getCity(id);

    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody City city) {
        CitiesService.save(city);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody City city, @PathVariable Integer id) {
        try {
            CitiesService.getCity(id);
            city.setId(id);
            CitiesService.save(city);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        CitiesService.delete(id);
    }

}

