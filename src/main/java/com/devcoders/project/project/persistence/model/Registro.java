package com.devcoders.project.project.persistence.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "Registro")
@NamedQuery(name = "Registro.findById", query = "SELECT i FROM Registro i WHERE i.id = :id")
public class Registro {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name="categoria", referencedColumnName="id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name="usuario", referencedColumnName="id")
    private Usuario usuario;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "fechaRegistro")
    private Date fechaRegistro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
