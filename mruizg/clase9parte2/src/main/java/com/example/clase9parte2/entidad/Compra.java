package com.example.clase9parte2.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @Column(name="idcompra")
    private int idCompra;

    @Column(name="nombre")
    private String nombre;

    @Column(name="montounitario")
    private String montoUnitario;

    @Column(name="cantidad")
    private String cantidad;


    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMontoUnitario() {
        return montoUnitario;
    }

    public void setMontoUnitario(String montoUnitario) {
        this.montoUnitario = montoUnitario;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}

