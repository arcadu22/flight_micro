package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;


import com.example.demo.models.Cliente;
import com.example.demo.repositorioes.repositoriesCliente;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.AUTO_CONFIGURED)
// @ContextConfiguration(classes = {AppConfiguration.class})
public class clienteTest extends Exception{

    @Autowired
    private repositoriesCliente repo;

    @Test
    public void guardarCliente(){

        Cliente cris = new Cliente("cristian", "arredondo", 24, "10231456", "cris@gmail.com", "5062134");

        repo.save(cris);

        repo.flush();

        assertEquals(1, repo.findAll().size());

    }
    @Test
    public void borrarCliente(){
        Cliente cris = new Cliente("cristian", "arredondo", 24, "10231456", "cris@gmail.com", "5062134");

        repo.save(cris);

        repo.flush();

        repo.delete(cris);

        assertEquals(0, repo.findAll().size());
    }
   
}