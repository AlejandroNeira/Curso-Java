package clase3parte3;

import java.util.ArrayList;
import java.util.List;

public class Clase3parte3 {

    public static void main(String[] args) {

        //nora: no usar java.awt.list
        List<Pais> paises = new ArrayList<Pais>();

        Pais pais = new Pais();
        pais.setNombre("Chile");
        pais.setPoblacion(17);
        paises.add(pais);

        pais = new Pais();
        pais.setNombre("Argentina");
        pais.setPoblacion(30);
        paises.add(pais);

        pais = new Pais();
        pais.setNombre("Peru");
        pais.setPoblacion(1);
        paises.add(pais);

        for (Pais objpais : paises) {
            System.out.println(objpais.getNombre());
        }

        // suma de poblacion
        PaisServicio paisServicio = new PaisServicio();
        System.out.println("El total es: " + paisServicio.sumarPoblacion(paises));

        // obtener el pais con mayor poblacion
        System.out.println("El pais con mayor poblacion es: " + paisServicio.paisMayor(paises).getNombre());

        Pais paisnulo = new Pais();
        paisnulo.setNombre("Chile");
        System.out.println("el nombre del pais es " + paisnulo.getNombre());


    }

}
