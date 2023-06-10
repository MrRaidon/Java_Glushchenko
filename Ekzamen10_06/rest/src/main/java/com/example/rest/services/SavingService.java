package com.example.rest.services;

import com.example.rest.models.Saving;
import com.example.rest.repositories.SavingRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SavingService {
    @Autowired
    SavingRepo savingRepo;

    public List<Saving> getAllSaving() {
        return savingRepo.findAll();
    }

    public Saving getSavingById(Integer id) {
        return savingRepo.findById(id).get();
    }

    public void create(Saving saving) {
        savingRepo.save(saving);
    }

    public void update(Saving saving, Integer id) {
        Saving savingToUpdate = savingRepo.findById(id).get();
        if (saving.getThing() != null) {
            savingToUpdate.setThing(saving.getThing());
        }
        if (saving.getStorage() != null) {
            savingToUpdate.setStorage(saving.getStorage());
        }
        if (saving.getStorageDate() != null) {
            savingToUpdate.setStorageDate(saving.getStorageDate());
        }
        if (saving.getKolvo() != null) {
            savingToUpdate.setKolvo(saving.getKolvo());
        }
        savingRepo.save(savingToUpdate);

    }

    public void delete(Integer id) {
        savingRepo.deleteById(id);
    }

}
