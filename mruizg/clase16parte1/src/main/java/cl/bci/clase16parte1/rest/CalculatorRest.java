package cl.bci.clase16parte1.rest;

import cl.bci.clase16parte1.model.Calculator;
import cl.bci.clase16parte1.service.CalculatorSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CalculatorRest {

    @Autowired
    private CalculatorSrv calculatorSrv;

    @GetMapping("/add/{n1}/{n2}")
    public int add(@PathVariable("n1") int n1, @PathVariable("n2") int n2){
        return calculatorSrv.add(new Calculator(n1,n2));
    }
}
