package clase2parte3;

import clase2parte3.modelo.Producto;
import clase2parte3.servicio.ServicioProducto;

public class Clase2parte3 {

    public static void main(String[] args) {
        Producto prod1 = new Producto(1, 200, "Coca Cola");
        Producto prod2 = new Producto(2, 220, "Pepsi");

        ServicioProducto servicioProducto = new ServicioProducto();

        int suma = servicioProducto.sumarProducto(prod1, prod2);
        System.out.println("La suma de los productos es: " + suma);

        int promedio = servicioProducto.promedio(prod1, prod2);
        System.out.println("El promedio de los productos es: " + promedio);

        String menor = servicioProducto.productoMenor(prod1, prod2);
        System.out.println("El producto de menor valor es: " + menor);


    }

}
