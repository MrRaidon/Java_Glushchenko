package com.example.restservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "routes")
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cityFrom")
    @JsonIgnore
    private City cityFrom;

    @ManyToOne
    @JoinColumn(name = "cityTo")
    @JsonIgnore
    private City cityTo;

}
