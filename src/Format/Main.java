package Format;

import java.sql.Time;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        String string;

        // Algunas formas practicas de usar el metodo String.format()
        // IMPORTANTE: Para que el metodo funcione correctamente, debemos pasarle variables por parametro
        // dependiendo de cuantas veces usemos el caracter % (excepto %n). Por ejemplo:
        string = String.format("Hola %s y %s", "Juan", "Pepe");
        System.out.println(string);
        // Requiere dos parametros, mientras que
        string = String.format("Hola %s, %s y %s", "Juan", "Pepe", "Carla");
        System.out.println(string);
        // Requiere tres.

        // %s:
        // Se utiliza para insertar cualquier dato **como String** en el lugar indicado.
        // En los ejemplos anteriores se pueden ver. En la practica, es el que probablemente mas usen.

        // %c:
        // Se utiliza para insertar un caracter.
        string = String.format("Caracter: %c", 'A');
        System.out.println(string);

        // %d:
        // Se utiliza para insertar enteros (base 10).
        string = String.format("Integer: %d", 10);
        System.out.println(string);

        // Para los siguientes dos casos con doubles, se puede escribir .2, .3, etc. para especificar decimales.

        // %f:
        // Se utiliza para insertar doubles.
        string = String.format("Double: %f", 10.0);
        System.out.println(string);

        // Con dos decimales:
        string = String.format("Double con dos decimales: %.2f", 10.0);
        System.out.println(string);

        // %e:
        // Se utiliza para insertar doubles, con notacion cientifica.
        // Notacion cientifica: el numero 0,01 se puede escribir como 1x10^(-2), o 1e-2
        string = String.format("Double con notacion cientifica: %.0e", 0.01);
        System.out.println(string);

        // %x:
        // Se utiliza para insertar valores hexadecimales.
        // Nota: solo toma tipo de dato int. Se puede escribir "0x" adelante para indicar que es Hex.
        string = String.format("Hexadecimal: %x", 0xF);
        System.out.println(string);

        // %h: (de Hash)
        // Se utiliza para insertar cualquier dato como su valor Hash hexadecimal.
        // (Al que le interese, puede buscar mas informacion sobre que es Hashear).
        string = String.format("Hash: %h", "Hola");
        System.out.println(string);

        // %n:
        // Inserta un separador de linea, especifico a la plataforma.
        string = String.format("Separador: 123%n456");
        System.out.println(string);

        // %o: Numero octal (base 8). No lo veo muy practico, pero ahi esta.

        // %t:
        // Se utiliza para insertar una fecha/hora. Requiere utilizar tipos de dato especificos.
        // Luego de t, debe ir el formato deseado para la fecha/hora. Por ejemplo, H para horas.
        // Les dejo el buscar las diferentes combinaciones porque son muchas...
        // Tambien les dejo la investigacion sobre los tipos de dato relacionados con las fechas/horas.
        Time tiempo = Time.valueOf(LocalTime.now());
        string = String.format("Hora actual: %tH", tiempo);
        System.out.println(string);
    }
}