package com.example.clase9parte2.Controller;

import com.example.clase9parte2.entidad.Compra;
import com.example.clase9parte2.repositorio.CompraRepo;
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
    public String listar(Model modelo){

        List<Compra> lista = (List<Compra>) getCompraRepo().findAll();
        modelo.addAttribute("listaCompras", lista);
        return "lista";

    }

    public CompraRepo getCompraRepo() {
        return compraRepo;
    }

    public void setCompraRepo(CompraRepo compraRepo) {
        this.compraRepo = compraRepo;
    }
}
