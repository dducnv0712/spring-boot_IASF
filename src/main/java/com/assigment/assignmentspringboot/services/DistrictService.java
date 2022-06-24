package com.assigment.assignmentspringboot.services;

import com.assigment.assignmentspringboot.entity.District;
import com.assigment.assignmentspringboot.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;
    private List<District> findAll(){
        return districtRepository.findAll();
    }
    private District save(District street){
        return districtRepository.save(street);
    }

}
