package EjerciciosSemana2.EstructurasIterativas;

import java.util.Scanner;

public class Ejercicio5 {
    /*
     * . Dada una serie de números enteros, determinar el valor máximo, mínimo y las
     * posiciones en que éstos se encontraban en la serie. El programa deberá ir
     * preguntando si hay más números para ingresar.
     * …
     * Probá el ejercicio anterior con números positivos y negativos.
     * Solo con negativos.
     * Con un solo número.
     * Con dos números distintos.
     * Con dos números iguales.
     * Con el máximo en la primera posición y el mínimo en la última.
     * Con el máximo en la última posición y el mínimo en la primera.
     * Con el máximo y el mínimo en cualquier posición, salvo la primera y la última
     * Verificá que funcione correctamente en todos los casos.
     * Al finalizar graficá un diagrama de flujo.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("----------Ingrese números hasta que desee salir con 'cero'----------");
        Scanner teclado = new Scanner(System.in);
        int numIngresado = teclado.nextInt();
        int posicionMaxima = 0, posicionMinima = 0, valorMaximo = Integer.MIN_VALUE, valorMinimo = Integer.MAX_VALUE;
        // Aca use las contanstes integer porque me van a garantizar los valores max y
        // min que ingrese el usuario y tambien si son numeros negativos

        if (numIngresado != 0) {
            valorMaximo = numIngresado;
            valorMinimo = numIngresado;
            posicionMaxima = 1;
            posicionMinima = 1;
            System.out
                    .println(
                            "----------Si desea finalizar el programa, ingrese cero(0); de lo contrario, ingrese más números----------");
        }

        int posicion = 2;
        // Aca arranca desde la posicion 2 porque ya asignamos al primer ingreso como
        // posicionmax y min como la primera la primera posicion

        while (numIngresado != 0) {
            numIngresado = teclado.nextInt();

            if (numIngresado != 0) {
                if (numIngresado > valorMaximo) {
                    valorMaximo = numIngresado;
                    posicionMaxima = posicion;
                }

                if (numIngresado < valorMinimo) {
                    valorMinimo = numIngresado;
                    posicionMinima = posicion;
                }

                System.out.println(
                        "----------Si desea finalizar el programa, ingrese cero(0) de lo contrario, ingrese más números----------");
                posicion++;
            }
        }
        System.out.println("----------Finalizaste el programa, te dejo los resultados----------");
        System.out.println("El valor MAXIMO es: " + valorMaximo + " y se encuentra en la posición: " + posicionMaxima);
        System.out.println("El valor MINIMO es: " + valorMinimo + " y se encuentra en la posición: " + posicionMinima);
        teclado.close();
    }
}