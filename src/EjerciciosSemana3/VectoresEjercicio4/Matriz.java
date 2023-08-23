package EjerciciosSemana3.VectoresEjercicio4;

public class Matriz {
    // Atributos
    final private int filas;
    final private int columnas;
    final private int[][] matriz;

    // Metodos
    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new int[filas][columnas];
    }

    public Matriz(int filas, int columnas, int valorInicial) {
        this(filas, columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = valorInicial;
            }
        }
    }

    public void setValor(int fila, int columna, int valor) {
        matriz[fila][columna] = valor;
    }

    public int getValor(int fila, int columna) {
        return matriz[fila][columna];
    }

    public void asignarValoresAleatorios() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 100 + 1);
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

    public int sumarFila(int fila) {
        int sumaTotalFila = 0;
        for (int columna = 0; columna < columnas; columna++) {
            sumaTotalFila += matriz[fila][columna];
        }
        return sumaTotalFila;
    }

    public int sumarColumna(int columna) {
        int sumaTotalColumna = 0;
        for (int fila = 0; fila < filas; fila++) {
            sumaTotalColumna += matriz[fila][columna];
        }
        return sumaTotalColumna;
    }

    public int calcularTraza() {
        int iteraciones = Math.min(filas, columnas);
        int traza = 0;
        for (int i = 0; i < iteraciones; i++) {
            traza += matriz[i][i];
        }
        return traza;
    }
}
