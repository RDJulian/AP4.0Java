package Clase13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo2 {  // con BufferedReader
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/Clase13/archivo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // leyendo de a varios caracteres a la vez (con un buffer)
            char[] buf = new char[4];
            int caracteresLeidos = bufferedReader.read(buf, 0, 4);
            System.out.println("Caracteres leidos: " + caracteresLeidos);
            System.out.println(buf);

            bufferedReader.mark(0);     // para dejar una marca y luego retornar el cursor del archivo con
            // el reset, para seguir leyendo desde ahí

            caracteresLeidos = bufferedReader.read(buf, 0, 4);
            System.out.println("Caracteres leidos: " + caracteresLeidos);
            System.out.println(buf);

            bufferedReader.reset();
            caracteresLeidos = bufferedReader.read(buf, 0, 4);
            System.out.println("Caracteres leidos: " + caracteresLeidos);
            System.out.println(buf);

            // para leer de a líneas en Strings
//            String linea;
//            while ((linea = bufferedReader.readLine()) != null) {
//                System.out.println(linea);
//            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
