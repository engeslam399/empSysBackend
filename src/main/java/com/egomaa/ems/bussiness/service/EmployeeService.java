package com.egomaa.ems.bussiness.service;

import com.egomaa.ems.bussiness.mapper.EmployeeMapper;
import com.egomaa.ems.bussiness.model.EmployeeDto;
import com.egomaa.ems.persistence.repo.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;


    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll().stream().map(employeeMapper::toDto).toList();
    }



}
