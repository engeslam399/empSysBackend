package com.egomaa.ems.presentation;

import com.egomaa.ems.bussiness.model.EmployeeDto;
import com.egomaa.ems.bussiness.useCase.EmployeeUseeCase;
import com.fasterxml.jackson.databind.JsonMappingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeUseeCase employeeUseeCase;

    @GetMapping("/list")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        return new ResponseEntity<>(employeeUseeCase.getAllEmployees(), HttpStatus.OK);
    }

    @PutMapping("/put")
    public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeUseeCase.updateEmployee(employeeDto), HttpStatus.OK);
    }

    @PatchMapping("/patch/{id}")
    public ResponseEntity<EmployeeDto> patchEmployee(@PathVariable("id") Long id,
                                                      @RequestBody Map<String, Object> updates) throws JsonMappingException {
        return new ResponseEntity<>(employeeUseeCase.patchEmployee(id, updates), HttpStatus.OK);
    }

}
