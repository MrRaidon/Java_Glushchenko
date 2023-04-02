package com.example.restservice.repository;

import com.example.restservice.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Answer findAnswerByRowId(Integer rowId);
}
