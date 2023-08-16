package EjerciciosSemana2.EstructurasIterativas;/*
Argentina Programa 4.0 - Java Inicial
Semana 2 Ejercicio 4 - Estructuras repetitivas
Alumno: Juan José Zalazar
Año: 2023
*/


import java.util.Scanner;

public class Ejercicio4 {
    /*
    Leer por teclado un valor N y, luego, N números enteros.
    Se pide imprimir el mayor,el menor y la cantidad de veces
    que aparece cada uno.Ejemplo: Se ingresan los valores
    8 (se van a ingresar 8 valores), y luego:
    3, 9, 5, 2, 9, 2, 1, 9
    Debe imprimir:
    “El valor máximo es 9 y aparece 3 veces”
    “El valor mínimo es 1 y aparece 1 vez”
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Búsqueda del mayor y menor entero.");
        System.out.print("Ingrese la cantidad de enteros: ");
        int cantidad = entrada.nextInt();

        StringBuilder strNumeros = new StringBuilder(); //String strNumeros = "";
        int numero;
        int mayor = 0;
        int menor = 0;
        int nroVecesMayor = 0;
        int nroVecesMenor = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el " + i + "° número: ");
            numero = entrada.nextInt();

            if (i == 1) {
                menor = numero;
                mayor = numero;
                nroVecesMayor = 1;  // = i
                nroVecesMenor = 1;  // = i
                strNumeros = new StringBuilder(String.format("%d", numero)); //strNumeros = String.format("%d", numero);

            } else {
                if (numero > mayor) {
                    mayor = numero;
                    nroVecesMayor = 1;
                } else {
                    if (numero == mayor) {
                        nroVecesMayor++;
                    }
                }
                if (numero < menor) {
                    menor = numero;
                    nroVecesMenor = 1;
                } else if (numero == menor) {
                    nroVecesMenor++;
                }

                strNumeros.append(", ").append(numero); //strNumeros += ", " + numero;
            }

        }
        entrada.close();

        System.out.println("\nNúmeros ingresados: " + strNumeros);

        String mensajeMayor, mensajeMinimo;
        if (nroVecesMayor == 1)
            mensajeMayor = "El valor máximo es " + mayor + " y aparece " + nroVecesMayor + " vez";
        else mensajeMayor = String.format("El valor máximo es %d y aparece %d veces", mayor, nroVecesMayor);
        if (nroVecesMenor == 1)
            mensajeMinimo = String.format("El valor mínimo es " + menor + " y aparece " + nroVecesMenor + " vez");
        else mensajeMinimo = String.format("El valor mínimo es " + menor + " y aparece " + nroVecesMenor + " veces");

        System.out.println(mensajeMayor);
        System.out.println(mensajeMinimo);
        // ideal
        System.out.println("El valor máximo es " + mayor + " y aparece " + nroVecesMayor + (nroVecesMayor == 1 ? "vez" : "veces"));

    }
}