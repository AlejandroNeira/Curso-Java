package cl.bci.clase91.services;

import cl.bci.clase91.entity.Compra;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {

    public int calculoTotal(List<Compra> lista){
        int total = 0;
        //for (Compra compra: lista) {
        //    total += (compra.getCantidad() * compra.getMontoUnitario());
        //}


        return lista.stream().mapToInt(tc -> tc.getCantidad()* tc.getMontoUnitario()).sum();
        //return total;
    }
}
