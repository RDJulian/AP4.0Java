package Clase3;

import java.util.Scanner;

public class Ejemplos {
    // 2.1 Realiza un programa que lea dos números enteros desde
    // teclado y muestre por pantalla si el primero es mayor que el
    // segundo.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            int num = 1;    // definiendo variables en el scope del if
            System.out.println("El primero es mayor que el segundo");
        } else {
            if (numero1 == numero2) {
                System.out.println("El primero es igual que el segundo");
            } else System.out.println("El primero es menor que el segundo");
        }
        // System.out.println(num);     no funciona

        entrada.close();
    }
}
