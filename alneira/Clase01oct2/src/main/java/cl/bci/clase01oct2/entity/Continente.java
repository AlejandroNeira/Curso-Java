package cl.bci.clase01oct2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "continentes")
public class Continente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_continente")
    private int idContinente;

    @Column(name = "nombre", length = 200)
    private  String nombre;
}
