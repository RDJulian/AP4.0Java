package EjerciciosSemana1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero A: ");
        int a = input.nextInt();
        System.out.print("Ingrese el numero B: ");
        int b = input.nextInt();
        System.out.println("A :" + a);
        System.out.println("B :" + b);
        System.out.println("************MAGIC************");
        int aux = a;    // INTERCAMBIO DE VARIABLES
        a = b;
        b = aux;
//        a = b;    Cuidado con esto, se pierde el valor inicial de a y quedan
//        b = a;    ambas variables con el mismo valor (el valor inicial de b).
        System.out.println("A :" + a);
        System.out.println("B :" + b);
        input.close();
    }
}