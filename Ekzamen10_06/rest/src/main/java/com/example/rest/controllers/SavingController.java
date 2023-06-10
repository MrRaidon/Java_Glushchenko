package com.example.rest.controllers;

import com.example.rest.models.Saving;
import com.example.rest.services.SavingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/saving")
public class SavingController {
    @Autowired
    SavingService savingService;

    @GetMapping("")
    public List<Saving> getAllSaving() {
        return savingService.getAllSaving();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Saving> getSavingById(@PathVariable Integer id) {
        try{
            Saving saving = savingService.getSavingById(id);
            return new ResponseEntity<>(saving, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public void addSaving(@RequestBody Saving saving){
        savingService.create(saving);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSaving(@PathVariable Integer id, @RequestBody Saving saving){
       try {
           savingService.update(saving, id);
           return new ResponseEntity<>(HttpStatus.OK);
       }
       catch (NoSuchElementException e){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @DeleteMapping("/{id}")
    public void deleteSaving(@PathVariable Integer id){
        savingService.delete(id);
    }

}
