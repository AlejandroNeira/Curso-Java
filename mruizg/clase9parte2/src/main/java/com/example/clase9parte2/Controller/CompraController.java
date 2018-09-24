package com.example.clase9parte2.Controller;

import com.example.clase9parte2.entidad.Compra;
import com.example.clase9parte2.repositorio.CompraRepo;
import com.example.clase9parte2.servicio.CompraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraRepo compraRepo;

    @Autowired
    private CompraServicio compraServicio;

    @GetMapping("/listar")
    public String listar(Model modelo){

        List<Compra> lista = (List<Compra>) getCompraRepo().findAll();

        modelo.addAttribute("total", getCompraServicio().calculoTotal(lista));
        modelo.addAttribute("listaCompras", lista);
        return "lista";

    }

    public CompraRepo getCompraRepo() {
        return compraRepo;
    }

    public void setCompraRepo(CompraRepo compraRepo) {
        this.compraRepo = compraRepo;
    }

    public CompraServicio getCompraServicio() {
        return compraServicio;
    }

    public void setCompraServicio(CompraServicio compraServicio) {
        this.compraServicio = compraServicio;
    }
}
