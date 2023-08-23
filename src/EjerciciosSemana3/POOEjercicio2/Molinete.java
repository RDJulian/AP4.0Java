package EjerciciosSemana3.POOEjercicio2;

public class Molinete {

    // Atributos
    private boolean habilitado;
    private int cantidad;

    //Métodos

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
        } else {
            System.out.println("El molinete esta deshabilitado, no se puede pasar.");
        }
    }

    public String getCantidad() {
        return "Pasaron: " + cantidad + " personas.";
    }
}