package EjerciciosSemana4.Fecha;

public class Ejercicio1 {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(31, 12, 2000);
        Fecha fecha2 = new Fecha();
        fecha.mostrar();
        fecha.cambiarDia();
        fecha.mostrar();

        fecha2.mostrar();
        for (int i = 0; i < 60; i++) {
            fecha2.cambiarDia();
        }
        fecha2.mostrar();

        fecha = new Fecha(31, 12, 2000);
        fecha2 = new Fecha(31, 12, 2000);

        System.out.println(fecha.esIgual(fecha2));
    }
}