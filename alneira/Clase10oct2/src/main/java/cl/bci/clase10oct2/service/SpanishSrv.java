package cl.bci.clase10oct2.service;

import org.springframework.stereotype.Service;

@Service
public class SpanishSrv implements LanguajeInterfaceSrv {

    public String mensaje(){
        return "hola";
    }
}
