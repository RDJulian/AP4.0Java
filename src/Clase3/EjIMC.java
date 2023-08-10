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
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su altura: ");
        double altura = input.nextDouble();
        System.out.print("Ingrese su peso: ");
        double peso = input.nextDouble();
        double imc = peso / (altura * altura);
        // Forma alternativa de calcular, usando Math.pow
        // double pesoIdeal = peso / (Math.pow(altura, 2));
        System.out.println("IMC: " + imc);

        // Esta resolución solo contempla 2 casos: está dentro del peso ideal o no.
//        if (pesoIdeal >= 18.5 && pesoIdeal <= 25.0) {
//            System.out.println("su índice de masa corporal es: " + pesoIdeal + ". Usted está en un peso
//            ideal");
//        } else {
//            System.out.println("Usted no esta en su peso ideal");
//        }

        if (imc > 25.0) {
            System.out.print("Exceso de valor IMC");
        } else {
            // Si entró acá es porque no se cumple la condición del if,
            // es decir, que el IMC es menor o igual a 25.0.
            // No es necesario volver a chequear que se cumpla esa condición.
            // ej: if (icm <= 25.0 && imc >= 18.5)
            if (imc >= 18.5) {
                System.out.print("Valores estables de IMC");
            } else {
                System.out.print("Por debajo de los valores estables del IMC");
            }
        }

        input.close();
    }
}
