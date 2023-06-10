package com.example.rest.services;

import com.example.rest.models.Thing;
import com.example.rest.repositories.ThingRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ThingService {
    @Autowired
    ThingRepo thingRepo;

    public List<Thing> getAllThings() {
        return thingRepo.findAll();
    }

    public Thing getThingById(Integer id) {
        return thingRepo.findById(id).get();
    }

    public void create(Thing thing) {
        thingRepo.save(thing);
    }

    public void update(Thing thing, Integer id) {
        Thing thingToUpdate = thingRepo.findById(id).get();
        if (thing.getThingType() != null) {
            thingToUpdate.setThingType(thing.getThingType());
        }
        if (thing.getThingNumber() != null) {
            thingToUpdate.setThingNumber(thing.getThingNumber());
        }

        thingRepo.save(thingToUpdate);

    }

    public void delete(Integer id) {
        thingRepo.deleteById(id);
    }

}
