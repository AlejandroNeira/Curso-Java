package cl.bci.clase01oc.model;

import lombok.Data;

@Data
public class Aprobacion {
    private int monto;
    private String nombre;
    private boolean estaAprobado;
    private boolean esIlimitado;
}
