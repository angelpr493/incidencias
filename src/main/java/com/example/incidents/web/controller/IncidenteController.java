package com.example.incidents.web.controller;

import com.example.incidents.domain.service.IncidenteService;
import com.example.incidents.persistence.entity.Incidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/incidente")
public class IncidenteController {

    @Autowired
    private IncidenteService incidenteService;

    @GetMapping("/todos")
    public ResponseEntity<List<Incidente>> getAll(){
        return new ResponseEntity<>(incidenteService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/porOperador/{id}")
    public ResponseEntity<List<Incidente>> getByOperator(@PathVariable("id") int id){
        return new ResponseEntity<>(incidenteService.getByOperator(id), HttpStatus.OK);
    }


}
