package cl.bci.clase8.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculoController {

    @GetMapping("calcular")
    public String calcular(Model model){
        model.addAttribute("valor",0);
        //model.addAttribute("calculo",0);
        return "CalculoIva";
    }

    @PostMapping("calcular")
    public String plantilla(@RequestParam("valor") int valor, Model model){
        model.addAttribute("calculo",valor*1.19);
        return "CalculoIva";
    }
}
