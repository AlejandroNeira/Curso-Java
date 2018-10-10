package cl.bci.clase10oct2.rest;

import cl.bci.clase10oct2.service.LanguajeFactory;
import cl.bci.clase10oct2.service.LanguajeInterfaceSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnglishRest {

    @Autowired
    private LanguajeInterfaceSrv languajeInterfaceSrv;


    private LanguajeInterfaceSrv languajeInterfaceSrv1 = new LanguajeFactory().crear1("english");
    private LanguajeInterfaceSrv languajeInterfaceSrv2 = LanguajeFactory.crear("english");
    private LanguajeInterfaceSrv languajeInterfaceSrv3 = LanguajeFactory.crear3("espanol");

    @GetMapping("/msg")
    public String msg(){
        return languajeInterfaceSrv3.mensaje();
    }
}
