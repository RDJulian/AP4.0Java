package EjerciciosSemana2.EstructurasIterativas;/*6. Leer A y B, enteros. Calcular C = A x B mediante sumas sucesivas e imprimir el
    resultado.*/


import java.util.Scanner;

public class Ejercicio6 {
    /*
    Leer A y B, enteros. Calcular C = A x B mediante sumas sucesivas e imprimir el
resultado.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese numero A: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese numero B: ");
        int b = entrada.nextInt();
        System.out.print("Multiplicacion C=AxB ");
        int c = 0;
        for (int i = 0; i < b; i++)
            c += a;     // c = c + a
        System.out.print("Total de " + a + " * " + b + " = " + c);

        entrada.close();

    }

}
