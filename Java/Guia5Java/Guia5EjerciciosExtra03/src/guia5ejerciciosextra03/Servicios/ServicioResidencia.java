package guia5ejerciciosextra03.Servicios;

import guia5ejerciciosextra03.Entidades.AlojamientoExtraHotelero;
import guia5ejerciciosextra03.Entidades.Residencia;
import java.util.Scanner;

public class ServicioResidencia extends ServicioAlojamientoExtraHotelero {

    /*
    Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo.
private Integer cantidadHabitaciones;
    private Boolean descuentoGremios;
    private Boolean campoDeportivo;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Residencia crearResidencia() {
        AlojamientoExtraHotelero aeh = super.crearAlojamientoExtraHotelero();
        System.out.println("----Residencia----");
        System.out.println("Ingrese la cantidad de habitaciones: ");
        int cantidadHabitaciones = leer.nextInt();
        System.out.println("¿Se hacen descuentos a gremios? (s/n)");
        String opcion;
        do {
            opcion = leer.next();
            if (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Error, opción incorrecta.");
            }
        } while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n"));
        boolean conf;
        if (opcion.equalsIgnoreCase("s")) {
            conf = true;
        } else {
            conf = false;
        }
        boolean descuentoGremios = conf;
        System.out.println("¿Posee campo deportivo? (s/n)");
        String opcion2;
        do {
            opcion2 = leer.next();
            if (!opcion2.equalsIgnoreCase("s") && !opcion2.equalsIgnoreCase("n")) {
                System.out.println("Error, opción incorrecta.");
            }
        } while (!opcion2.equalsIgnoreCase("s") && !opcion2.equalsIgnoreCase("n"));
        boolean conf2;
        if (opcion2.equalsIgnoreCase("s")) {
            conf2 = true;
        } else {
            conf2 = false;
        }
        boolean campoDeportivo = conf2;
        Residencia r = new Residencia(cantidadHabitaciones, descuentoGremios, campoDeportivo, aeh.getPrivado(), aeh.getTamanio(), aeh.getNombre(), aeh.getDireccion(), aeh.getLocalidad(), aeh.getGerente());
        return r;
    }

}
