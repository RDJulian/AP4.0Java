package Clase10.Animales;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected boolean esMacho;

    public void cumplirAnios() {
        edad++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esMacho() {
        return esMacho;
    }

    public abstract void comer();
}
