package Clase10;

import Clase10.Animales.*;

public class Main2 {
    public static void main(String[] args) {
        Animal perrito = new Perro("Montur", 4, true);
        Animal leonsito = new Leon("Huesos", 11, false);

        System.out.println(leonsito.getEdad());
        System.out.println(perrito.getEdad());

        Animal[] animales = new Animal[2];
        animales[0] = perrito;
        animales[1] = leonsito;

        for (int i = 0; i < animales.length; i++) {
            animales[i].comer();
        }
    }
}
