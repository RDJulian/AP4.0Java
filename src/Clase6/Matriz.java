package Clase6;

// NOTA: Vamos a programar esta clase de 0 la clase del miercoles 23.
public class Matriz {
    private final int fila;
    private final int columna;
    private final int[][] matriz;

    private boolean indiceValido(int i, int j) {
        return (0 <= i && 0 <= j && i < fila && j < columna);
    }

    public Matriz(int fila, int columna) {
        if (fila < 1 || columna < 1) {
            throw new RuntimeException();
        } else {
            this.fila = fila;
            this.columna = columna;
            this.matriz = new int[fila][columna];
        }
    }

    public Matriz(int fila, int columna, int valor) {
        this(fila, columna);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = valor;
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.printf("%n");
        }
    }

    public int elemento(int i, int j) {
        if (indiceValido(i, j)) {
            return matriz[i][j];
        } else {
            throw new RuntimeException();
        }
    }

    public void cambiarElemento(int i, int j, int valor) {
        if (indiceValido(i, j)) {
            matriz[i][j] = valor;
        } else {
            throw new RuntimeException();
        }
    }
}
