package com.example.rest.repositories;

import com.example.rest.models.Saving;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingRepo extends JpaRepository<Saving, Integer> {
}

