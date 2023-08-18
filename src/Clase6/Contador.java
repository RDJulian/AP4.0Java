package Clase6;

public class Contador {
    public static void contarHastaDiez() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }

    public static void contarHastaNumero(int numero) throws InterruptedException {
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}
