package com.cotiviti.vemployee.service;

import com.cotiviti.vemployee.dto.DepartmentRequest;
import com.cotiviti.vemployee.dto.DepartmentResult;
import com.cotiviti.vemployee.model.Department;
import com.cotiviti.vemployee.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    @Autowired
    private DepartmentRepository departmentRepository;

//    public com.cotiviti.vemployee.model.Department addDepartment(DepartmentRequest departmentRequest) {
//        //validation
//        //mapping
//        Department department = new Department();
//        department.setDepartmentName(departmentRequest.getName());
//        department.setDepartmentHeadName(departmentRequest.getHeadName());
//        department.setTotalEmployee(departmentRequest.getTotalEmployee());
////        department.setCreatedDate();
////
////        return departmentRepository.save(department);
////    }

    public List<DepartmentResult> getAllDepartment() {
        return departmentRepository.findAllWithTotalEmployees();
    }
}
