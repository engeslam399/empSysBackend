package com.egomaa.ems.bussiness.service;

import com.egomaa.ems.bussiness.mapper.EmployeeMapper;
import com.egomaa.ems.bussiness.model.EmployeeDto;
import com.egomaa.ems.persistence.domain.Employee;
import com.egomaa.ems.persistence.repo.EmployeeRepository;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    private final ObjectMapper objectMapper;



    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll().stream().map(employeeMapper::toDto).toList();
    }

    public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.toEntity(employeeDto);
        employeeRepository.save(employee);
        return employeeDto;
    }

    public EmployeeDto patchEmployee(Long id, Map<String, Object> updates) throws JsonMappingException {
        Employee employee = employeeRepository.findById(id).orElseThrow(()->new RuntimeException("employee not found"));
        Employee updatedEmployee = objectMapper.updateValue(employee, updates);
        employeeRepository.save(updatedEmployee);
        return employeeMapper.toDto(updatedEmployee);
    }




}
