package cl.bci.clase8.demo.service;

import cl.bci.clase8.demo.model.Calculadora;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServicio {

    public int sumar(Calculadora calculadora){
        return calculadora.getNumero1() + calculadora.getNumero2() + calculadora.getNumero3();
    }
}
