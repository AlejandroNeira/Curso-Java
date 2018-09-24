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
    private int montoUnitario;

    @Column(name="cantidad")
    private int cantidad;


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

    public int getMontoUnitario() {
        return montoUnitario;
    }

    public void setMontoUnitario(int montoUnitario) {
        this.montoUnitario = montoUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

