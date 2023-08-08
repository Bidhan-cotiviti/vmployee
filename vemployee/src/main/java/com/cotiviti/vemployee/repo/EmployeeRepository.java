package com.cotiviti.vemployee.repo;

import com.cotiviti.vemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByName(String managerName);
    Optional<Employee> findById(Integer id);
    List<Employee> findByManagerId(Integer managerId);

    List<Employee> findByDepartmentId(Integer departmentId);
}
