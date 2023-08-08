package com.cotiviti.vemployee.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class EmployeeRequest {

    private String name;
    private String designation;
    private String email;
    private String contact;
    private String inumber;
    private String mobile;
    private String reports;
    private int departmentId;
    private int managerId;
}
