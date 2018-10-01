package cl.bci.clase01oc.service;

import cl.bci.clase01oc.model.Aprobacion;
import org.springframework.stereotype.Service;

@Service
public class AprobacionService {

    public void fijarAprobacion(Aprobacion aprobacion, boolean aprobado, boolean limitado){
        aprobacion.setEstaAprobado(aprobado);
        aprobacion.setEsIlimitado(limitado);
    }

    public AprobacionService aprobar(Aprobacion aprobacion, boolean aprobado){
        aprobacion.setEstaAprobado(aprobado);
        return this;
    }

    public AprobacionService limitado(Aprobacion aprobacion, boolean limitado){
        aprobacion.setEsIlimitado(limitado);
        return this;
    }
}
