package com.egomaa.ems.bussiness.useCase;

import com.egomaa.ems.bussiness.model.EmployeeDto;
import com.egomaa.ems.bussiness.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeUseeCaseImpl implements EmployeeUseeCase{


    private final EmployeeService employeeService;

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }




}
