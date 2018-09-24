package com.example.clase9parte2.servicio;

import com.example.clase9parte2.entidad.Compra;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompraServicio {

    public int calculoTotal(List<Compra> lista){
        int total=0;
        for(Compra compra: lista){
            total+= compra.getCantidad() * compra.getMontoUnitario();
        }
        return total;
    }

}
