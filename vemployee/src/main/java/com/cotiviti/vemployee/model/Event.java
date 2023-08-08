package com.cotiviti.vemployee.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name= "event")
public class Event {

    @Id
    @GeneratedValue
    @Column(name="Id")
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name="Description")
    private String description;

    @Column(name="Organizer")
    private String organizer;

//    @DateTimeFormat(pattern="dd/MM/yyyy")
    @Column(name="Date")
    private String date;
}
