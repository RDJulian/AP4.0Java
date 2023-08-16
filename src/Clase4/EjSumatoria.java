package Clase4;

import java.util.Scanner;

public class EjSumatoria {
    // Escribir un programa que pida un número entero al
    // usuario y muestre por pantalla la suma de todos
    // los números que lo preceden, incluyendo al número
    // pedido.
    // Ej: Si la entrada es 5 -> 1 + 2 + 3 + 4 + 5 = 15
    // -> La salida es 15
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero positivo: ");
        int num = entrada.nextInt();

        int acumulador = 0;
//        for (int i = 1; i <= num; i++) {
//            if (i % 2 == 0)     // condicion numero par
//                acumulador = acumulador + i;
//            // acumulador += i;
//            //System.out.println("Resultado parcial: " + acumulador);
//            // i = 3;   // se puede pero guarda con esto, puede causar un loop infinito
//        }
        int i = 1;
        while (i <= num) {
            acumulador = acumulador + i;
            i++;  // ojo con olvidarse esto
        }

        System.out.println("El resultado final es: " + acumulador);
        entrada.close();
    }
}
