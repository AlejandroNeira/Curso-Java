package cl.pepsi.bean;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "ejemploBean")
@SessionScoped
public class EjemploBean implements Serializable {

    private String texto;

    public void cambiaTexto() {
        setTexto("Este es mi nuevo texto");
    }

    public EjemploBean() {

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
