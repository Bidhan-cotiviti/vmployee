package com.cotiviti.vemployee.controllers;


import com.cotiviti.vemployee.dto.DepartmentRequest;
import com.cotiviti.vemployee.dto.DepartmentResult;
import com.cotiviti.vemployee.model.Department;
import com.cotiviti.vemployee.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/get")
    public ResponseEntity<List<DepartmentResult>> getAllDepartment() {
        return ResponseEntity.ok(dashboardService.getAllDepartment());
    }

//    @PostMapping("/add")
//    public ResponseEntity<Department> addDepartment(@RequestBody DepartmentRequest departmentRequest) {
//        return ResponseEntity.ok(dashboardService.addDepartment(departmentRequest));
//    }
//        List<Department> departmentList = new ArrayList<>();
//
//        departmentList.add(Department.builder()
//                .departmentName("BI Reporting")
//                .departmentHeadName(faker.name().nameWithMiddle())
//                .totalEmployee(5)
//                .build());
//
//        departmentList.add(Department.builder()
//                .departmentName("Engineering")
//                .departmentHeadName(faker.name().fullName())
//                .totalEmployee(10)
//                .build());
//        departmentList.add(Department.builder()
//                .departmentName("R&D 1")
//                .departmentHeadName(faker.name().nameWithMiddle())
//                .totalEmployee(5)
//                .build());
//
//        departmentList.add(Department.builder()
//                .departmentName("R&D 2")
//                .departmentHeadName(faker.name().fullName())
//                .totalEmployee(10)
//                .build());
//        departmentList.add(Department.builder()
//                .departmentName("R&D 3")
//                .departmentHeadName(faker.name().nameWithMiddle())
//                .totalEmployee(5)
//                .build());
//
//        departmentList.add(Department.builder()
//                .departmentName("Operations")
//                .departmentHeadName(faker.name().fullName())
//                .totalEmployee(10)
//                .build());
//        departmentList.add(Department.builder()
//                .departmentName("IT Service")
//                .departmentHeadName(faker.name().nameWithMiddle())
//                .totalEmployee(5)
//                .build());
//
//        departmentList.add(Department.builder()
//                .departmentName("IT Insfranscture")
//                .departmentHeadName(faker.name().fullName())
//                .totalEmployee(10)
//                .build());
//
//        return ResponseEntity.ok(departmentList);
 }
