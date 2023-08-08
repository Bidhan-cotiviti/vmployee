package com.cotiviti.vemployee.repo;

import com.cotiviti.vemployee.dto.DepartmentResult;
import com.cotiviti.vemployee.model.Department;
import com.cotiviti.vemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


//@Repository
//public interface DepartmentRepository extends JpaRepository<Department, Integer> {
//
//    @Query("SELECT d.departmentName, d.departmentHeadName, COUNT(e) AS totalEmployee FROM Department d LEFT JOIN Employee e ON d.id = e.departmentId GROUP BY d.id")
//    List<Department> findAll();
//}

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {


    @Query("SELECT d.departmentName AS departmentName, d.departmentHeadName AS departmentHeadName, COUNT(e) AS totalEmployee FROM Department d LEFT JOIN Employee e ON d.id = e.departmentId GROUP BY d.id")
    List<DepartmentResult> findAllWithTotalEmployees();

    @Query(value = "SELECT d FROM Department d where d.departmentName = :departmentName")
    Optional<Department> findByDepartmentName(@Param("departmentName") String departmentName);


}