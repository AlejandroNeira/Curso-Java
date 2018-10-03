package cl.bci.clase03oct.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;

    @ManyToOne
    @JoinColumn(name = "idproductofk")
    private Producto producto;

    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    @JsonIgnore
    private  Cliente cliente;

}
