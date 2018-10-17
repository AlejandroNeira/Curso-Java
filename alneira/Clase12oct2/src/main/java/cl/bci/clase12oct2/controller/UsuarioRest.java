package cl.bci.clase12oct2.controller;

import cl.bci.clase12oct2.service.UsuarioSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioRest {

    @Autowired
    UsuarioSrv usuarioSrv;

    @GetMapping
    public List<String> listar() {
        return usuarioSrv.listar();
    }

    @GetMapping("/{id}")
    public String listar(@PathVariable(name = "id") int id) {
        return usuarioSrv.obtener(id);
    }
}
