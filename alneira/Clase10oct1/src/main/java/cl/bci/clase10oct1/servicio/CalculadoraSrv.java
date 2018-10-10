package cl.bci.clase10oct1.servicio;

import cl.bci.clase10oct1.modelo.Calculadora;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraSrv {

    public int sumar(Calculadora calculadora){
        return calculadora.getN1() + calculadora.getN2();
    }
}
