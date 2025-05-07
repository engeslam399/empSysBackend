package com.egomaa.ems.bussiness.useCase;

import com.egomaa.ems.bussiness.model.EmployeeDto;
import com.egomaa.ems.bussiness.service.EmployeeService;
import com.fasterxml.jackson.databind.JsonMappingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeUseeCaseImpl implements EmployeeUseeCase{


    private final EmployeeService employeeService;

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
        return employeeService.updateEmployee(employeeDto);
    }


    @Override
    public EmployeeDto patchEmployee(Long id, Map<String, Object> updates) throws JsonMappingException {
        return employeeService.patchEmployee(id,updates);
    }
}
