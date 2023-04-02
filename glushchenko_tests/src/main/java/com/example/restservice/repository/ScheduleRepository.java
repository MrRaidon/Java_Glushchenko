package com.example.restservice.repository;

import com.example.restservice.models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
    List<Schedule> findAllByGroupId(Integer group_id);
}
