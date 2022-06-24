package com.assigment.assignmentspringboot.controllers;

import com.assigment.assignmentspringboot.entity.Street;
import com.assigment.assignmentspringboot.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.security.util.Debug;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/streets")
@CrossOrigin("*")
public class StreetController {
    @Autowired
    private StreetRepository streetRepository;

    @RequestMapping(method = RequestMethod.GET)

    public ResponseEntity<List<Street>> findAll(@RequestParam(value = "q",required = false) String q,@RequestParam(value = "district_id",required = false) Long district_id) {

        return ResponseEntity.ok(streetRepository.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Street> create(@RequestBody Street street) {
        return ResponseEntity.ok(streetRepository.save(street));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (!streetRepository.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        streetRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @RequestMapping(method = RequestMethod.PUT, path = "{id}")
    public ResponseEntity<Street> update(@PathVariable Long id, @RequestBody Street street) {
        Optional<Street> optionalAccount = streetRepository.findById(id);
        if (!optionalAccount.isPresent()) {
            ResponseEntity.badRequest().build();
        }
        Street existAccount = optionalAccount.get();
        // map object

        return ResponseEntity.ok(streetRepository.save(existAccount));
    }



}
