package cl.bci.clase8.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumarController {

    @GetMapping("sumar")
    public String calcular(Model model){
        model.addAttribute("n1",0);
        model.addAttribute("n2",0);
        model.addAttribute("n3",0);
        return "Sumar";
    }

    @PostMapping("sumar")
    public String plantilla(@RequestParam("n1") int n1, @RequestParam("n2") int n2, @RequestParam("n3") int n3, Model model){
        model.addAttribute("suma",n1 + n2 + n3);
        //para que no refresque los numeros
        model.addAttribute("n1",n1);
        model.addAttribute("n2",n2);
        model.addAttribute("n3",n3);
        return "Sumar";
    }
}
