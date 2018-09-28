package cl.bci.clase28sep.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Pelicula {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idPelicula;
    private String titulo;
    private int precio;
    private String imagen;

}
