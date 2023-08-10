package Clase3;

import java.util.Scanner;

public class EjemploIf {
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
            int num = 1;    // Definiendo una variable dentro del scope del if, ignorar la advertencia.
            System.out.println("El primero es mayor que el segundo");
        } else {
            // Supongamos que queremos diferenciar el caso en que ambos números sean iguales o el primero sea
            // menor que el segundo, para eso utilizamos un if anidado.
            if (numero1 == numero2) {
                System.out.println("El primero es igual que el segundo");
            } else System.out.println("El primero es menor que el segundo");
        }

        // La siguiente linea no funciona, num no existe en este scope (del main).
        // System.out.println(num);

        // Una forma alternativa de escribir las condiciones anteriores:
        if (numero1 > numero2) {
            System.out.println("El primero es mayor que el segundo");
        } else if (numero1 == numero2) {
            System.out.println("El primero es igual que el segundo");
        } else {
            System.out.println("El primero es menor que el segundo");
        }
        // Esto es EXACTAMENTE lo mismo que lo anterior a nivel algoritmo.

        entrada.close();
    }
}