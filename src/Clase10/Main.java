package Clase10;

import Clase10.Peleadores.*;

public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Espada(7, 20);
        Arma arma2 = new Lanza(7, 20);

        Peleador peleador1 = new Peleador(50, arma1);
        Peleador peleador2 = new Peleador(50, arma2);

        while (!peleador2.fueDerrotado() && !peleador1.fueDerrotado()) {
            peleador2.atacar(peleador1);
            peleador1.atacar(peleador2);
        }

        String resultado = (peleador1.fueDerrotado() ? "Gano el peleador 2" : "Gano el peleador 1");
        System.out.println(resultado);
    }
}
