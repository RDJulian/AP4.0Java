package Clase11;

public class AlimentoNutritivo implements Imprimible {
    private final String nombre;
    private final int cantCalorias;
    private final String[] vitaminas;

    public AlimentoNutritivo(String nombre, int cantCalorias, String[] vitaminas) {
        this.nombre = nombre;
        this.cantCalorias = cantCalorias;
        this.vitaminas = vitaminas;
    }

    public void mostrar() {
        System.out.println(nombre);
        System.out.println("Cantidad de calorias: " + cantCalorias);
        System.out.println("Vitaminas:");
        for (String vitamina : vitaminas) {
            System.out.println(vitamina);
        }
    }
}
