package Clase5;

public class EjemploMatriz {
    public static void main(String[] args) {

        int[][] notasAlumnos = {
                {5, 7},
                {6, 8}
        };
        int[][] notas = new int[4][4];
        notas[3][3] = 10;
        int valorIngresado = 0;
        int fila = 0;
        int columna = 1;
        int numero = notasAlumnos[fila][columna];
        notasAlumnos[0][0] = valorIngresado;

        double promedio = 0;
        for (int i = 0; i < notasAlumnos.length; i++) {
            for (int j = 0; j < notasAlumnos[0].length; j++) {
                promedio = promedio + notasAlumnos[i][j];
            }
        }
        System.out.println(notasAlumnos.length);    // ojo con esto
        System.out.println(promedio / (notasAlumnos.length * notasAlumnos[0].length));
    }
}
