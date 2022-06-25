package com.assigment.assignmentspringboot.services;

import com.assigment.assignmentspringboot.entity.District;
import com.assigment.assignmentspringboot.entity.Employee;
import com.assigment.assignmentspringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    private List<Employee> findAll(){
        return employeeRepository.findAll();
    }
    private Employee save(Employee street){
        return employeeRepository.save(street);
    }
}
