package cl.pepsi.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import cl.pepsi.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

@Named(value = "productoBean")
@SessionScoped
public class ProductoBean implements Serializable {

    private Producto producto;
    private int precioConIva;
    private List<Producto> lista = new ArrayList<>();

    public ProductoBean() {
        producto = new Producto();
    }

    public void calculoIva() {
        setPrecioConIva((int) (getProducto().getPrecio() * 1.19));
        lista.add(producto);
        producto = new Producto();
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the precioConIva
     */
    public int getPrecioConIva() {
        return precioConIva;
    }

    /**
     * @param precioConIva the precioConIva to set
     */
    public void setPrecioConIva(int precioConIva) {
        this.precioConIva = precioConIva;
    }

    /**
     * @return the lista
     */
    public List<Producto> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }

}
