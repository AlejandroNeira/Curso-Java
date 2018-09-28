package cl.bci.clase28sep.controller;

import cl.bci.clase28sep.entity.Pelicula;
import cl.bci.clase28sep.repository.PeliculaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PeliculasController {

    @Autowired
    private PeliculaRepo peliculaRepo;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Pelicula> lst = (List<Pelicula>) peliculaRepo.findAll();
        model.addAttribute("listado",lst);
        return "listado";
    }
}
