package Clase4;

import java.util.Scanner;

public class EjFactorial {
    // Realiza un programa que pida al usuario un número
    // entero y calcule su factorial utilizando un bucle
    // for. El programa debe validar que el número
    // ingresado sea mayor o igual a cero, y en caso
    // contrario pedirle al usuario que ingrese
    // nuevamente el número hasta que lo haga
    // correctamente. El factorial de un número n se
    // define como el producto de todos los enteros
    // positivos desde 1 hasta n.
    // 5! = 1 * 2 * 3 * 4 * 5 = 120
    // 0! = 1
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingrese un numero mayor de 0: ");
//        int numero = input.nextInt();
//        while (numero <= 0) {
//            System.out.print("Número inválido.\nIngrese un numero mayor de 0: ");
//            numero = input.nextInt();
//        }
//        int fact = 1;
//        String operacion = "1";
//        for (int i = 2; i <= numero; ++i) {
//            fact *= i;  // fact = fact * i
//            operacion = operacion + " * " + i;
//        }
//        System.out.println(numero + "! = " + operacion + " = " + fact);
//        input.close();

        // otra resolucion
//        Scanner scIn = new Scanner(System.in);
//        int intNum = -1;
//        int intFactorial = 1;
//
//        System.out.println("Factorial de un entero.");
//
//        do {
//            System.out.print("Ingrese un número entero: ");
//            intNum = scIn.nextInt();
//            if (intNum < 0) System.out.println("Ingreso inválido. No se permite numero negativo.");
//        } while (intNum < 0);
//
//        for (int i = 1; i <= intNum; i++) {
//            intFactorial = intFactorial * i;
//        }
//
//        System.out.println("El factorial de " + intNum + " es: " + intFactorial);
        // scIn.close();
        // otra resolucion 2
        Scanner scan = new Scanner(System.in);
        int input;

        do {
            System.out.print("Ingrese un número positivo: ");
            input = scan.nextInt();
        } while (input <= 0);

        scan.close();

        int total = 1;

        for (int i = 1; i <= input; i++) {
            total = total * i;
        }

        System.out.println("El factorial de: " + input + " es = " + total);
    }

}
