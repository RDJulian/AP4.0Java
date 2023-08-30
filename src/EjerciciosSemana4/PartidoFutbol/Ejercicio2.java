package EjerciciosSemana4.PartidoFutbol;/*
Argentina Programa 4.0 - Java Inicial
Semana 4 POO Ejercicio 1 - 3
Alumno: Juan José Zalazar
Año: 2023
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(30, 10, 2023);
        fecha.cambiarDia();

        PartidoFutbol partidito = new PartidoFutbol(fecha, "Argentina", "Brasil", PartidoFutbol.Estado.EMPEZADO);
        partidito.resultadoDelPartido();
        partidito.anotarGolLocal();
        partidito.anotarGolVisitante();
        partidito.resultadoDelPartido();
    }
}