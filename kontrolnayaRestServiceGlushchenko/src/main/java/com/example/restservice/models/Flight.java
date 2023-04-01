package com.example.restservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "flights")
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String aviaName;
    private Date Datetime;
    private Date Duration;

    @ManyToOne
    @JoinColumn(name = "route_id")
    @JsonIgnore
    private Route route;

}
