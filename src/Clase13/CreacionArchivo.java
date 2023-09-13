package Clase13;

import java.io.File;
import java.io.IOException;

public class CreacionArchivo {
    public static void main(String[] args) {
        File archivo = new File("./src/Clase13/archivo.txt");   // acá NO se está accediendo al archivo físico (en disco)
        if (!archivo.exists()) {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("El archivo se creo correctamente");
                } else System.out.println("Error al crear el archivo");
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("El archivo ya existe en el directorio actual");
        }
    }
}
