package com.example.rest.repositories;

import com.example.rest.models.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepo extends JpaRepository<Storage, Integer> {
}


