package Clase6;

public class Auto {
    private String color, marca;
    private int cantPuertas, cantAsientos;
    boolean estaPrendido;

    public Auto(String color, String marca, int cantPuertas, int cantAsientos) {
        this.color = color;
        this.marca = marca;
        this.cantPuertas = cantPuertas;
        this.cantAsientos = cantAsientos;
        this.estaPrendido = false;
    }

    public void encender() {
        System.out.println("Me prendi.");
        estaPrendido = true;
    }

    public void apagar() {
        System.out.println("Me apague.");
        estaPrendido = false;
    }

    public void avanzar() {
        if (estaPrendido) {
            System.out.println("Avance unos metros.");
        }
    }

    public void tocarBocina() {
        if (estaPrendido) {
            System.out.println("BEEEEEEEEEEEEEEEEEEEEEEPP");
        }
    }
    // public: se puede acceder y llamar al metodo desde cualquier lado
    // private: solo se puede acceder desde la clase.
    // protected: solo se puede acceder desde la clase y sus subclases.
}
