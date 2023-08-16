package EjerciciosSemana2.EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Escribir un programa que determine si un número M es
    divisible por N (ambos valores son enteros y los ingresa
    el usuario)
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número M: ");
        int numeroM = entrada.nextInt();

        System.out.print("Ingrese número N: ");
        int numeroN = entrada.nextInt();

        if (numeroM % numeroN == 0) {
            System.out.println(numeroM + " es divisible por " + numeroN);
        } else {
            System.out.println(numeroM + " no es divisible por " + numeroN);
        }


        entrada.close();
    }
}
