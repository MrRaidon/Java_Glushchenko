package com.example.restservice.controllers;

import com.example.restservice.models.Train;
import com.example.restservice.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/restservice")
public class TrainController {
    @Autowired
    TrainService trainService;

    @GetMapping("")
    public List<Train> getAllrestservice() {
        return trainService.getAllTrains();
    }

    @GetMapping("/{id}")
    public Train getTrainById(@PathVariable Integer id) {
        return trainService.getTrain(id);

    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Train train) {
        trainService.save(train);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Train train, @PathVariable Integer id) {
        try {
            trainService.getTrain(id);
            train.setId(id);
            trainService.save(train);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Train>(HttpStatus.NOT_FOUND);
        }
    }

}
