package cl.bci.clase28sep.controller;

import cl.bci.clase28sep.entity.Mensaje;
import cl.bci.clase28sep.entity.Pelicula;
import cl.bci.clase28sep.repository.MensajeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MensajeController {

    @Autowired
    private MensajeRepo mensajeRepo;

    @GetMapping("/mensaje")
    public String mensaje(Model model){
        Mensaje nuevo = new Mensaje();
        List<Mensaje> lista = (List<Mensaje>) mensajeRepo.findAll();
        model.addAttribute("mensaje", nuevo);
        model.addAttribute("lista", lista);
        return "mensaje";
    }

}
