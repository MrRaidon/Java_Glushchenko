package com.example.restservice.services;

import com.example.restservice.models.User;
import com.example.restservice.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserSerivce {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> getOnlyTeachers() {
        return userRepository.findUsersByRoleId(2);
    }

    public List<User> getOnlyStudents() {
        return userRepository.findUsersByRoleId(1);
    }

}
