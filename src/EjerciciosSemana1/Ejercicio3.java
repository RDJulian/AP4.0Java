package EjerciciosSemana1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();
        // En caso de querer un double, se utiliza el metodo nextDouble();
        //double numero2 = entrada.nextDouble();

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));
        System.out.println("Division entera: " + (numero1 / numero2));
        // En este caso se guarda el resultado para poder reutilizarlo luego.
        double resultado = (double) numero1 / numero2;
        System.out.println("Division con decimales: " + resultado);
        // Forma de quitar decimales al String que luego se muestra por pantalla.
        String aux = String.format("%.2f %.3f", resultado, resultado);
        System.out.println("Division con 2 y 3 decimales: " + aux);
        System.out.println("Resto de la division: " + (numero1 % numero2));

        entrada.close();
    }
}