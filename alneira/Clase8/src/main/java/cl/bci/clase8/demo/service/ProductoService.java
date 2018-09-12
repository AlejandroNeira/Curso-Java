package cl.bci.clase8.demo.service;

import cl.bci.clase8.demo.model.Producto;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private static final int conversionDolar = 2;

    public double calculoDolar(Producto producto){
        return producto.getPrecioPeso() * conversionDolar;
    }
}
