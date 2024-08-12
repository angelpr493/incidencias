package com.example.incidents.domain.service;


import com.example.incidents.domain.repository.IncidenteRepository;
import com.example.incidents.persistence.entity.Incidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidenteService {

    @Autowired
    private IncidenteRepository incidenteRepository;

    public List<Incidente> getAll(){
        return incidenteRepository.getAll();
    }

    public List<Incidente> getByOperator(int id){
        return incidenteRepository.getByOperator(id);
    }

}
