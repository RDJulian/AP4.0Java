package Clase10.Peleadores;


// La espada es el arma mas comun, y hace danio "comun", en el
// sentido que ataca al contrincante con el danio que dice que tiene

public class Espada extends Arma {
    public Espada(int danio, int usosMaximos) {
        super(danio, usosMaximos);
    }

    @Override
    public void usarArma(Peleador contrincante, Peleador usuario) {
        contrincante.recibirDanio(getDanioFinal());
        gastarArma();
    }
}
