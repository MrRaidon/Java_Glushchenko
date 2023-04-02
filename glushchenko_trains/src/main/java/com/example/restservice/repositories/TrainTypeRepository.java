package com.example.restservice.repositories;

import com.example.restservice.models.TrainType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainTypeRepository extends JpaRepository<TrainType, Integer> {
}
