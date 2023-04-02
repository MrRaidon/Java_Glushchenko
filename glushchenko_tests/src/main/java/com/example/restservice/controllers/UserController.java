package com.example.restservice.controllers;

import com.example.restservice.models.User;
import com.example.restservice.services.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserSerivce userSerivce;

    @GetMapping("")
    public List<User> allUsers() {
        return userSerivce.getAllUsers();
    }
    @GetMapping("/teachers")
    public List<User> onlyTeachers() {
        return userSerivce.getOnlyTeachers();
    }
    @GetMapping("/students")
    public List<User> onlyStudents() {
        return userSerivce.getOnlyStudents();
    }

}
