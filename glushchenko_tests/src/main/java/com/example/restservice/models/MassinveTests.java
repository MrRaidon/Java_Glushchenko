package com.example.restservice.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="test_list")
@Data
public class MassinveTests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowId;
    private String name;
    private Integer subjectId;
    private Integer teacherId;

}
