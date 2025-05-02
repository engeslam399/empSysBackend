package com.egomaa.ems.bussiness.model;

import com.egomaa.ems.persistence.domain.Department;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Double employeeSalary;

    private DepartmentDto department;

}
