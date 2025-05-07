package com.egomaa.ems.bussiness.useCase;

import com.egomaa.ems.bussiness.model.EmployeeDto;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.util.List;
import java.util.Map;

public interface EmployeeUseeCase {

    List<EmployeeDto> getAllEmployees();


    EmployeeDto updateEmployee(EmployeeDto employeeDto);

    EmployeeDto patchEmployee(Long id, Map<String, Object> updates) throws JsonMappingException;
}
