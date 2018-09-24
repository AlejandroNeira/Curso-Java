package clase3parte4;

import java.util.List;

/**
 * Esta es la clase de servicio
 *
 * @author mruizg
 */
public class ProductoServicio {

    public int sumaProducto(List<Producto> productos) {

        //int total = 0;
        //for (Producto objprod : productos) {
        //    total = total + (objprod.getCantidad() * objprod.getPrecioUnitario());
        //}
        //productos.stream().mapToInt(p-> p.getCantidad() * p.getPrecioUnitario()).sum();
        // return total;
        return productos.stream().mapToInt(p -> p.getCantidad() * p.getPrecioUnitario()).sum();
    }

    public void mostrar(List<Producto> productos) {

        productos.forEach((Producto prod) -> System.out.println(prod.getNombre()));

    }

    /**
     * Esta funcion retorna si el producto es valido
     *
     * @param prod el producto
     * @return regresa false si el producto no es valido, sino regresa true
     */
    public boolean esValido(Producto prod) {
        return !prod.getNombre().equals("");
    }

}
