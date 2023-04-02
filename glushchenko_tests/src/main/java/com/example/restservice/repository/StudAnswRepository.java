package com.example.restservice.repository;

import com.example.restservice.models.AnswerByStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudAnswRepository extends JpaRepository<AnswerByStudent, Integer> {
    List<AnswerByStudent> findAllByUserId(Integer user_id);
}
