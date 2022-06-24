package com.assigment.assignmentspringboot.services;

import com.assigment.assignmentspringboot.entity.Street;
import com.assigment.assignmentspringboot.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreetService {
    @Autowired
    private StreetRepository streetRepository;

    private List<Street> findAll(){
        return streetRepository.findAll();
    }
    private Optional<Street> findById(Long id){
        return streetRepository.findById(id);
    }
    private Street save(Street street){
        return streetRepository.save(street);
    }
    private Street update(Street street,Long id){
        Optional<Street> streetData = streetRepository.findById(id);
        return street;
    }
    private void delete(){

    }
    private void destroy(Long id){
        streetRepository.deleteById(id);
    }
}
