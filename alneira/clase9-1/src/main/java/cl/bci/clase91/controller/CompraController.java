package cl.bci.clase91.controller;

import cl.bci.clase91.entity.Compra;
import cl.bci.clase91.repository.CompraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CompraController {

    @Autowired
    private CompraRepo compraRepo;

    @GetMapping("/listarcompras")
    public String getMapping(Model modelo){
        modelo.addAttribute("listaCompras", (List<Compra>)compraRepo.findAll());
        return "compras";
    }
}
