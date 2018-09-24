package clase2;

public class Clase2 {

    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 30;

        boolean resultado = numero1 == numero2;

        if (numero1 == numero2) {
            System.out.println("numero 1 es igual a numero2");
        } else {
            System.out.println("numero 1 no es igual a numero2");
        }

        if (resultado) {
            System.out.println("numero 1 es igual a numero2");
        } else {
            System.out.println("numero 1 no es igual a numero2");
        }

        if (numero1 == numero2) {
            System.out.println("numero 1 es igual a numero2");
        } else if (numero1 < numero2) {
            System.out.println("numero1 es menor a numero2");
        } else {
            System.out.println("numero2 es menor a numero1");
        }

        if (numero1 < numero2) {
            System.out.println("numero 1 es menor");
        } else if (numero1 == numero2) {
            System.out.println("numero 2 es igual");
        } else {
            System.out.println("numero 2 es menor");
        }

        String nombre1 = "John";
        String nombre2 = "Annah";

        if (nombre1.equals(nombre2)) {
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres son distintos");
        }

        // IF
        int numero3 = 30;
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("numero 1, 2 y 3 son iguales");
        }

        // SWITCH
        numero1 = 4;
        switch (numero1) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            default:
                System.out.println("otro caso");
        }

        // OPERACION TERNARIA
        String igual = (numero1 < numero2) ? "es menor" : "es mayor o igual";
        System.out.println(igual);


    }

}
