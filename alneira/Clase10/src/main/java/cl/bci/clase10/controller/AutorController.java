package cl.bci.clase10.controller;

import cl.bci.clase10.entity.Autor;
import cl.bci.clase10.repository.AutorRepo;
import cl.bci.clase10.repository.LibroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorRepo autorRepo;

    @GetMapping("/insertar")
    public String autor(Model modelo){
        modelo.addAttribute("autor", new Autor());
        return "autor";
    }

    @PostMapping("/insertar")
    public String autor(Model modelo, Autor autor){
        autor = autorRepo.save(autor);
        modelo.addAttribute("autor", autor);
        //modelo.addAttribute("mensaje", "El autor con ID:" + autor.getId() + "fue agregado");
        return "redirect:/autor/listar";
    }

    @GetMapping("/listar")
    public String listar(Model modelo){
        List<Autor> autorList = new ArrayList<>();
        autorList = (List<Autor>) autorRepo.findAll();
        modelo.addAttribute("autores", autorList);
        return "listado";
    }

    @GetMapping("/{id}")
    public String modificar(Model modelo, @PathVariable("id") int id){
        Optional<Autor> autor = autorRepo.findById(id);
        modelo.addAttribute("autor",autor);
        return "modificaautor";
    }

    @PostMapping("/{id}")
    public String modificar(Model modelo, Autor autore){
        autorRepo.save(autore);
        //modelo.addAttribute("autor",autor);
        return "redirect:/autor/listar";
    }

}
