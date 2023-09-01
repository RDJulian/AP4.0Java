package Clase10.Peleadores;

// La lanza ataca al contrincante con reglas similares a la espada,
// pero tiene una chance del 20% de hacer un ataque adicional, que hace
// la mitad del danio.

public class Lanza extends Arma {
    public Lanza(int danio, int usosMaximos) {
        super(danio, usosMaximos);
    }

    @Override
    public void usarArma(Peleador contrincante, Peleador usuario) {
        contrincante.recibirDanio(getDanioFinal());
        int dado = (int) (Math.random() * 4);
        // 0, 1, 2, 3, 4;
        if (dado == 0) {
            contrincante.recibirDanio(getDanioFinal() / 2);
            System.out.println("DANIO DOBLE!!");
        }
        gastarArma();
    }
}
