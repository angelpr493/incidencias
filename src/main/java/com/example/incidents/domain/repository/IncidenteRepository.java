package com.example.incidents.domain.repository;

import com.example.incidents.persistence.entity.Incidente;

import java.util.List;

public interface IncidenteRepository {
    List<Incidente> getAll();
    List<Incidente> getByOperator(int id);
    List<Incidente> getByDate(int id);
    List<Incidente> getByStatus(int id);
}
