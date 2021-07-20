package com.example.demo.repositorioes;

import com.example.demo.models.Avion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesAvion  extends CrudRepository<Avion,Long> {
    
}
