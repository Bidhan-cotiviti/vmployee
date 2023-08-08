package com.cotiviti.vemployee.controllers;

import com.cotiviti.vemployee.model.Employee;
import com.cotiviti.vemployee.service.ViewDepartmentWiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DepartmentWiseController {

    private ViewDepartmentWiseService viewDepartmentWiseService;

    @Autowired
    public DepartmentWiseController(ViewDepartmentWiseService viewDepartmentWiseService) {
        this.viewDepartmentWiseService = viewDepartmentWiseService;
    }

    @GetMapping("/departmentwise")
    public ResponseEntity<List<Employee>> getAllEmployee(@RequestParam String department) {
        return ResponseEntity.ok(viewDepartmentWiseService.getEmployeesByDepartmentName(department));
    }
}
