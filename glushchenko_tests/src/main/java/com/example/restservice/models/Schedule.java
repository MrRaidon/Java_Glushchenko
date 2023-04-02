package com.example.restservice.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="schedule")
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowId;
    private int testId;
    private int groupId;
    private Integer duration;
    private Date startDate;
    private Time startTime;
    private Date endDate;
    private Time endTime;
    private Boolean active;

}
