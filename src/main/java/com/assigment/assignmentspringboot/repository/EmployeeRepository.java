package com.assigment.assignmentspringboot.repository;

import com.assigment.assignmentspringboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
