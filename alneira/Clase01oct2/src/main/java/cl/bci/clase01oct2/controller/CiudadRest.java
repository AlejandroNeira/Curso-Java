package cl.bci.clase01oct2.controller;

import cl.bci.clase01oct2.entity.Ciudad;
import cl.bci.clase01oct2.repository.CiudadRepo;
import cl.bci.clase01oct2.repository.CiudadRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ciudades")
public class CiudadRest {

    @Autowired
    private CiudadRepo2 ciudadRepo2;

    @GetMapping("/lista")
    public List<Ciudad> ciudades(Model model){
        return ciudadRepo2.listarTodo();
    }

}
