package com.assigment.assignmentspringboot.controllers;

import com.assigment.assignmentspringboot.entity.District;
import com.assigment.assignmentspringboot.entity.Street;
import com.assigment.assignmentspringboot.repository.DistrictRepository;
import com.assigment.assignmentspringboot.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/districts")
@CrossOrigin("*")
public class DistrictController {
    @Autowired
    private DistrictRepository districtRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<District>> findAll() {
        return ResponseEntity.ok(districtRepository.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<District> create(@RequestBody District district) {
        return ResponseEntity.ok(districtRepository.save(district));
    }
}
