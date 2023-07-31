package com.cotiviti.vemployee.controllers;


import com.cotiviti.vemployee.dto.Department;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/dashboard")
public class DashBoardController {

    @Autowired
    Faker faker;


    @GetMapping
    public ResponseEntity<?> getDepartment() {
        List<Department> departmentList = new ArrayList<>();

        departmentList.add(Department.builder()
                .departmentName("BI Reporting")
                .departmentHeadName(faker.name().nameWithMiddle())
                .totalEmployee(5)
                .build());

        departmentList.add(Department.builder()
                .departmentName("Engineering")
                .departmentHeadName(faker.name().fullName())
                .totalEmployee(10)
                .build());
        departmentList.add(Department.builder()
                .departmentName("R&D 1")
                .departmentHeadName(faker.name().nameWithMiddle())
                .totalEmployee(5)
                .build());

        departmentList.add(Department.builder()
                .departmentName("R&D 2")
                .departmentHeadName(faker.name().fullName())
                .totalEmployee(10)
                .build());
        departmentList.add(Department.builder()
                .departmentName("R&D 3")
                .departmentHeadName(faker.name().nameWithMiddle())
                .totalEmployee(5)
                .build());

        departmentList.add(Department.builder()
                .departmentName("Operations")
                .departmentHeadName(faker.name().fullName())
                .totalEmployee(10)
                .build());
        departmentList.add(Department.builder()
                .departmentName("IT Service")
                .departmentHeadName(faker.name().nameWithMiddle())
                .totalEmployee(5)
                .build());

        departmentList.add(Department.builder()
                .departmentName("IT Insfranscture")
                .departmentHeadName(faker.name().fullName())
                .totalEmployee(10)
                .build());

        return ResponseEntity.ok(departmentList);
    }
 }
