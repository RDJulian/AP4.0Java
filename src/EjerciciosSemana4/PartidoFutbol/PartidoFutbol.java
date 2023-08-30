package EjerciciosSemana4.PartidoFutbol;

public class PartidoFutbol {
    // ATRIBUTOS
    private final String equipoLocal;
    private final String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public enum Estado {
        NO_COMENZADO,
        EMPEZADO,
        FINALIZADO
    }

    Estado estado;
    Fecha fecha;

    //METODOS
    //Constructor
    public PartidoFutbol(Fecha fecha, String local, String visitante, Estado estado) {
        this.fecha = fecha;
        equipoLocal = local;
        equipoVisitante = visitante;
        this.estado = estado;
    }

    public PartidoFutbol(Fecha fecha, String local, String visitante, int golesLocal, int golesVisitante) {
        this.fecha = fecha;
        equipoLocal = local;
        equipoVisitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        estado = Estado.FINALIZADO;
    }

    public void resultadoDelPartido() {
        if (estado != Estado.NO_COMENZADO) {
            System.out.print("Resultado del partido.\nFecha: ");
            fecha.mostrar();
            System.out.printf("%n%s %d - %d %s%n", equipoLocal, golesLocal, golesVisitante, equipoVisitante);
            System.out.println("Estado: " + estado);
        }
    }

    public Fecha obtenerFecha() {
        return fecha;
    }

    public void anotarGolLocal() {
        if (estado == Estado.EMPEZADO) {
            golesLocal++;
        }
    }

    public void anotarGolVisitante() {
        if (estado == Estado.EMPEZADO) {
            golesVisitante++;
        }
    }
}