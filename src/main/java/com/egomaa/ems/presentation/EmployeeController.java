package com.egomaa.ems.presentation;

import com.egomaa.ems.bussiness.model.EmployeeDto;
import com.egomaa.ems.bussiness.useCase.EmployeeUseeCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeUseeCase employeeUseeCase;

    @GetMapping("/list")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        return new ResponseEntity<>(employeeUseeCase.getAllEmployees(), HttpStatus.OK);
    }



}
