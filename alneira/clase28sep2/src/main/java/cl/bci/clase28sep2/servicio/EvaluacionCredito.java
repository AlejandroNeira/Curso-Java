package cl.bci.clase28sep2.servicio;

import cl.bci.clase28sep2.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EvaluacionCredito {

    //Mejora de MAPA

    //[INICIO] Metodos en cadena
    private int solicitado;

    public EvaluacionCredito solicitado(int monto){
        this.solicitado = monto;
        return this;
    }
    public boolean esValido(Cliente cliente) {
        boolean valido = false;
        if (cliente.getTipoDinero() == Cliente.EnumtipoDinero.PESO) {
            if (cliente.getSalario() > solicitado * 0.3) {
                valido = true;
            }
        }
        return valido;
    }

    //[FIN]

    //Primer metodo feo
    public boolean esValido(Cliente cliente, int solicitado) {
        boolean valido = false;

        if (cliente.getTipoDinero() == Cliente.EnumtipoDinero.PESO) {
            if (cliente.getSalario() <= solicitado * 0.3) {
                valido = true;
            }
        }
        if (cliente.getTipoDinero() == Cliente.EnumtipoDinero.DOLAR) {
            if (cliente.getSalario() <= solicitado * 0.1) {
                valido = true;
            }
        }
        if (cliente.getTipoDinero() == Cliente.EnumtipoDinero.UF) {
            if (cliente.getSalario() <= solicitado * 0.3) {
                valido = true;
            }
        }

        return valido;
    }
}
