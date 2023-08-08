package com.cotiviti.vemployee.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name= "Id")
    private Integer id;

    @Column(name= "Name")
    private String name;

    @Column(name = "Designation")
    private String designation;

    @Column(name= "Email")
    private String email;

    @Column(name = "Contact")
    private String contact;

    @Column(name = "Inumber")
    private String inumber;

    @Column(name = "Mobile")
    private String mobile;

    @Column(name = "Image")
    private String image;

    @Column(name = "Reports")
    private String reports;

    @Column(name = "Department_id")
    private int departmentId;

    @Column(name = "Manager_id")
    private Integer managerId;

}
