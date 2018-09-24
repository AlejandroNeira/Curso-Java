package cl.mruizg.demo.controlador;

import cl.mruizg.demo.entidad.Pais;
import cl.mruizg.demo.repositorio.PaisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PaisController {

    @Autowired
    private PaisRepo paisRepo;

    @GetMapping("/listarpaises")
    public String listar(Model modelo){

        List<Pais> lista = (List<Pais>) getPaisRepo().findAll();
        modelo.addAttribute("listaPaises", lista);
        return "lista";

    }

    public PaisRepo getPaisRepo() {
        return paisRepo;
    }

    public void setPaisRepo(PaisRepo paisRepo) {
        this.paisRepo = paisRepo;
    }
}
