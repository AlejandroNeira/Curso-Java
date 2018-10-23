package com.pizza.pizzanapoleon.Entidad;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Ordenes {
    @Id
    private int idOrden;

    @OneToOne
    @JoinColumn(name = "idcliente")
    private Clientes rutCliente;

    @OneToOne
    @JoinColumn(name = "idpizza")
    private Pizzas idPizza;

    @OneToOne
    @JoinColumn(name = "idusuario")
    private Empleados usuario;

    private Date fecha;
    private int cantidad;


    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Clientes getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Clientes rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Pizzas getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Pizzas idPizza) {
        this.idPizza = idPizza;
    }

    public Empleados getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleados usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
