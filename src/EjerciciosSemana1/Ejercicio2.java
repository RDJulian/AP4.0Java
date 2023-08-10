package EjerciciosSemana1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        System.out.println("Número ingresado = " + numero);

        entrada.close();
    }
}