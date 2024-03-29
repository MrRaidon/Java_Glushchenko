package com.example.restservice.repository;

import com.example.restservice.models.StudAnsw;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudAnswRepository extends JpaRepository<StudAnsw, Integer> {
    List<StudAnsw> findAllByUserId(Integer user_id);
}
