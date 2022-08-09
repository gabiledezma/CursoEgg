package guia5ejerciciosextra03.Servicios;

import guia5ejerciciosextra03.Entidades.Hotel;
import guia5ejerciciosextra03.Entidades.Hotel4Estrellas;
import java.util.Scanner;

public class ServicioHotel4Estrellas extends ServicioHotel {

    /*
    Boolean gimnasio, 
    String nombreRestaurant, 
    Integer capacidadRestaurant, 
    
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel4Estrellas crearHotel4Estrellas() {
        Hotel h = super.crearHotel();
        System.out.println("----4 Estrellas----");
        System.out.println("¿Qué gimnasio posee? (a/b)");
        String gym;
        do {
            gym = leer.next();
            if (!gym.equalsIgnoreCase("a") && !gym.equalsIgnoreCase("b")) {
                System.out.println("Error, opción incorrecta.");
            }
        } while (!gym.equalsIgnoreCase("a") && !gym.equalsIgnoreCase("b"));
        boolean conf;
        if (gym.equalsIgnoreCase("a")) {
            conf = true;
        } else {
            conf = false;
        }
        boolean gimnasio = conf;
        System.out.println("Ingrese el nombre del restaurant: ");
        String nombreRestaurant = leer.next();
        System.out.println("Ingrese la capacidad del restaurant: ");
        int capacidadRestaurant = leer.nextInt();
        int precioHabitaciones = this.precioHabitacion(h.getPrecioHabitaciones(), capacidadRestaurant, gimnasio);
        Hotel4Estrellas h4 = new Hotel4Estrellas(gimnasio, nombreRestaurant, capacidadRestaurant, h.getCantidadHabitaciones(), h.getCantidadCamas(), h.getCantidadPisos(), precioHabitaciones, h.getNombre(), h.getDireccion(), h.getLocalidad(), h.getGerente());
        return h4;
    }

    /*
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + (valor agregado por gimnasio) .
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.

     */
    public int precioHabitacion(int precioHabitaciones, int capacidadRestaurant, boolean gimnasio) {
        int aux;
        int precioRestaurant;
        int precioGimnasio;
        if (capacidadRestaurant > 50) {
            precioRestaurant = 50;
        } else {
            if (capacidadRestaurant >= 30) {
                precioRestaurant = 30;
            } else {
                precioRestaurant = 10;
            }
        }
        if (gimnasio == true) {
            precioGimnasio = 50;
        } else {
            precioGimnasio = 30;
        }
        aux = precioHabitaciones + precioRestaurant + precioGimnasio;
        return aux;
    }

}
