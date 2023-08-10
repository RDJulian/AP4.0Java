package EjerciciosSemana1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double radioEsfera, areaEsfera, volumenEsfera;

        System.out.print("Ingrese el radio de la Esfera: ");
        radioEsfera = entrada.nextDouble();

        areaEsfera = 4 * Math.PI * Math.pow(radioEsfera, 2);
        volumenEsfera = 4.0 / 3 * Math.PI * Math.pow(radioEsfera, 3);

        System.out.println("El area de la Esfera es: " + areaEsfera);
        System.out.println("El volumen de la Esfera es: " + volumenEsfera);

        entrada.close();
    }
}