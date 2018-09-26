package cl.bci.clase10.controller;

import cl.bci.clase10.entity.Libro;
import cl.bci.clase10.repository.LibroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroRepo libroRepo;

    @GetMapping("/insertar")
    public String insertar(Model model){
        model.addAttribute("libro", new Libro());
        model.addAttribute("mensaje","");
        return "insertar";
    }

    @PostMapping("/insertar")
    public String insertar(Model model, @ModelAttribute Libro libro){
        libro = libroRepo.save(libro);
        model.addAttribute("libro", libro);
        model.addAttribute("mensaje","Se agrego el libro con id:" + libro.getId());
        return "insertar";
    }
}
