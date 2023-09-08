package Clase12;

import java.util.*;

public class EjArrayList {
    public static void main(String[] args) throws Exception {

        ArrayList<String> autos = new ArrayList<String>(); // crear un objeto ArrayList que almacena Strings
        autos.add("Fiat Cronos");
        autos.add("Peugeot 208");
        autos.add("Ford Mustang");

        String[] otrosAutos = {"Toyota Corolla", "Volkswagen Amarok",
                "Chevrolet Sonic", "Renault Sandero"};
        autos.addAll(List.of(otrosAutos));

        System.out.println(autos);
    }
}
