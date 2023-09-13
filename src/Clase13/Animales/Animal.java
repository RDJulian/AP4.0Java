package Clase13.Animales;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected boolean esMacho;

    public Animal(String nombre, int edad, boolean esMacho) {
        this.nombre = nombre;
        this.edad = edad;
        this.esMacho = esMacho;
    }

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
