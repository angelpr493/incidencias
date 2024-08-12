package com.example.incidents.domain.repository;

import com.example.incidents.persistence.entity.Operador;

import java.util.List;

public interface OperadorRepository {
    List<Operador> getAll();
    Operador save(Operador operador);
}
