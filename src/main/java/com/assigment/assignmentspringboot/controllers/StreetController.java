package com.assigment.assignmentspringboot.controllers;

import com.assigment.assignmentspringboot.entity.Street;
import com.assigment.assignmentspringboot.repository.StreetReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/streets")
@CrossOrigin("*")
public class StreetController {
    @Autowired
    private StreetReponsitory streetReponsitory;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Street>> findAll() {
        return ResponseEntity.ok(streetReponsitory.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Street> create(@RequestBody Street street) {
        return ResponseEntity.ok(streetReponsitory.save(street));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (!streetReponsitory.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        streetReponsitory.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @RequestMapping(method = RequestMethod.PUT, path = "{id}")
    public ResponseEntity<Street> update(@PathVariable Long id, @RequestBody Street street) {
        Optional<Street> optionalAccount = streetReponsitory.findById(id);
        if (!optionalAccount.isPresent()) {
            ResponseEntity.badRequest().build();
        }
        Street existAccount = optionalAccount.get();
        // map object

        return ResponseEntity.ok(streetReponsitory.save(existAccount));
    }

}
