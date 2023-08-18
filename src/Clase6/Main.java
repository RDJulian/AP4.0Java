package Clase6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        // Quiero un contador, que cada vez que cuente, la proxima cuente un numero mas.
//        // ej: Contar()
//        // 1, 2, 3
//        // Contar()
//        // 1, 2, 3, 4
//        Scanner scanner = new Scanner(System.in);
//        ContadorEvolutivo contador = new ContadorEvolutivo();
//        String opcion;
//        do {
//            contador.contar();
//            System.out.print("Ingrese s/n para seguir o cortar el programa: ");
//            opcion = scanner.nextLine();
//        } while (!opcion.equals("n"));

//        Auto auto = new Auto("Rojo", "Toyota", 2, 3);
//        Auto otroAuto = new Auto("Gris", "Ford", 4, 4);
//        auto.tocarBocina();
//        auto.encender();
//        auto.apagar();
//
        // Ejemplo para ver qué pasa cuando un metodo devuelve un dato.
//        ContadorEvolutivo contador = new ContadorEvolutivo();
//        int numeroHastaElQueConte = contador.contar();
//        System.out.println("Numero: " + numeroHastaElQueConte);

        Cuadrado miCuadrado = new Cuadrado(22.2);
        System.out.println(miCuadrado.calcularArea());

        miCuadrado.asignarLongitud(10.78);
        miCuadrado.mostrarLongitud();
        System.out.println(miCuadrado.calcularArea());
    }
}