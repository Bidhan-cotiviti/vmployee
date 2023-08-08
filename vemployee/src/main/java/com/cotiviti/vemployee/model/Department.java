package com.cotiviti.vemployee.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;



@Getter
@Setter
@Entity
@Table(name= "department")
public class Department {


    @Id
    @Column(name= "Id")
    private Integer id;

    @Column(name="DepartmentName")
    private String departmentName;

    @Column(name="DepartmentHeadName")
    private String departmentHeadName;

}
