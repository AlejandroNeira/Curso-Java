package cl.pepsi.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "ejercicio")
@SessionScoped
public class Ejercicio implements Serializable {

    private String texto;

    public void boton() {
        setTexto("Hola mundo");
    }

    public Ejercicio() {

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

}
