package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 1) Todas las clases deben estar dentro del paquete inicial.
// en nuestro caso, com.example.demo
// 2) Antiguamente, los controladores solo se creaban en la carpeta controller.

@Controller
public class EjemploController {

    /**
     * @param modelo
     * @return
     */

    @GetMapping("/plantilla")
    public String plantilla(Model modelo) {
        modelo.addAttribute("valor", "Valor seteado en controller");
        return "plantilla";
    }

    @PostMapping("/hola")
    @ResponseBody
    public String inicio2() {
        return "Hello World2";
    }

    @RequestMapping("/hola")
    @ResponseBody
    public String inicio3() {
        return "Hello World3";
    }

}
 