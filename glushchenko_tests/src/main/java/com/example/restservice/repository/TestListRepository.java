package com.example.restservice.repository;

import com.example.restservice.models.MassinveTests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestListRepository extends JpaRepository<MassinveTests, Integer> {
    MassinveTests findTestListByRowId(Integer rowId);
}
