package cl.bci.clase10oct2.service;

import org.springframework.stereotype.Service;

@Service
public class EnglishSrv implements LanguajeInterfaceSrv {

    public String mensaje(){
        return "hello";
    }
}
