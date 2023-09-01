package Clase10.Animales;

public class Perro extends Animal {
    public Perro(String nombre, int edad, boolean esMacho) {
        this.nombre = nombre;
        this.edad = edad;
        this.esMacho = esMacho;
    }

    public int getEdad() {
        return edad * 7;
    }

    @Override
    public void comer() {
        System.out.println("Estoy mordiendo un hueso.");
    }
}
