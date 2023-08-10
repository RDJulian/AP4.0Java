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
            int num = 1;    // definiendo una variable en el scope del if, ignorar la warning
            System.out.println("El primero es mayor que el segundo");
        } else {
            // supongamos que queremos diferenciar el caso en que ambos números sean iguales o el primero sea
            // menor que el segundo, para eso utilizamos un if anidado
            if (numero1 == numero2) {
                System.out.println("El primero es igual que el segundo");
            } else System.out.println("El primero es menor que el segundo");
        }
        // System.out.println(num);     no funciona, num no existe en este scope (del main)

        entrada.close();
    }
}
