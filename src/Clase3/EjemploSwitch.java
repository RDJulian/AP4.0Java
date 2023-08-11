package Clase3;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un string: ");
        String str = entrada.nextLine();
        char character = 'a';

        switch (character) {
            case 'a' -> {
                System.out.println("Hola");
            }
            case 'b' -> {
                System.out.println("Chau");
            }
            default -> {
                System.out.println("Opción default");
            }
        }
        entrada.close();
    }
}
