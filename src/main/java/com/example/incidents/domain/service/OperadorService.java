package com.example.incidents.domain.service;

import com.example.incidents.persistence.entity.Operador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperadorService {

    @Autowired
    private OperadorService operadorService;

    public List<Operador> getAll(){
        return operadorService.getAll();
    }

    public Operador save(Operador operador){
        return operadorService.save(operador);
    }
}
