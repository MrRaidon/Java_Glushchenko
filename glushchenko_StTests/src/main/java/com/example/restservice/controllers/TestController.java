package com.example.restservice.controllers;

import com.example.restservice.models.TestList;
import com.example.restservice.schemas.ResultsFieldComposition;
import com.example.restservice.services.TestListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestListService testListService;


    @GetMapping("/list")
    public List<TestList> allTests() {
        return testListService.allTestLists();
    }

    @GetMapping("/NextTest/{student_id}")
    public List<TestList> getNextTestsForStudent(@PathVariable Integer student_id) {
        return testListService.getTestsListByStudent(student_id);

    }
    @GetMapping("/results")
    public List<ResultsFieldComposition> getResultsForStudents() {
        return testListService.getResultsForStudents();

    }
}
