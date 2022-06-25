package com.assigment.assignmentspringboot.controllers;

import com.assigment.assignmentspringboot.entity.District;
import com.assigment.assignmentspringboot.entity.Employee;
import com.assigment.assignmentspringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> findAllEmployees(@RequestParam(value = "q",required = false) String q) {
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employee> createEmployees(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeRepository.save(employee));
    }
}
