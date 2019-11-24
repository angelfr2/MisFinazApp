package com.devcoders.project.project.controller;


import com.devcoders.project.project.persistence.model.Categoria;
import com.devcoders.project.project.persistence.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias.")
public class CategoriaController {

    @Autowired
    private ICategoriaRepository repo;

    @GetMapping
    public List<Categoria> listar() {
        return repo.findAll();
    }

    @PostMapping
    public void insertar(@RequestBody Categoria categoria) {
        repo.save(categoria);
    }

    @PutMapping
    public void modificar(@RequestBody Categoria categoria) {
        repo.save(categoria);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }


}
