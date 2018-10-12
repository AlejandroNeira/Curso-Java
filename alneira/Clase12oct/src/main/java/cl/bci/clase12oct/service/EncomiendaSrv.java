package cl.bci.clase12oct.service;

import org.springframework.stereotype.Service;

@Service
public class EncomiendaSrv {

    public int tiempoEnvio() {
        return 0;
    }

    public int costoEnvio() {
        return 0;
    }

    public String mensaje(String texto) {
        return "este es un texto";
    }
}
