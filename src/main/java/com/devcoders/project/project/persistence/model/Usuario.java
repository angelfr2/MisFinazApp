package com.devcoders.project.project.persistence.model;

import javax.persistence.*;

@Entity(name = "Usuario")
@NamedQuery(name = "Usuario.findByNombre", query = "SELECT usuario FROM Usuario usuario WHERE usuario.nombre = :nombre")
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "clave")
    private String clave;

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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
