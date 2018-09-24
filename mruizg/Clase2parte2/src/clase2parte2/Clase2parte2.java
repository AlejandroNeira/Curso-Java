package clase2parte2;

import clase2parte2.modelo.Caja;
import clase2parte2.servicio.CajaServicio;

public class Clase2parte2 {

    public static void main(String[] args) {

        Caja caja = new Caja(200, 20, 20, 20);

        CajaServicio cajaServicio = new CajaServicio();

        int volumen = cajaServicio.volumen(caja);
        int precio = cajaServicio.precioEnvio(caja);

        System.out.println("El volumen de la caja es: " + volumen);
        System.out.println("El Precio de envio es: " + precio);

    }

}
