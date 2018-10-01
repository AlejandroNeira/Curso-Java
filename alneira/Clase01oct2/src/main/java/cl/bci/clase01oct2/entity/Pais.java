package cl.bci.clase01oct2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "paises")
public class Pais {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private int idPais;

    @Column(name = "nombre", length = 200)
    @Transient
    private  String nombre;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_continente")
    private Continente continente;
}
