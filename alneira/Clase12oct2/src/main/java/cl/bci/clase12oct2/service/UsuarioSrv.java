package cl.bci.clase12oct2.service;

import cl.bci.clase12oct2.aspect.ValidacionToken;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioSrv {

    //Con una anotacion es otra forma de utilizar aspecto
    @ValidacionToken
    public List<String> listar() {
        List<String> lista = new ArrayList<>();
        lista.add("Alejo");
        lista.add("Max");
        lista.add("Darling");
        return lista;
    }

    public String obtener(int id) {
        return "Alejo";
    }
}
