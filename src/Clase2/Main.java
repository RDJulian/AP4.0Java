package Clase2;

public class Main {
    public static void main(String[] args) {
        // Asignación de string.
        String string = "Hola a todos como estan.";
        String otroString;

        // Asignando el VALOR de una de las variables a otra.
        otroString = string;

        // Reasignando el VALOR.
        string = "Chau.";

        // Concatenando strings.
        otroString += string;

        System.out.println(string);
        System.out.println(otroString);


        // Ejemplo del metodo String.format
        String stringSalida;
        int resultado;

        // Digamos que es el resultado de una cuenta.
        resultado = 10;

        // El metodo inserta la variable deseada (si se puede castear) en el lugar del %s
        // Importante destacar que el metodo devuelve un String
        stringSalida = String.format("El resultado de la cuenta es: %s", resultado);
        System.out.println(stringSalida);
    }
}