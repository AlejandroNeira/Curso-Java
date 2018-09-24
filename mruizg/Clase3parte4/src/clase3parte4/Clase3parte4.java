package clase3parte4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clase3parte4 {

    public static void main(String[] args) {

        // List = interface
        // ArrayList = clase
        // < > = clase es un generics.
        // <> = diamante

        List<String> paises = new ArrayList<>();

        ClaseGenerica<String, String> ejemplo = new ClaseGenerica<>();
        ClaseGenerica<Date, String> ejemplo2 = new ClaseGenerica<>();

        List<Producto> productos = new ArrayList<>();

        Producto prod = new Producto(1, "Mouse", 10, 20);
        productos.add(prod);


        productos.add(new Producto(2, "Teclado", 20, 30));
        productos.add(new Producto(3, "Pantalla", 30, 40));
        productos.add(new Producto(4, "Pad", 40, 50));
        productos.add(new Producto(5, "Gabinete", 50, 60));


        ProductoServicio prodServicio = new ProductoServicio();
        System.out.println("La suma de productos es: " + prodServicio.sumaProducto(productos));


    }

}
