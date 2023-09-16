package Clase14;

import java.io.*;
import java.util.ArrayList;

// Leer el archivo apps.csv, procesarlo y luego calcular el promedio del
// rating entre las 9 apps.
public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("./src/Clase14/apps.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileError = new FileWriter("./src/Clase14/errores.txt");
            PrintWriter printError = new PrintWriter(fileError);

            String linea;
            String[] palabras;
            double puntaje;
            ArrayList<Double> puntajes = new ArrayList<>();

            // Lectura.
            while ((linea = bufferedReader.readLine()) != null) {
                // Hacen lo que necesiten con la linea.
                // Pueden instanciar objetos de la clase X.
                palabras = linea.split(",");
                try {
                    puntaje = Double.parseDouble(palabras[3]);
                    puntajes.add(puntaje);
                } catch (NumberFormatException e) {
                    // Escritura de errores.
                    System.out.println(palabras[3] + " tiene un formato incorrecto al esperado.");
                    printError.println(linea);
                }
            }

            double suma = 0;
            for (Double p : puntajes) {
                suma += p;
            }

            double resultado = suma / puntajes.size();
            String salida = String.format("El promedio de Rating de las apps es: %.2f", resultado);
            System.out.println(salida);
            bufferedReader.close();


            // Escritura.
            FileWriter fileWriter = new FileWriter("./src/Clase14/promedio.txt");
            fileWriter.write(String.format("%.2f\n", resultado));
            fileWriter.close();
            printError.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}