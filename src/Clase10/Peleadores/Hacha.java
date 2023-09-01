package Clase10.Peleadores;

// El hacha siempre hace dos ataques, pero tambien le hace danio al portador,
// El danio inflijido al usuario del arma es siempre 2.

public class Hacha extends Arma {
    public Hacha(int danio, int usosMaximos) {
        super(danio, usosMaximos);
    }

    @Override
    public void usarArma(Peleador contrincante, Peleador usuario) {
        for (int i = 0; i < 2; i++) {
            contrincante.recibirDanio(getDanioFinal());
        }
        gastarArma();
        usuario.recibirDanio(2);
    }
}
