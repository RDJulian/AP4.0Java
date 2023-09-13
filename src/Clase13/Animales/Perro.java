package Clase13.Animales;

public class Perro extends Animal {
    public Perro(String nombre, int edad, boolean esMacho) {
        super(nombre, edad, esMacho);   // llamando al constructor de la clase padre Animal
    }

    public int getEdad() {
        return edad * 7;
    }

    @Override
    public void comer() {
        System.out.println("Estoy mordiendo un hueso.");
    }
}
