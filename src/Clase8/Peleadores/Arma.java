package Clase8.Peleadores;

// Se puede hacer algo copado con herencia...
public class Arma {
    private final int danio;

    public Arma(int danio) {
        this.danio = danio;
    }

    public void usarArma(Peleador contrincante) {
        contrincante.recibirDanio(danio);
        // usosArma--;
    }
}
