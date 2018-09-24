package clase3parte1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clase3Parte1 {

    public static void main(String[] args) {

        // ciclos
        // For (inicializar;condicion;incrementar)
        // a) cuando se la cantidad de valores a leer
        // b) cuando necesito saber el indice o contador
        for (int i = 0; i < 10; i++) {
            System.out.println("Ciclo for: " + i);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println("Ciclo for: " + i);
        }

        // While
        int contador = 20;
        while (contador < 10) {
            System.out.println("Ciclo while " + contador);
            contador++;
        }
        // Do/While
        do {
            System.out.println("Ciclo do/while " + contador);
            contador++;
        } while (contador < 10);

        // Foreach
        
        /*List<String> items = new ArrayList<>();
	items.add("A");
	items.add("B");
	items.add("C");
	items.add("D");
	items.add("E");

        items.forEach((item) -> {
            System.out.println(item);
        });*/
        
        /*Map<String, Integer> items = new HashMap<>();
	items.put("A", 10);
	items.put("B", 20);
	items.put("C", 30);
	items.put("D", 40);
	items.put("E", 50);
	items.put("F", 60);

        items.entrySet().forEach((entry) -> {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        });*/

        String[] paises = new String[3];
        paises[0] = "Chile";
        paises[1] = "Argentina";
        paises[2] = "Peru";
        for (String pais : paises) {
            System.out.println("El pais es " + pais);
        }

        paises = new String[4];
        paises[0] = "Chile";
        paises[1] = "Argentina";
        paises[2] = "Peru";
        paises[3] = "Bolivia";

        List<String> lista = new ArrayList<>();
        lista.add("Chile");
        lista.add("argentina");
        lista.add("Peru");
        lista.add("Bolivia");
        lista.add("Brasil");

        // saber la cantidad de elementos de array or list
        System.out.println("El arreglo paises tiene " + paises.length + " elementos");
        System.out.println("La lista tiene " + lista.size() + " elementos");
        //ver elemento
        System.out.println("El primer elemento de paises es " + paises[0]);
        System.out.println("El primer elemento de lista es " + lista.get(0));
        // eliminar
        lista.remove(1);


        lista.forEach((item) -> {
            System.out.println("El pais en la lista es: " + item);
        });


    }

}
