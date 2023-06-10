package com.example.rest.repositories;

import com.example.rest.models.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingRepo extends JpaRepository<Thing, Integer> {
}
