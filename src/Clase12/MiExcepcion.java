package Clase12;

public class MiExcepcion extends Exception {
    public String toString() {  // sobreescribiendo el método toString() de Throwable
        return "Esta excepcion es lanzada cuando se ingresa un numero negativo";
    }
}
