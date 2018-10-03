package cl.bci.clase03oct.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    private String nombre;

    @OneToMany(mappedBy = "cliente") // mappedBy es el campo que se colocara en venta
    //@JsonIgnore
    private List<Venta> ventas;
}
