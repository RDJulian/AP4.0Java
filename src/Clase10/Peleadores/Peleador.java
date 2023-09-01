package Clase10.Peleadores;

// Nos encargaron programar un sistema de peleadores para un juego
// de rol. Concretamente, necesitamos una clase Peleador, que puede
// o no instanciarse con un arma y tiene una cantidad de vida
// determinada, siempre mayor a 0.
// Las armas son otra clase, que se crean con un daño especifico.
// Este valor, por ahora, digamos que es siempre mayor que 2.
// Si un peleador no tiene arma, hace 1 de daño.
//
// El peleador debe:
// Saber equipar un arma
// Saber dañar a otro peleador
// Un peleador no puede atacar si no tiene vida.
// Saber responder si fue derrotado o no (vida == 0)
// Un peleador no puede tener menos de 0 de vida.
//
// Un poco mas complejo:
// Debe saber responder si gana o pierde contra otro peleador.
public class Peleador {
    private int vida;
    boolean tieneArma = false;
    private Arma armaEquipada;

    public Peleador(int vida) {
        this.vida = vida;
    }

    public Peleador(int vida, Arma arma) {
        this(vida);
        equiparArma(arma);
    }

    public void equiparArma(Arma arma) {
        armaEquipada = arma;
        tieneArma = true;
    }

    public void atacar(Peleador contrincante) {
        if (vida > 0) {
            if (tieneArma) {
                armaEquipada.usarArma(contrincante, this);
            } else {
                int danioBase = 1;
                contrincante.recibirDanio(danioBase);
            }
        }
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean fueDerrotado() {
        return vida == 0;
    }
}
