package cl.bci.clase01oc.controller;

import cl.bci.clase01oc.model.Aprobacion;
import cl.bci.clase01oc.service.AprobacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AprobadoController {

    @Autowired
    private  AprobacionService aprobacionService;

    @GetMapping
    public String aprobacion(){
        Aprobacion aprobacion = new Aprobacion();
        aprobacionService.fijarAprobacion(aprobacion, false,false);

        return "";
    }
}
