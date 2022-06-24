package com.assigment.assignmentspringboot.repository;

import com.assigment.assignmentspringboot.entity.District;
import com.assigment.assignmentspringboot.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository  extends JpaRepository<District, Long> {
}
