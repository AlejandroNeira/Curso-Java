package cl.bci.clase8oct.rest;

import cl.bci.clase8oct.entity.Encomienda;
import cl.bci.clase8oct.repository.EncomiendaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/encomienda")
public class EncomiendaRest {

    @Autowired
    private EncomiendaRepo encomiendaRepo;

    @GetMapping
    public List<Encomienda> listar(){
        return (List<Encomienda>) encomiendaRepo.findAll();
    }
}
