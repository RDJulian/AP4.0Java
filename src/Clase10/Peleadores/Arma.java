package Clase10.Peleadores;

// Complejicemos esto:

// Vamos a tener tres tipos distintos de armas: Espada, Lanza, Hacha.
// Todas las armas van a hacer algo distinto al ser usadas para atacar.
// Todas las armas, ahora, van a tener una durabilidad, que no puede
// ser un numero menor que 0.
// Toda arma se instancia con un numero maximo de usos que puede tener.
// Al atacar, se usa un uso, y si el arma NO tiene usos (usos == 0),
// hace la mitad del danio, redondenando para abajo.
//
// Tenemos que:
// 1. Implementar los tres tipos distintos de armas.
// 2. Proveer un metodo para reparar el arma (usos = usosMaximos)
public abstract class Arma {
    protected final int danio;
    protected int usos;
    protected final int usosMaximos;

    public Arma(int danio, int usosMaximos) {
        this.danio = danio;
        this.usosMaximos = usosMaximos;
        usos = usosMaximos;
    }

    public void repararArma() {
        usos = usosMaximos;
    }

    public abstract void usarArma(Peleador contrincante, Peleador usuario);

    protected int getDanioFinal() {
        int danioFinal;
        if (usos == 0) {
            danioFinal = danio / 2;
        } else {
            danioFinal = danio;
        }
        return danioFinal;
    }

    protected void gastarArma() {
        usos--;
        if (usos < 0) {
            usos = 0;
        }
    }
}