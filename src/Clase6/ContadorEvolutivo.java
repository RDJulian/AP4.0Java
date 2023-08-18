package Clase6;

public class ContadorEvolutivo {
    // Atributos
    private int numero = 1;

    // Métodos
    public int contar() throws InterruptedException {
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
        numero++;
        return numero;
    }
}
