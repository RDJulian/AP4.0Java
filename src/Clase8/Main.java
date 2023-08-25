package Clase8;

import Clase8.Figuras.Cuadrado;
import Clase8.Figuras.Punto;
import Clase8.Figuras.Rectangulo;
import Clase8.Peleadores.Arma;
import Clase8.Peleadores.Peleador;

public class Main {
    public static void main(String[] args) {
//        Punto punto = new Punto(1.0, 1.0);
//        Cuadrado cuadrado = new Cuadrado(3.0, punto);
//
//        Punto punto2 = new Punto(2.0, 2.0);
//
//        boolean res = cuadrado.pertenece(punto2);
//
//        System.out.println("¿El punto esta adentro del Cuadrado?: " + res);
        Arma arma1 = new Arma(3);
        Arma arma2 = new Arma(5);

        Peleador peleador1 = new Peleador(60, arma1);
        Peleador peleador2 = new Peleador(40, arma2);

        while (!peleador2.fueDerrotado() && !peleador1.fueDerrotado()) {
            peleador2.atacar(peleador1);
            peleador1.atacar(peleador2);
        }

        String resultado = (peleador1.fueDerrotado() ? "Gano p2" : "Gano p1");
        System.out.println(resultado);
    }
}
