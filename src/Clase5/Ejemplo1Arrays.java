package Clase5;

import java.util.Scanner;

public class Ejemplo1Arrays {
    /*
    Dado un array de int y un valor de tipo int, devuelva un booleano que indica si el
valor se encuentra contenido en el array.
     */
    public static void main(String[] args) {
        int[] notas = {5, 2, 10, 7, 6};
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = entrada.nextInt();

        boolean seEncuentra = false;
        // realiza iteraciones innecesarias
        // fori
//        for (int i = 0; i < notas.length; i++) {
//            if (notas[i] == valor)
//                seEncuentra = true;
//        }
        int i = 0;
        while (i < notas.length && !seEncuentra) {      // seEncuentra == false
            if (notas[i] == valor)
                seEncuentra = true;
            i++;
        }

        // foreach
        for (int nota : notas) {
            if (nota == valor) {
                seEncuentra = true;
                break;
            }
        }

        System.out.println(seEncuentra);
    }
}
