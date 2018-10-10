package cl.bci.clase10oct1.rest;

import cl.bci.clase10oct1.modelo.Calculadora;
import cl.bci.clase10oct1.servicio.CalculadoraSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CalculadoraRest {

    @Autowired
    private CalculadoraSrv calculadoraSrv;

    @GetMapping("/sumar/{n1}/{n2}")
    public int sumar(@PathVariable("n1") int n1, @PathVariable("n2") int n2){
        return calculadoraSrv.sumar(new Calculadora(n1,n2));
    }
}
