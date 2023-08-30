package EjerciciosSemana3.POOEjercicio2;

public class Molinete {

    // Atributos
    private boolean habilitado;
    private int cantidad;
    private static int cantidadSistema = 0;

    //Métodos

    public static int getCantidadSistema() {
        return cantidadSistema;
    }

    public String getHabilitado() {
        return "Estado del molinete: " + habilitado;
    }

    public void habilitarMolinete() {
        habilitado = !habilitado;
    }

    public void incrementarCantidad() {
        if (habilitado) {
            System.out.println("Paso una persona.");
            cantidad++;
            cantidadSistema++;
        } else {
            System.out.println("El molinete esta deshabilitado, no se puede pasar.");
        }
    }

    public String getCantidad() {
        return "Pasaron: " + cantidad + " personas.";
    }
}