package cl.bci.clase01oct2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cajas")
public class Caja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idCaja;

    @Column(name = "alto")
    private  int alto;

    @Column(name = "ancho")
    private  int ancho;

    @Column(name = "largo")
    private  int largo;

    @Column(name = "nombre")
    private  String nombre;
}
