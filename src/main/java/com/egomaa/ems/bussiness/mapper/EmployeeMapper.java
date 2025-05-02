package com.egomaa.ems.bussiness.mapper;

import com.egomaa.ems.bussiness.model.EmployeeDto;
import com.egomaa.ems.persistence.domain.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends CommonMapper<EmployeeDto, Employee> {


    @Mapping(source = "salary",target = "employeeSalary")
    @Mapping(source = "department.name",target = "department.departmentName")
    @Override
    EmployeeDto toDto(Employee entity);
}
