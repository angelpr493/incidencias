package com.example.incidents.web.controller;

import com.example.incidents.domain.service.OperadorService;
import com.example.incidents.persistence.entity.Operador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/operador")
public class OperadorController {

    @Autowired
    private OperadorService operadorService;

    @GetMapping("/todos")
    public ResponseEntity<List<Operador>> getAll(){
        return new ResponseEntity<>(operadorService.getAll(), HttpStatus.OK);
    }
}
