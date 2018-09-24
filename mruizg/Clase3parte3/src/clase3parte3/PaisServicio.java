package clase3parte3;

import java.util.List;

public class PaisServicio {

    public int sumarPoblacion(List<Pais> paises) {
        int total = 0;
        for (Pais objpais : paises) {
            total = total + objpais.getPoblacion();
        }

        // esto es java stream
        //total = paises.stream()
        //        .mapToInt(p -> p.getPoblacion())
        //        .sum();

        return total;
    }

    public Pais paisMayor(List<Pais> paises) {
        Pais mayor = new Pais();
        mayor.setPoblacion(0);
        for (Pais objpais : paises) {
            if (objpais.getPoblacion() > mayor.getPoblacion()) {
                mayor = objpais;
            }
        }
        return mayor;
    }

}
