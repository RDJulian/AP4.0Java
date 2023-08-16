package EjerciciosSemana2.EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Leer dos números y, luego, una opción (puede ser
    suma, resta, multiplicación o división), según la
    opción elegida realizar el cálculo.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //int numero1, numero2, opcion;
        int numero1, numero2;
        String opcion;

        System.out.print("Bienvenido, ingrese el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Ahora ingrese el segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.println("Ahora ingrese alguna opcion:");
        System.out.println("1: Sumar, 2: Restar, 3: Multiplicar, 4: Dividir");
        System.out.print("Ingrese la opcion: ");
        //entrada.nextLine();
        //entrada.reset();  // limpia el buffer?
        opcion = entrada.next();

        switch (opcion) {
            case "1" -> {
                System.out.println("La suma de ambos numeros es: " + (numero1 + numero2));
            }
            case "2" -> {
                System.out.println("La resta de ambos numeros es: " + (numero1 - numero2));
            }
            case "3" -> {
                System.out.println("La multiplicacion de ambos numeros es: " + (numero1 * numero2));
            }
            case "4" -> {
                System.out.println("La division entre ambos numeros es: " + (numero1 / numero2));
            }
            default -> System.out.println("Opcion no valida");
        }
        entrada.close();
    }
}