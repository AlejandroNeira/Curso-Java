package cl.bci.clase8.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EjemploController {

    @GetMapping("ejemplo")
    @ResponseBody
    public String funcion(){
        return "hola mundo";
    }

}
