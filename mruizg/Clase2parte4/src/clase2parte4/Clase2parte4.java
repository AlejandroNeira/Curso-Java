package clase2parte4;

/**
 * @author mruizg
 */
public class Clase2parte4 {

    public static void main(String[] args) {

        Modelo mod = new Modelo();
        mod.setValor("Chile");
        System.out.println("El valor es: " + mod.getValor());

        //mod = new Modelo();
        Modelo mod2 = mod;
        mod2.setValor("Peru");
        System.out.println("El valor es: " + mod.getValor());

        mod = new Modelo();

        int n1 = 10;
        int n2 = n1;

        String texto = "Hola";
        String texto2 = texto;
        texto2 = "mundo";
        System.out.println(texto);
        System.out.println(texto2);


    }

}
