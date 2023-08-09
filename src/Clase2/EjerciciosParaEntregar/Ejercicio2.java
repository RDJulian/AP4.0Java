package Clase2.EjerciciosParaEntregar;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        System.out.println("Número ingresado = " + numero);

        entrada.close();
    }
}