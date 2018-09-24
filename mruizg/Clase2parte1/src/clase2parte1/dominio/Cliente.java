package clase2parte1.dominio;

// clase de dominio, negocio, business object.

public class Cliente {

    private String rut;
    private String nombre;
    private int edad;

    public Cliente(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Cliente() {
    }


    public int calculoCredito() {
        return 0;
    }

    public int montoDeuda() {
        return 0;
    }


    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }


}
