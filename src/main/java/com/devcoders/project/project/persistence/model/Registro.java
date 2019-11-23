package com.devcoders.project.project.persistence.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name="categoria",referencedColumnName="id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name="usuario",referencedColumnName="id")
    private Usuario usuario;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "fechaRegistro")
    private Date fechaRegistro;


}
