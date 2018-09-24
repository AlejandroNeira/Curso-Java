package clase2parte1;

public class Clase2parte1 {

    public static void main(String[] args) {

        // producto
        Producto prod = new Producto(1, "cocacola", 5000, true);

        System.out.println(prod.calculoIva());

        Producto prod2 = new Producto();

        prod2.setCodProducto(2);
        prod2.setEnStock(false);
        prod2.setNombreProducto("Pepsi");
        prod2.setPrecio(3000);

        System.out.println("El producto 2 es: " + prod2.getNombreProducto());

    }

}
