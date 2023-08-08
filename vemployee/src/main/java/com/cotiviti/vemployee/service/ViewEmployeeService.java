package com.cotiviti.vemployee.service;

import com.cotiviti.vemployee.model.Employee;
import com.cotiviti.vemployee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ViewEmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public ViewEmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployeesByManagerName(String managerName) {
        // Query the database to find the manager's ID
        Integer managerId = employeeRepository.findByName(managerName)
                .map(Employee::getId)
                .orElse(null);

        // If managerId is null, the manager doesn't exist, or there are no employees with this manager
        if (managerId == null) {
            return Collections.emptyList();
        }

        // Retrieve all employees with the manager's ID
        return employeeRepository.findByManagerId(managerId);
    }

    public Optional<Employee> getManagerByName(String managerName) {
        // Query the database to find the manager by name
        return employeeRepository.findByName(managerName);
    }
}
