package Clase8.Figuras;

//Diseñar e implementar una clase Rectangulo con los atributos
//base, altura y esquinaSuperiorIzquierda de tipo Punto.
//Implementar un método que indique si un punto que recibe por
//parámetro pertenece o no al  cuadrado.

public class Rectangulo {
    private final double base;
    private final double altura;
    private final Punto esquinaSuperiorIzquierda;

    public Rectangulo(double base, double altura, Punto punto) {
        this.base = base;
        this.altura = altura;
        esquinaSuperiorIzquierda = punto;
    }

    public boolean pertenece(Punto punto) {
        return punto.estaEnRango(esquinaSuperiorIzquierda, base, -altura);
    }
}