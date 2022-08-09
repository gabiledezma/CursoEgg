package guia5ejerciciosextra03.Servicios;

import guia5ejerciciosextra03.Entidades.Alojamiento;
import guia5ejerciciosextra03.Entidades.AlojamientoExtraHotelero;
import java.util.Scanner;

public class ServicioAlojamientoExtraHotelero extends ServicioAlojamiento {

    /*
los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa.
    protected Boolean privado;
    protected Integer tamanio;//en metros cuadrados
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AlojamientoExtraHotelero crearAlojamientoExtraHotelero() {
        Alojamiento a = super.crearAlojamiento();
        System.out.println("----Alojamiento Extra Hotelero----");
        System.out.println("¿Es privado? (s/n)");
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
        boolean privado = conf;
        System.out.println("Ingrese el espacio que ocupa: (en metros cuadrados)");
        int tamanio = leer.nextInt();
        AlojamientoExtraHotelero aeh = new AlojamientoExtraHotelero(privado, tamanio, a.getNombre(), a.getDireccion(), a.getLocalidad(), a.getGerente());
        return aeh;
    }
}
