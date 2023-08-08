package com.cotiviti.vemployee.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DepartmentRequest {
    private String name;
    private String headName;
    private long totalEmployee;
}
