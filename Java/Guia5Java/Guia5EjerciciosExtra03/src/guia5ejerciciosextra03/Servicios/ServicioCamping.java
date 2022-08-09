package guia5ejerciciosextra03.Servicios;

import guia5ejerciciosextra03.Entidades.AlojamientoExtraHotelero;
import guia5ejerciciosextra03.Entidades.Camping;
import java.util.Scanner;

public class ServicioCamping extends ServicioAlojamientoExtraHotelero {

    /*
Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones.
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Camping crearCamping() {
        AlojamientoExtraHotelero aeh = super.crearAlojamientoExtraHotelero();
        System.out.println("----Camping----");
        System.out.println("Ingrese la capacidad máxima de carpas: ");
        int limiteCarpas = leer.nextInt();
        System.out.println("Ingrese la cantidad de baños disponibles: ");
        int cantidadBanios = leer.nextInt();
        System.out.println("¿Posee restaurant dentro de las instalaciones? (s/n)");
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
        boolean restaurant = conf;
        Camping c = new Camping(limiteCarpas, cantidadBanios, restaurant, aeh.getPrivado(), aeh.getTamanio(), aeh.getNombre(), aeh.getDireccion(), aeh.getLocalidad(), aeh.getGerente());
        return c;
    }
}
