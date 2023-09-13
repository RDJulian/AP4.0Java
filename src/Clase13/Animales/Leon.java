package Clase13.Animales;

public class Leon extends Animal {
    private int cantVictimas;

    public Leon(String nombre, int edad, boolean esMacho) {
        super(nombre, edad, esMacho);   // llamando al constructor de la clase padre Animal
    }

    public void hablar() {
        System.out.println("ROAAAARR");
    }

    @Override
    public void comer() {
        System.out.println("Estoy mordiendo a un humano.");
    }
}
