package guia5ejerciciosextra03.Servicios;

import guia5ejerciciosextra03.Entidades.Hotel;
import guia5ejerciciosextra03.Entidades.Hotel5Estrellas;
import java.util.Scanner;

public class ServicioHotel5Estrellas extends ServicioHotel {

    /*
• Hotel *****  
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad
Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas.
    Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo
“B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles
para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más
limosinas tenga el hotel, más caro será.
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel5Estrellas crearHotel5Estrellas() {
        Hotel h = super.crearHotel();
        System.out.println("----5 Estrellas----");
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
        System.out.println("Ingrese la cantidad de salones de conferencia: ");
        int cantidadSalonesDeConferencia = leer.nextInt();
        System.out.println("Ingrese la cantidad de suites: ");
        int cantidadSuites = leer.nextInt();
        System.out.println("Ingrese la cantidad de limosinas: ");
        int cantidadLimosinas = leer.nextInt();
        int precioHabitaciones = this.precioHabitacion(h.getPrecioHabitaciones(), capacidadRestaurant, gimnasio, cantidadLimosinas, cantidadSuites);
        Hotel5Estrellas h5 = new Hotel5Estrellas(gimnasio, nombreRestaurant, capacidadRestaurant, cantidadSalonesDeConferencia, cantidadSuites, cantidadLimosinas, h.getCantidadHabitaciones(), h.getCantidadCamas(), h.getCantidadPisos(), precioHabitaciones, h.getNombre(), h.getDireccion(), h.getLocalidad(), h.getGerente());
        return h5;
    }

    /*
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
     */
    public int precioHabitacion(int precioHabitaciones, int capacidadRestaurant, boolean gimnasio, int cantidadLimosinas, int cantidadSuites) {
        int aux;
        int precioRestaurant;
        int precioGimnasio;
        int precioLimosinas;
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
        precioLimosinas = cantidadLimosinas * 15;
        aux = precioHabitaciones + precioRestaurant + precioGimnasio + precioLimosinas + cantidadSuites;
        return aux;
    }

}
