package cl.bci.clase28sep2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    public enum EnumtipoDinero {PESO, UF, DOLAR}

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String rut;
    private String nombre;
    private int salario;

    @Enumerated(EnumType.STRING)
    private EnumtipoDinero tipoDinero;

}
