package miproyectoinicial;

import hola.mundo.Producto;

import java.util.Date;

// 1) Las clases deben partir en mayúscula (recomendación OOP)
// 2) Una clase = un archivo
// 3) Debe estar en el paquete y carpeta correcto

public class MiProyectoInicial {

    private int entero;                  // campos o miembros (o estados)

    public static void main(String[] args) {


        int variable;                   // variables

        // hay 2 tipos de variables: primitivas y objetos
        // Clases e interfaces, deben partir en mayuscula.
        // todo lo demas, debe partir en minúscula
        // Para nombres compuesto usa camelCase

        // Variables primitivas enteros
        int numero;                     // -2mm .. 2mm
        int numero2 = 30;                 // variable primitiva esta definida en el core de Java y se ven resaltadas
        byte unByte = 20;                 // -127 .. 127 (1/4 espacio de un entero)
        long enteroLargo = 5000;          // x2 memoria que un entero

        // Decimales
        double decimal = 20.4;            // x2 memoria de un float, se usa para manejar dinero
        float flotante = 30.5f;

        boolean booleano = true;

        char caracter = 'a';              // Solo puedo guardar 1 caracte
        String texto = "Hola Mundo";      // String es una clase, no es una variable primitiva

        // Variables definidas por una clase se llaman "objetos"
        Date fecha = new Date();

        Producto prod;

        System.out.println("hola");
        System.out.println(fecha);


        //int division=0/0;


    }

}
