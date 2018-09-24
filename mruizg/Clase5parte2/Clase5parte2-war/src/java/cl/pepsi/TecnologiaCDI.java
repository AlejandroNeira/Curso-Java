package cl.pepsi;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

// CDI es un bean manejado "ManagedBean" MB
// las paginas solo se conectan a los MB

@Named("tecnologiaCDI") // no es necesario pero usualmente es el nombre de la clase en minuscula
@SessionScoped
public class TecnologiaCDI implements Serializable {

    private String texto;

    public TecnologiaCDI() {
        this.texto = "Hola mundo desde el bean manejado";
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
