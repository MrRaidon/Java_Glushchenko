package com.example.rest.services;

import com.example.rest.models.Storage;
import com.example.rest.repositories.StorageRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StorageService {
    @Autowired
    StorageRepo storageRepo;

    public List<Storage> getAllStorages() {
        return storageRepo.findAll();
    }

    public Storage getStorageById(Integer id) {
        return storageRepo.findById(id).get();
    }

    public void create(Storage storage) {
        storageRepo.save(storage);
    }

    public void update(Storage storage, Integer id) {
        Storage storageToUpdate = storageRepo.findById(id).get();
        if (storage.getName() != null) {
            storageToUpdate.setName(storage.getName());
        }
        storageRepo.save(storageToUpdate);

    }

    public void delete(Integer id) {
        storageRepo.deleteById(id);
    }

}
