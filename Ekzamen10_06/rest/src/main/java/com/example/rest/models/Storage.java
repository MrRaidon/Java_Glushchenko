package com.example.rest.models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

}
