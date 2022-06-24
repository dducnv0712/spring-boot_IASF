package com.assigment.assignmentspringboot.repository;

import com.assigment.assignmentspringboot.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street, Long> {
    public Street findByName(String name);
    public Street findByDistrict(String district);
}
