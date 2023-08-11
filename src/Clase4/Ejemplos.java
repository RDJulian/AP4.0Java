package Clase4;

import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // FOR
//        int i;
//        for (i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
        //System.out.println(i);

        // WHILE
        System.out.print("Ingrese un numero mayor que 0: ");
        int num = entrada.nextInt();

        while (num <= 0) {
            System.out.println("Error: Numero invalido");
            System.out.print("Ingrese un numero mayor que 0: ");
            num = entrada.nextInt();
        }

        // DO-WHILE
//        int num = 0;
//        do {
//            System.out.print("Ingrese un numero mayor que 0: ");
//            num = entrada.nextInt();
//            if (num <= 0) System.out.println("Error: Numero invalido");
//        } while (num <= 0);
//
//        System.out.println("El numero ingresado es " + num);

        // LOOP INFINITO
//        while (true) {
//            System.out.println("loop infinito");
//        }
        entrada.close();
    }
}
