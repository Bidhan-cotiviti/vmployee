package com.cotiviti.vemployee.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Employee {
    private String name;
    private String designation;
    private String email;
    private String contact;
    private String iNumber;
    private String mobileNumber;
    private String skypeId;
    private List<Employee> subordinates;
    private Employee manager;

}
