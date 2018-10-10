package cl.bci.clase10oct1.modelo;

import lombok.Data;

@Data
public class Calculadora {

    private int n1;
    private int n2;

    public Calculadora(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

}
