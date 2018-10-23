package cl.bci.clase17oct.rest;

import cl.bci.clase17oct.entity.Client;
import cl.bci.clase17oct.repository.ClientRepo;
import cl.bci.clase17oct.repository.ClientRepo2;
import cl.bci.clase17oct.valueobject.ClientAgrupadoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClientRest {

    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private ClientRepo2 clientRepo2;

    @GetMapping("/listar")
    public List<Client> listar(){
        return clientRepo.listarEjemplo();
    }

    @GetMapping("/listar2")
    public List<Client> listar2(){
        return clientRepo2.listarEjemplo();
    }

    @GetMapping("/listar3")
    public List<Client> listar3(){
        return clientRepo2.listarEjemplo2();
    }

    @GetMapping("/listar4")
    public List<Object[]> listar4(){
        return clientRepo2.listarEjemplo3();
    }

    @GetMapping("/listar5")
    public List<ClientAgrupadoVO> listar5(){
        return clientRepo2.listarAgrupado();
    }

    @GetMapping("/listar/{inicio}")
    public List<Client> listarInicio(@PathVariable(name = "inicio") String inicio){
        return clientRepo2.spList(inicio);
    }

    @GetMapping("/insertar/{name}")
    public int insertar(@PathVariable(name = "name") String name){
        return clientRepo2.insertar(name);
    }
}
