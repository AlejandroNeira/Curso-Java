package clase2parte1;

public class Producto {

    private int codProducto;
    private String nombreProducto;
    private int precio;
    private boolean enStock;

    public Producto(int codProducto, String nombreProducto, int precio, boolean enStock) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.enStock = enStock;
    }

    public Producto() {
    }


    public double calculoIva() {
        return this.precio * 1.19;
    }


    public boolean isEnStock() {
        return enStock;
    }

    public void setEnStock(boolean enStock) {
        this.enStock = enStock;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}
