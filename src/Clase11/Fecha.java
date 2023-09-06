package Clase11;

public class Fecha implements Imprimible {
    //Atributos
    int anios;
    int mes;
    int dia;

    public boolean esIgual(Fecha fecha2) {
        return (this.dia == fecha2.dia && this.mes == fecha2.mes && this.anios == fecha2.anios);
    }

    public Fecha() {
        this(1, 1, 2000);
    }

    public Fecha(int dia, int mes, int anios) {
        this.dia = dia;
        this.mes = mes;
        this.anios = anios;
    }

    public void mostrar() {
        //mostrar (se visualiza: dia/mes/anio)
        System.out.println("La Fecha es: " + dia + "/" + mes + "/" + anios);
    }

    public void cambiarDia() {
        //cambiarDia (pasa al día siguiente)

        int diasEnEsteMes = 31; // Por defecto, consideramos 31 días

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasEnEsteMes = 30;
        }

        // Agregar codigo para mes Febrero y anio bisiesto.

        // Verificar si estamos en el último día del mes
        if (dia == diasEnEsteMes) {
            dia = 1;

            // Verificar si estamos en diciembre (cambio de año)
            if (mes == 12) {
                mes = 1;
                anios++;
            } else {
                mes++;
            }
        } else {
            dia++;
        }
    }
}