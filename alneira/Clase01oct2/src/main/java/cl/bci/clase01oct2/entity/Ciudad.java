package cl.bci.clase01oct2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ciudades")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    private int idCiudad;

    @Column(name = "nombre", length = 200)
    private  String nombre;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pais")
    private Pais pais;

}
