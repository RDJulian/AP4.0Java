package EjerciciosSemana4.PartidoFutbol;

public class Fecha {
    // ATRIBUTOS
    private int anio;
    private int mes;
    private int dia;

    // METODOS
    //Constructor
    public Fecha() {
        anio = 2000;
        mes = 1;
        dia = 1;
    }

    //Constructor
    public Fecha(int dia, int mes, int anio) {
        if (!validarFecha(anio, mes, dia)) {
            System.out.println("Error. Fecha inválida."); //reemplazar por lanzamiento de excepción
        } else {
            this.anio = anio;
            this.mes = mes;
            this.dia = dia;
        }
    }

    public void mostrar() {
        System.out.print(dia + "/" + mes + "/" + anio);
    }

    // Notese que se repite la misma estructura de codigo varias veces...
    public void cambiarDia() {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia == 31) {
                    dia = 1; //if(dia < 31) dia++;
                    incrementarMes();
                } else {
                    dia++;
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia == 30) {
                    dia = 1;
                    incrementarMes();
                } else {
                    dia++; //if(dia < 30) dia++;
                }
            }
            case 2 -> {
                if (esBisiesto()) {
                    if (dia == 29) {
                        dia = 1;
                        incrementarMes();
                    } else {
                        dia++;
                    }
                } else {
                    if (dia == 28) {
                        dia = 1;
                        incrementarMes();
                    } else {
                        dia++; //if(dia < 28 ) dia++;
                    }
                }
            }
        }
    }

    // Ojo: el dia 30/2/2023 pasa y no es una fecha valida.
    private boolean validarFecha(int anio, int mes, int dia) {
        //En este caso no se va a tomar como válido los años menores a 1000 y mayor o igual a 10000.
        //completar para validar los días, mes y año (considerando bisiesto) correctamente lanzando error o cartel.
        return (mes > 0 && mes <= 12) && (dia > 0 && dia <= 31) && (anio >= 1000 && anio < 10000);
    }

    private boolean esBisiesto() {
        return anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
    }

    private void incrementarMes() {
        if (mes == 12) {
            mes = 1;
            incrementarAnio();
        } else {
            mes++;
        }
    }

    private void incrementarAnio() {
        anio++;
    }
}
