package Clase2.EjerciciosParaEntregar;

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
        int aux = a;
        a = b;
        b = aux;
//        a = b;    guarda con esto
//        b = a;
        System.out.println("A :" + a);
        System.out.println("B :" + b);
        input.close();
    }
}
