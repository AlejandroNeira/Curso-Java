package cl.bci.clase8.demo.Controller;

import cl.bci.clase8.demo.service.CalculadoraServicio;
import cl.bci.clase8.demo.model.Calculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculadoraController {

    @Autowired
    private CalculadoraServicio cservicio;

    @GetMapping("/calculadora")
    public String sumar(Model model){
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(0);
        calculadora.setNumero2(0);
        calculadora.setNumero3(0);
        model.addAttribute("objeto",calculadora);
        model.addAttribute("suma",0);
        return "Calculadora";
    }

    @PostMapping("/calculadora")
    public String sumar(Calculadora calculadora, Model model){
        model.addAttribute("objeto",calculadora);
        model.addAttribute("suma",cservicio.sumar(calculadora));
        return "Calculadora";
    }
}
