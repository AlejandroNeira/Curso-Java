package cl.bci.clase9.controlador;

import cl.bci.clase9.entity.Pais;
import cl.bci.clase9.repository.PaisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PaisController {

    @Autowired
    private PaisRepo paisRepo;

    @GetMapping ("/listarpaises")
    public String listar(Model modelo){
        List<Pais> lista = (List<Pais>) paisRepo.findAll();
        modelo.addAttribute("listaPaises", lista);
        return "lista";
    }
}
