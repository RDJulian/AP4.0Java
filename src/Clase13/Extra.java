package Clase13;

import java.io.IOException;

public class Extra {
    public static void main(String[] args) throws IOException {     // NO hacer esto en el main, hay que manejar las excepciones

        char[] vec = {'h', 'o', 'l', 'a'};
        vec[0] = 'a';
        String str = "hola";
//        str[0] = 'a';     // esto NO se puede hacer

    }
}
