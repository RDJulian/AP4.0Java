package Clase2.EjerciciosParaEntregar;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Hola " + nombre + ", bienvenido/a!");

        entrada.close();
    }
}