package cl.pepsi.bean;

import cl.pepsi.modelo.Producto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "insertarProductoBean")
@SessionScoped
public class InsertarProductoBean implements Serializable {

    private Producto prod = new Producto();

    private List<Producto> lista = new ArrayList<>();

    public String clickBoton() {
        getLista().add(getProd());
        prod = new Producto();
        return "listado.xhtml";
    }

    public InsertarProductoBean() {
    }

    /**
     * @return the prod
     */
    public Producto getProd() {
        return prod;
    }

    /**
     * @param prod the prod to set
     */
    public void setProd(Producto prod) {
        this.prod = prod;
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
