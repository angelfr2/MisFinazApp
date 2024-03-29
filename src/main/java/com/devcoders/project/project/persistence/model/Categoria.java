package com.devcoders.project.project.persistence.model;

import javax.persistence.*;

@Entity(name = "Categoria")
@NamedQuery(name = "Categoria.findByNombre", query = "SELECT categoria FROM Categoria categoria WHERE categoria.nombre = :nombre")
public class Categoria {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
