package proyecto2;

import proyecto2.paquete2.*;

import java.util.Arrays;
import java.util.Date;

public class Proyecto2 {

    int campo = 50;

    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 30;
        int suma = numero1 + numero2;
        System.out.println("la suma es: " + suma);
        int numero3 = 30;
        System.out.println("el numero 3 es: " + numero3);
        System.out.println("hola" + "mundo");

        String pais = "Chile";
        System.out.println(pais);
        pais = "Argentina";
        System.out.println(pais);
        pais = "Peru";
        System.out.println(pais);

        int contador = 0;
        contador = contador + 1;
        System.out.println("contador: " + contador);
        contador++;
        System.out.println("contador: " + contador);
        contador += 1;
        System.out.println("contador: " + contador);

        int contador2;
        contador2 = 0;
        System.out.println("El contador 2 vale: " + contador2);

        // nombres de variables
        // deben ser CLAROS y CORTOS.

        // arrays
        String[] paises = new String[3];
        paises[0] = "Chile";
        paises[1] = "Peru";
        paises[2] = "Argentina";
        System.out.println(paises[0]);
        System.out.println(paises[1]);
        System.out.println(paises[2]);
        System.out.println(Arrays.toString(paises));

        System.out.println("Cantidad de paises: " + paises.length);

        Calculadora calculadora = new Calculadora();

        int operacion = calculadora.sumar(10, 20, 30);
        System.out.println("La operacion es: " + operacion);

        Date fecha = new Date(); // agregar import java.util.date
//        java.sql.Date fecha2 = new java.sql.Date();

        ClaseEjemplo ejemplo = new ClaseEjemplo();

        Impuestos imp = new Impuestos();
        double monto1 = 1000;
        System.out.println("\n------------- CALCULAMOS EL IVA");
        System.out.println("El precio es: " + monto1);
        System.out.println("El IVA es: " + imp.iva(monto1));

    }

}
