package cl.bci.clase01oct2.controller;

import cl.bci.clase01oct2.entity.Ciudad;
import cl.bci.clase01oct2.repository.CiudadRepo;
import cl.bci.clase01oct2.repository.CiudadRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CiudadController {

    @Autowired
    private CiudadRepo ciudadRepo;

    @Autowired
    private CiudadRepo2 ciudadRepo2;

    @GetMapping("/ciudades")
    public String ciudades(Model model){
        //model.addAttribute("listado",(List<Ciudad>) ciudadRepo.findAll());
        model.addAttribute("listado", ciudadRepo2.listarTodo());
        return "ciudades";
    }

}
