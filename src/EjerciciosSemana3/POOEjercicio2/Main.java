package EjerciciosSemana3.POOEjercicio2;

public class Main {
    public static void main(String[] args) {
        Molinete molinete = new Molinete();
        Molinete molinete2 = new Molinete();
        molinete2.habilitarMolinete();

        molinete.habilitarMolinete();
        System.out.println(molinete.getHabilitado());

        molinete.habilitarMolinete();
        System.out.println(molinete.getHabilitado());

        System.out.println(molinete.getCantidad());
        molinete.incrementarCantidad();
        System.out.println(molinete.getCantidad());

        molinete.habilitarMolinete();
        for (int i = 0; i < 10; i++) {
            molinete2.incrementarCantidad();
        }

        for (int i = 0; i < 5; i++) {
            molinete.incrementarCantidad();
        }

        System.out.println(molinete.getCantidad());
        System.out.println(molinete2.getCantidad());
        System.out.println(Molinete.getCantidadSistema());
    }
}