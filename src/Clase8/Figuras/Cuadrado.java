package Clase8.Figuras;

//Diseñar e implementar una clase Cuadrado con los atributos lado
//(longitud del lado) y esquinaSuperiorIzquierda de tipo Punto.
//Implementar un método que indique si un punto que recibe por
//parámetro pertenece o no al  cuadrado.

public class Cuadrado {
    private final double lado;
    private final Punto esquinaSuperiorIzquierda;

    public Cuadrado(double lado, Punto punto) {
        this.lado = lado;
        esquinaSuperiorIzquierda = punto;
    }

    public boolean pertenece(Punto punto) {
        return punto.estaEnRango(esquinaSuperiorIzquierda, lado, -lado);
    }
}
