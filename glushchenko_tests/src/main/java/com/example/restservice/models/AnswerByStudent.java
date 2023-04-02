package com.example.restservice.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="AnswerByStudent")
@Data
public class AnswerByStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowId;
    private int testId;
    private int userId;
    private int answerId;
}
