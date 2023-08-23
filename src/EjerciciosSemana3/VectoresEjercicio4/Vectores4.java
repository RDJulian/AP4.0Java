package EjerciciosSemana3.VectoresEjercicio4;

public class Vectores4 {

    /* El Servicio Meteorológico Nacional tiene registrado, mes por mes, la cantidad de
    lluvia caída por provincia, en mm (entero) .
    Estos datos los guarda en una matriz de 24 (23 provincias más CABA) x 12 (meses).
    Se pide, cargar esos datos en una matriz y luego:
    a. Indicar en qué mes llovió más y la cantidad (sumar columnas).
    b. Indicar la provincia donde más llovió (sumar filas).
    Nota: simplificar el problema con 3 provincias y 4 meses.
     */

    public static void main(String[] args) {

        Matriz matriz = new Matriz(24, 12, 0);
        matriz.asignarValoresAleatorios();
        matriz.imprimirMatriz();

        // Esto se puede orientar un poco mas a objetos.
        // ¿Que nueva clase podriamos hacer para que tenga el metodo calcularMaximo()?

        int[] sumatoriasFilas = new int[24];
        for (int i = 0; i < 24; i++) {
            sumatoriasFilas[i] = matriz.sumarFila(i);
        }

        int aux = 0;
        int indiceFila = 0;
        for (int i = 0; i < sumatoriasFilas.length; i++) {
            if (sumatoriasFilas[i] > aux) {
                aux = sumatoriasFilas[i];
                indiceFila = i;
            }
        }

        int[] sumatoriasColumnas = new int[12];
        for (int i = 0; i < 12; i++) {
            sumatoriasColumnas[i] = matriz.sumarColumna(i);
        }

        int cantidadMaximaLluvia = 0;
        int indiceColumna = 0;
        for (int i = 0; i < sumatoriasColumnas.length; i++) {
            if (sumatoriasColumnas[i] > aux) {
                cantidadMaximaLluvia = sumatoriasColumnas[i];
                indiceColumna = i;
            }
        }

        System.out.println("La provincia donde mas llovio fue la provicia: " + (indiceFila + 1));
        System.out.println("El mes en que mas llovio fue: " + (indiceColumna + 1) + " y llovio: " + cantidadMaximaLluvia + "mm");

        System.out.println("La traza de esta matriz es: " + matriz.calcularTraza());
    }
}