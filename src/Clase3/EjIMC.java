package Clase3;

import java.util.Scanner;

public class EjIMC {
    // 2.3 Crea un programa que solicite al usuario su peso y altura, y a
    // partir de estos datos calcule su índice de masa corporal (IMC).
    // Luego, muestra por pantalla si la persona está en su peso ideal,
    // por debajo o por encima de este. El peso ideal se encuentra entre
    // un IMC de 18.5 y 25.0. Para calcular el IMC, utiliza la siguiente
    // fórmula: IMC = peso / (altura * altura) donde peso se mide en
    // kilogramos y altura en metros.
    public static void main(String[] args) {
        // esta resolución solo contempla 2 casos: está dentro del peso ideal o no
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Ingrese su peso: ");
//        double peso = teclado.nextDouble();
//        System.out.print("Ingrese su altura: ");
//        double altura = teclado.nextDouble();
//        double pesoIdeal = peso / (Math.pow(altura, 2)); // altura * altura
//        if (pesoIdeal >= 18.5 && pesoIdeal <= 25.0) {
//            System.out
//                    .println("su indice de masa corporal es: " + " " + pesoIdeal + " " + "usted esta en un peso ideal");
//        } else {
//            System.out.println("Usted no esta en su peso ideal");
//        }
//
//        teclado.close();

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su altura: ");
        double altura = input.nextDouble();
        System.out.print("Ingrese su peso: ");
        double peso = input.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);

        if (imc > 25.0) {
            System.out.print("Exceso de valor IMC");
        } else {
            if (imc >= 18.5) {
                System.out.print("Valores estables de IMC");
            } else {
                System.out.print("Por debajo de los valores estables del IMC");
            }
        }

        input.close();

    }
}
