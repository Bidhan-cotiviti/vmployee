package com.cotiviti.vemployee.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Department {

    private String departmentName;
    //private Employee employee;
    private String departmentHeadName;
    private Integer totalEmployee;
}
