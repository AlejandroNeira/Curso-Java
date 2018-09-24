package clase3parte3;


// modelo.

public class Pais {

    private String nombre;
    private int poblacion;

    public Pais(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public Pais() {
    }


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the poblacion
     */
    public int getPoblacion() {
        return poblacion;
    }

    /**
     * @param poblacion the poblacion to set
     */
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }


}
