package com.example.restservice.repository;

import com.example.restservice.models.TestList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestListRepository extends JpaRepository<TestList, Integer> {
    TestList findTestListByRowId(Integer rowId);
}
