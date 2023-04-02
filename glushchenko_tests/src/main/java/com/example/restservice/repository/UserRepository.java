package com.example.restservice.repository;

import com.example.restservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUsersByRoleId(Integer roleId);
}
