package com.example.rest.controllers;

import com.example.rest.models.Thing;
import com.example.rest.services.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/thing")
public class ThingController {
    @Autowired
    ThingService thingService;

    @GetMapping("")
    public List<Thing> getAllThings() {
        return thingService.getAllThings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Thing> getThingById(@PathVariable Integer id) {
        try{
            Thing thing = thingService.getThingById(id);
            return new ResponseEntity<>(thing, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public void addThing(@RequestBody Thing thing){
        thingService.create(thing);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateThing(@PathVariable Integer id, @RequestBody Thing thing){
       try {
           thingService.update(thing, id);
           return new ResponseEntity<>(HttpStatus.OK);
       }
       catch (NoSuchElementException e){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @DeleteMapping("/{id}")
    public void deleteThing(@PathVariable Integer id){
        thingService.delete(id);
    }

}
