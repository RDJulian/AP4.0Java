package Clase10.Animales;

public class Leon extends Animal {
    private int cantVictimas;

    public Leon(String nombre, int edad, boolean esMacho) {
        this.nombre = nombre;
        this.edad = edad;
        this.esMacho = esMacho;
    }

    public void hablar() {
        System.out.println("ROAAAARR");
    }

    @Override
    public void comer() {
        System.out.println("Estoy mordiendo a un humano.");
    }
}
