package cl.bci.clase17oct.rest;

import cl.bci.clase17oct.entity.Client;
import cl.bci.clase17oct.repository.VentasRepo;
import cl.bci.clase17oct.valueobject.VentasAgrupadasVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/ventas")
public class VentasRest {

    @Autowired
    private VentasRepo ventasRepo;

    @GetMapping("/listar")
    public List<VentasAgrupadasVO> listar(){
        return ventasRepo.ventasAgrupadas();
    }
}
