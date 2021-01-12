package com.mongo.crud.controller;

import com.mongo.crud.model.Relationship;
import com.mongo.crud.repository.RelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CrudController {

    @Autowired
    RelRepo relRepo;

    @GetMapping("/cpName")
    public ResponseEntity<List<Relationship>> getAllCPs(@RequestParam(required = false) String cpName) {

        try {
            List<Relationship> cpList = new ArrayList<Relationship>();
            System.out.println("Hit");
            if (cpName == null)
                relRepo.findAll().forEach(cpList::add);
            else
                relRepo.findByConnPartyName(cpName).forEach(cpList::add);
            System.out.println("CP list: "+ cpList.get(0));
            if (cpList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(cpList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
