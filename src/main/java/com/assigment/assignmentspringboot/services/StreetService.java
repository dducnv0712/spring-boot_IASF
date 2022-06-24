package com.assigment.assignmentspringboot.services;

import com.assigment.assignmentspringboot.entity.Street;
import com.assigment.assignmentspringboot.repository.StreetReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreetService {
    @Autowired
    private StreetReponsitory streetReponsitory;

    private List<Street> findAll(){
        return streetReponsitory.findAll();
    }
    private Optional<Street> findById(Long id){
        return streetReponsitory.findById(id);
    }
    private Street save(Street street){
        return streetReponsitory.save(street);
    }
    private Street update(Street street,Long id){
        Optional<Street> streetData = streetReponsitory.findById(id);
        return street;
    }
    private void delete(){

    }
    private void destroy(Long id){
         streetReponsitory.deleteById(id);
    }
}
