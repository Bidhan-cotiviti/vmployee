package com.cotiviti.vemployee.service;

import com.cotiviti.vemployee.dto.EmployeeRequest;
import com.cotiviti.vemployee.model.Employee;
import com.cotiviti.vemployee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewAllEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public com.cotiviti.vemployee.model.Employee addEmployee(EmployeeRequest employeeRequest) {
        //validation
        //mapping
        Employee employee = new Employee();
        employee.setName(employeeRequest.getName());
        employee.setDesignation(employeeRequest.getDesignation());
        employee.setEmail(employeeRequest.getEmail());
        employee.setContact(employeeRequest.getContact());
        employee.setInumber(employeeRequest.getInumber());
        employee.setMobile(employeeRequest.getMobile());
        employee.setReports(employeeRequest.getReports());
        employee.setDepartmentId(employeeRequest.getDepartmentId());
        employee.setManagerId(employeeRequest.getManagerId());

        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

}
