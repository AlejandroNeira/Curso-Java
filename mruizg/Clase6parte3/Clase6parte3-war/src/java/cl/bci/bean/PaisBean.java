package cl.bci.bean;

import cl.bci.modelo.Pais;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named(value = "paisBean")
@SessionScoped
public class PaisBean implements Serializable {

    private Pais pais = new Pais();

    private List<Pais> lista = new ArrayList<>();

    public String clickBoton() {
        getLista().add(getPais());
        pais = new Pais();
        return "listado.xhtml";
    }

    public PaisBean() {
    }

    /**
     * @return the pais
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * @return the lista
     */
    public List<Pais> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Pais> lista) {
        this.lista = lista;
    }

}
