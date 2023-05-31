package com.example.rest.repositories;

import com.example.rest.models.AdditionalService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ASRepo extends JpaRepository<AdditionalService, Integer> {
}
