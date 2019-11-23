package com.devcoders.project.project.persistence.repository;

import com.devcoders.project.project.persistence.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByNombre(String nombre);

}
