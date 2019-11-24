package com.devcoders.project.project.controller;


import com.devcoders.project.project.persistence.model.Categoria;
import com.devcoders.project.project.persistence.model.Registro;
import com.devcoders.project.project.persistence.repository.IRegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registros.")
public class RegistroController {

    @Autowired
    private IRegistroRepository repo;


    @GetMapping
    public List<Registro> listar() {
        return repo.findAll();
    }

    @PostMapping
    public void insertar(@RequestBody Registro registro) {
        repo.save(registro);
    }

    @PutMapping
    public void modificar(@RequestBody Registro registro) {
        repo.save(registro);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }



}
