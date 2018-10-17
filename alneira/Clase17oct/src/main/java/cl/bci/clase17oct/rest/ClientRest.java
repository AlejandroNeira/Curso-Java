package cl.bci.clase17oct.rest;

import cl.bci.clase17oct.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClientRest {

    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("")
    public List<?> get(){
        return null;
    }
}
