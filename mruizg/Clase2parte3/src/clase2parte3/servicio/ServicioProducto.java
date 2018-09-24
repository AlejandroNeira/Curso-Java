package clase2parte3.servicio;

import clase2parte3.modelo.Producto;

public class ServicioProducto {

    public int sumarProducto(Producto prod, Producto prod2) {
        return prod.getPrecio() + prod2.getPrecio();
    }

    public int promedio(Producto prod, Producto prod2) {
        return (prod.getPrecio() * prod2.getPrecio()) / 2;
    }

    public String productoMenor(Producto prod, Producto prod2) {
        if (prod.getPrecio() == prod2.getPrecio()) {
            return "No hay producto menor, ambos tienen el mismo valor";
        } else {
            return (prod.getPrecio() <= prod2.getPrecio()) ? prod.getNombre() : prod2.getNombre();
        }
    }

}
