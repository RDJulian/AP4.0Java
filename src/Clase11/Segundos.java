package Clase11;

public class Segundos {
    int segundos;

    public Segundos(int secs) {
        segundos = secs;
    }

    public int getSegundos() {
        return segundos;
    }

    public int convertirAMinutos() {
        return segundos / 60;
    }
}
