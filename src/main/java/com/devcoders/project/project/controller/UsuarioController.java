package com.devcoders.project.project.controller;

import com.devcoders.project.project.persistence.model.Usuario;
import com.devcoders.project.project.persistence.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioRepository repo;

    @GetMapping
    public List<Usuario> listar() {
        return repo.findAll();
    }

    @PostMapping
    public void insertar(@RequestBody Usuario usuario) {
        repo.save(usuario);
    }
}
