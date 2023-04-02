package com.example.restservice.schemas;

import com.example.restservice.models.TestList;
import com.example.restservice.models.User;

import java.util.HashMap;

public class ResultsFieldComposition {
    public User student;
    public HashMap<TestList, Integer> BallsByTest;

}
