package cl.bci.clase28sep2.controller;

import cl.bci.clase28sep2.entity.Cliente;
import cl.bci.clase28sep2.servicio.EvaluacionCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    @Autowired
    private EvaluacionCredito evaluacionCredito;

    @GetMapping("/solicitar")
    public String solicitar(Model model) {

        //Parte 1
        Cliente cliente1 = new Cliente(1, "", "", 300, Cliente.EnumtipoDinero.DOLAR);
        boolean aprobado = evaluacionCredito.esValido(cliente1, 200);

        //Parte 2
        //Version 1
        evaluacionCredito.solicitado(200);
        aprobado = evaluacionCredito.esValido(cliente1);

        //Version 2
        aprobado = evaluacionCredito.solicitado(200).esValido(cliente1);

        //Ejercicio
        model.addAttribute("cliente", new Cliente());
        return "template";
    }

    //Ejercicio
    @PostMapping("/solicitar")
    public String solicitar(Model model, Cliente cliente) {

        model.addAttribute("cliente", cliente);
        boolean estaAprobado = evaluacionCredito.solicitado(200).esValido(cliente);
        System.out.println(cliente);
        System.out.println(estaAprobado);
        model.addAttribute("ok",estaAprobado);

        return "template";
    }

}
