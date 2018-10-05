package cl.bci.clase5oct2.rest;


import cl.bci.clase5oct2.entity.Taxi;
import cl.bci.clase5oct2.repository.TaxiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/taxi")
public class TaxiRest {

    @Autowired
    private TaxiRepo taxiRepo;

    //Obtener el listado completo de los taxistas
    @GetMapping("/")
    public List<Taxi> listar(){
        return (List<Taxi>) taxiRepo.findAll();
    }

    //Obtener la informacion de un taxi en particular
    @GetMapping("/{id}")
    public Taxi obtener(@PathVariable(name = "id") int id){
        Optional<Taxi> taxi = taxiRepo.findById(id);
        return taxi.isPresent()? taxi.get(): new Taxi();
    }

    //Sirve para modificar o para crear, depende de si llega o no el ID
    @PostMapping("/")
    public Taxi insertar(@RequestBody Taxi taxi){
        taxiRepo.save(taxi);
        return taxi;
    }

    //Para eliminar un Taxista
    @PutMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") int id){
        taxiRepo.deleteById(id);
    }
}
