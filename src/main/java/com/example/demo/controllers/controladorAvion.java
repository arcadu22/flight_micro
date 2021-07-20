package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Avion;
import com.example.demo.services.servicesAvion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avion")
public class controladorAvion {
    @Autowired
    servicesAvion avionServices;
    
    
    @GetMapping()
    public ArrayList<Avion> obtenerAvion() {
        return avionServices.obtAvion();
    }

    @PostMapping()
    public Avion guardarAvion(@RequestBody Avion avion) {
        return this.avionServices.guardarAvion(avion);
    }

    @GetMapping(path ="/{id}")
    public Optional<Avion> obtenerAvionPorId(@PathVariable("id") Long  id) {
        return this.avionServices.obtenerId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.avionServices.EliminarAvion(id);
        if (ok) {
            return "Se elimino el avion con el id "+id;
        } else {
            return "No se pudo eliminar el avion con el id"+id;
        }
    }


}
