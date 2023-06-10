package com.example.rest.models;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Saving {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "thing")
    private Thing thing;

    @ManyToOne
    @JoinColumn(name = "storage")
    private Storage storage;

    private Date storageDate;

    private Integer kolvo;

}
