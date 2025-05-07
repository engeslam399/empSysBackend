package com.egomaa.ems.bussiness.mapper;

import com.egomaa.ems.bussiness.model.EmployeeDto;
import com.egomaa.ems.persistence.domain.Employee;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface EmployeeMapper extends CommonMapper<EmployeeDto, Employee> {

}
