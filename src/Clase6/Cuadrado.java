package Clase6;

public class Cuadrado {
    private double longitudDelLado;

    public Cuadrado(double longitudInicial) {
        longitudDelLado = longitudInicial;
    }

    // Este metodo funciona como un "setter".
    // Sin embargo, no suele ser buena practica usar metodos de este estilo.
    public void asignarLongitud(double nuevaLongitud) {
        longitudDelLado = nuevaLongitud;
    }

    // Este metodo funciona como un "getter".
    // Como en el caso de arriba, hay que ser cuidadosos con como se usan.
    public double obtenerLongitud() {
        return longitudDelLado;
    }

    public void mostrarLongitud() {
        System.out.println("La longitud de lado de este cuadrado es: " + longitudDelLado);
    }

    public double calcularArea() {
        return longitudDelLado * longitudDelLado;
    }
}