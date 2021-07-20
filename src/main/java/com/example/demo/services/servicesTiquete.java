package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Tiquete;
import com.example.demo.repositorioes.repositoriesTiquete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicesTiquete {
    @Autowired

    repositoriesTiquete tiqueteRepositori;
    
     //Ver todos los Tiquetes
     public ArrayList<Tiquete> obtTiquete(){
        return (ArrayList<Tiquete>) tiqueteRepositori.findAll();
    }

       //Guardar Tiquete
       public Tiquete guardarTiquete(Tiquete tiquete){
        return tiqueteRepositori.save(tiquete);
    }


     //Buscar por ID Tiquete
     public Optional<Tiquete>obtenerId(Long id){
        return tiqueteRepositori.findById(id);
    }

    //Eliminar Tiquete
    public boolean EliminarTiquete(Long id){
        try {
            tiqueteRepositori.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
