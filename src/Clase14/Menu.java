package Clase14;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            opcion = pedirOpcion(scanner);
            switch (opcion) {
                case 1 -> {
                    System.out.println("Se ejecuto opcion 1");
                    // Llamado a otra clase
                }
                case 2 -> {
                    System.out.println("Se ejecuto opcion 2");
                    // Llamado a otra clase
                }
                case 3 -> {
                    System.out.println("Se ejecuto opcion 3");
                    // Llamado a otra clase
                }
                case 4 -> {
                    System.out.println("Saliendo del programa...");
                }
                default -> {
                    System.out.println("Opcion incorrecta.");
                }
            }
        } while (opcion != 4);
        scanner.close();
    }

    private static int pedirOpcion(Scanner scanner) {
        int opcion = 0;
        System.out.print("Ingrese una opcion: ");
        if (scanner.hasNextInt()) {
            opcion = scanner.nextInt();
        } else {
            scanner.nextLine();
        }
        return opcion;
    }
}
