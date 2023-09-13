package Clase13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {   // con FileReader
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("src/Clase13/archivo.txt");
            // leyendo caracter a caracter
//            int caracter;
//            while ((caracter = fileReader.read()) != -1) {
//                System.out.print((char) caracter);
//            }

            // leyendo de a varios caracteres a la vez (con un buffer)
            char[] buf = new char[4];
            int caracteresLeidos = fileReader.read(buf);
            System.out.println("Caracteres leidos: " + caracteresLeidos);
            System.out.println(buf);

            System.out.println("Caracteres salteados: " + fileReader.skip(1));

            caracteresLeidos = fileReader.read(buf);
            System.out.println("Caracteres leidos: " + caracteresLeidos);
            System.out.println(buf);

            fileReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
