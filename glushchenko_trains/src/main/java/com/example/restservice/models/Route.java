package com.example.restservice.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="routes")
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="train")
    private Train train;

    private Date departureTime;
    private Date arrivalTime;

    @ManyToOne
    @JoinColumn(name="cityFrom")
    private City departure;

    @ManyToOne
    @JoinColumn(name="cityTo")
    private City destination;

}
