package Clase12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjExcepciones {
//    1. Se tiene una lista de valores [3, 2, -4, 8, 4, 0, 6] y se le
//    pide al usuario que ingrese alguna posición de dicha lista,
//    el programa devuelve división del número elegido con el valor
//    siguiente.
//    Ejemplo:
//    •	El usuario ingresa 0: el programa devuelve 3 / 2 = 1,5
//    •	El usuario ingresa 2: el programa devuelve -4 / 8 = -0,5
//    Tratar todas las excepciones que puedan surgir.
//    2. Ahora, lance una excepción si, el número a dividir o el número que divide son negativos.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] lista = {3, 2, -4, 8, 4, 0, 6};

        System.out.print("Ingrese una posicion/indice de la lista:\n [3, 2, -4, 8, 4, 0, 6]\n > "
        );
        try {
            int indice = entrada.nextInt();
            double division = (double) lista[indice] / lista[indice + 1];   // es necesario castear al menos uno de los 2
            // para que el resultado de la division sea
            // con decimales (double)
            if (lista[indice] < 0 || lista[indice + 1] < 0) throw new Exception();
            System.out.println("El resultado es " + division);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Se fue de rango");
        } catch (Exception e) {     // si hubiera más de un catch, la Exception génerica va siempre última
            System.out.println("Division por negativo");
        }

        //System.out.println("Sigue el programa");   en este caso el programa no debe hacer nada más
    }
}
