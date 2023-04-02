package com.example.restservice.services;

import com.example.restservice.models.*;
import com.example.restservice.repository.*;
import com.example.restservice.schemas.ResultsByStudents;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class TestListService {
    @Autowired
    TestListRepository testListRepository;
    @Autowired
    ScheduleRepository scheduleRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    StudAnswRepository studAnswRepository;
    @Autowired
    AnswerRepository answerRepository;

    public List<MassinveTests> allTestLists() {
        return testListRepository.findAll();
    }

    public List<MassinveTests> getTestsListByStudent(Integer student_id) {
        User user = userRepository.findById(student_id).get();
        List<Schedule> schedules = scheduleRepository.findAllByGroupId(user.getGroupId());
        List<MassinveTests> tests = new ArrayList<>();
        for (Schedule sc : schedules) {
            MassinveTests t = testListRepository.findById(sc.getTestId()).get();
            tests.add(t);
        }
        return tests;
    }

    public List<ResultsByStudents> getResultsForStudents() {
        List<ResultsByStudents> results = new ArrayList<>();
        List<User> students = userRepository.findUsersByRoleId(1);
        for (User u : students) {
            ResultsByStudents temp = new ResultsByStudents();
            temp.student = u;
            temp.Points = new HashMap<>();
            List<AnswerByStudent> answers = studAnswRepository.findAllByUserId(u.getRowId());
            for (AnswerByStudent ans : answers) {
                MassinveTests t = testListRepository.findTestListByRowId(ans.getTestId());
                Answer a = answerRepository.findAnswerByRowId(ans.getAnswerId());
                if (!temp.Points.containsKey(t)) {
                    temp.Points.put(t, 0);
                }
                if (a.getCorrect()) {
                    temp.Points.put(t, temp.Points.get(t) + 1);
                }
            }
            results.add(temp);
        }
        return results;
    }
}
