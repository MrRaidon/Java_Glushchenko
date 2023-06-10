package com.example.rest.controllers;

import com.example.rest.models.Storage;
import com.example.rest.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    StorageService storageService;

    @GetMapping("")
    public List<Storage> getAllStorage() {
        return storageService.getAllStorages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Storage> getStorageById(@PathVariable Integer id) {
        try{
            Storage storage = storageService.getStorageById(id);
            return new ResponseEntity<>(storage, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public void addStorage(@RequestBody Storage storage){
        storageService.create(storage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStorage(@PathVariable Integer id, @RequestBody Storage storage){
       try {
           storageService.update(storage, id);
           return new ResponseEntity<>(HttpStatus.OK);
       }
       catch (NoSuchElementException e){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @DeleteMapping("/{id}")
    public void deleteStorage(@PathVariable Integer id){
        storageService.delete(id);
    }

}
