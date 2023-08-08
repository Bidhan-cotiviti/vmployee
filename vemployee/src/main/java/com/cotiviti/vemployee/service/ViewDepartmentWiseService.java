package com.cotiviti.vemployee.service;

import com.cotiviti.vemployee.model.Department;
import com.cotiviti.vemployee.model.Employee;
import com.cotiviti.vemployee.repo.DepartmentRepository;
import com.cotiviti.vemployee.repo.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ViewDepartmentWiseService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;



    public List<Employee> getEmployeesByDepartmentName(String departments){
        // Query the database to find the department ID
        Optional<Department>  department = departmentRepository.findByDepartmentName(departments);
        Department departmentId = department.get();

        // Retrieve all employees with the department ID
        return employeeRepository.findByDepartmentId(departmentId.getId());
    }
}
