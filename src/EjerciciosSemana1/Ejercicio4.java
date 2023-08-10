package EjerciciosSemana1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base;    // Otra forma de definir primero una variable y después asignarle un valor (línea 10).
        System.out.print("Ingrese la base del rectángulo: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = entrada.nextDouble();
        double perimetro = base * 2 + altura * 2;
        //double perimetro = calcularPerimetro(base, altura);   Lo veremos mas adelante (métodos/funciones).
        double area = base * altura;
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
        entrada.close();
    }

    // Forma de declarar una funcion, lo veremos mas adelante.
//    private static double calcularPerimetro(double bas, double alt) {
//        return bas * 2 + alt * 2;
//    }
}