package cl.bci.clase12oct2.service;

import org.springframework.stereotype.Service;

@Service
public class ValidacionSrv {

    public boolean validar(String token) {
        return token.equals("123");
    }
}
