package cl.bci.clase91.controller;

import cl.bci.clase91.entity.Compra;
import cl.bci.clase91.repository.CompraRepo;
import cl.bci.clase91.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CompraController {

    @Autowired
    private CompraRepo compraRepo;

    @Autowired
    private CompraService compraService;

    @GetMapping("/listarcompras")
    public String getMapping(Model modelo){
        List<Compra> lista = (List<Compra>)compraRepo.findAll();
        modelo.addAttribute("listaCompras",lista );
        modelo.addAttribute("total",compraService.calculoTotal(lista) );
        return "compras";
    }


}
