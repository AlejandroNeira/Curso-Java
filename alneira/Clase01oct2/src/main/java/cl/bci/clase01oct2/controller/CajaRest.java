package cl.bci.clase01oct2.controller;

import cl.bci.clase01oct2.entity.Caja;
import cl.bci.clase01oct2.entity.Ciudad;
import cl.bci.clase01oct2.repository.CajaRepo;
import cl.bci.clase01oct2.repository.CiudadRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("caja")
public class CajaRest {

    @Autowired
    private CajaRepo cajaRepo;

    @GetMapping("/lista")
    public List<Caja> ciudades(Model model){
        return (List<Caja>) cajaRepo.findAll();
    }

}
