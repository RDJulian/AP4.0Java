package Clase13;

import java.io.FileWriter;
import java.io.IOException;

public class EscrituraArchivo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/Clase13/archivo.txt");  // acá SI se está accediendo al archivo físico (en disco)
            writer.write("Este es un ejemplo de FileWriter en Java.\n");
            writer.write("Esto se está escribiendo el archivo especificado.\n");
            //writer.write("hola");
            writer.close();
            System.out.println("Datos escritos en el archivo");

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
