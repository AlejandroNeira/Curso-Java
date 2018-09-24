package clase2parte2.servicio;

import clase2parte2.modelo.Caja;

public class CajaServicio {

    public int precioEnvio(Caja caja) {
        return volumen(caja) * caja.getPrecio();
    }

    public int volumen(int alto, int ancho, int largo) {
        return alto * ancho * largo;
    }

    public int volumen(Caja caja) {
        return caja.getAlto() * caja.getAncho() * caja.getLargo();
    }


}
