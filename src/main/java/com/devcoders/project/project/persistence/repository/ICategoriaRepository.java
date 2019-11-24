package com.devcoders.project.project.persistence.repository;

import com.devcoders.project.project.persistence.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {

    Categoria findByNombre(String nombre);

}
