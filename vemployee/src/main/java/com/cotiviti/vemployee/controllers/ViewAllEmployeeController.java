package com.cotiviti.vemployee.controllers;

import com.cotiviti.vemployee.dto.EmployeeRequest;
import com.cotiviti.vemployee.model.Employee;
import com.cotiviti.vemployee.service.ViewAllEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/employee")
public class ViewAllEmployeeController {

    @Autowired
    private ViewAllEmployeeService viewAllEmployeeService;

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        return ResponseEntity.ok(viewAllEmployeeService.getAllEmployee());
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return ResponseEntity.ok(viewAllEmployeeService.addEmployee(employeeRequest));
    }
}
