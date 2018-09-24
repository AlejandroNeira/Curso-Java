package clase3parte2;

import java.util.ArrayList;
import java.util.List;

public class Clase3Parte2 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        IPersona persona2 = new Persona();

        persona2 = new Empleado();

        List<String> lista = new ArrayList<>();

        String texto = "20";
        int numero = 20;
        double decimal = 20.2;

        // conversiones
        texto = String.valueOf(numero);
        numero = Integer.valueOf(texto);
        numero = (int) decimal;

        System.out.println("Texto: " + texto);
        System.out.println("numero: " + numero);

        System.out.println(persona.toString());


    }

}
