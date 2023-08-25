package Clase8.Figuras;

public class Punto {
    private final double x;
    private final double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Punto p) {
        double a = x - p.x;
        double b = y - p.y;
        return Math.sqrt(a * a + b * b);
    }

    public boolean estaEnRango(Punto p, double x, double y) {
        return (estaComprendido(this.x, p.x, p.x + x) &&
                estaComprendido(this.y, p.y, p.y + y));
    }

    private boolean estaComprendido(double n, double n1, double n2) {
        return (Math.min(n1, n2) <= n && n <= Math.max(n1, n2));
    }
}
