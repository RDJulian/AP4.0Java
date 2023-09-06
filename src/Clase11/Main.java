package Clase11;

public class Main {
    public static void main(String[] args) {
        String hola = "Hola, mundooooooooo!";
        String[] holaSplit = hola.split("oo");
        for (String s : holaSplit) {
            System.out.println(s);
        }
        Segundos segundos = new Segundos(60);
        System.out.println(segundos.convertirAMinutos());
    }
}