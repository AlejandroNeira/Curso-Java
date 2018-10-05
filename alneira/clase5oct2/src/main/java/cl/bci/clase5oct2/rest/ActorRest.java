package cl.bci.clase5oct2.rest;


import cl.bci.clase5oct2.entity.Actor;
import cl.bci.clase5oct2.repository.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/actor")
public class ActorRest {

    @Autowired
    private ActorRepo actorRepo;

    //Obtener el listado completo de los actores
    @GetMapping("/")
    public List<Actor> listar(){
        return (List<Actor>) actorRepo.findAll();
    }

    //Obtener la informacion de un actor en particular
    @GetMapping("/{id}")
    public Actor obtener(@PathVariable(name = "id") int id){
        Optional<Actor> actor = actorRepo.findById(id);
        return actor.isPresent()? actor.get(): new Actor();
    }

    //Sirve para modificar o para crear, depende de si llega o no el ID
    @PostMapping("/")
    public Actor insertar(@RequestBody Actor actor){
        actorRepo.save(actor);
        return actor;
    }

    //Para eliminar un actor
    @PutMapping("/{id}")
    public void delete(@PathVariable(name = "id") int id){
        actorRepo.deleteById(id);
    }
}
