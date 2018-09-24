package cl.pepsi.bean;

import javax.inject.Named;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

@Named(value = "miBean")
@RequestScoped
public class MiBean implements Serializable {

    private String texto;
    private int contador;

    public void clickBoton() {
        contador++;
    }

    public MiBean() {

    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

}
