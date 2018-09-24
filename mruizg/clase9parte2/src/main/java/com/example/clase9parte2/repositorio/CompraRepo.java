package com.example.clase9parte2.repositorio;

import com.example.clase9parte2.entidad.Compra;
import org.springframework.data.repository.CrudRepository;

public interface CompraRepo extends CrudRepository<Compra, Integer> {

    // esto implementa automaticamente las funciones CRUD



}