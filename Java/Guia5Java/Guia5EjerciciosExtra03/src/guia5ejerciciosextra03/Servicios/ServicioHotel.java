package guia5ejerciciosextra03.Servicios;

import guia5ejerciciosextra03.Entidades.Alojamiento;
import guia5ejerciciosextra03.Entidades.Hotel;
import java.util.Scanner;

public class ServicioHotel extends ServicioAlojamiento {

    /*
    protected Integer cantidadHabitaciones;
    protected Integer cantidadCamas;
    protected Integer cantidadPisos;
    protected Integer precioHabitaciones;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel crearHotel() {
        Alojamiento a = super.crearAlojamiento();
        System.out.println("----Hotel----");
        System.out.println("Ingrese la cantidad de habitaciones: ");
        int cantidadHabitaciones = leer.nextInt();
        System.out.println("Ingrese la cantidad de camas por habitación: ");
        int cantidadCamas = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos: ");
        int cantidadPisos = leer.nextInt();
        int precioHabitaciones = this.precioHabitacion(cantidadHabitaciones, cantidadCamas, cantidadPisos);
        Hotel h = new Hotel(cantidadHabitaciones, cantidadCamas, cantidadPisos, precioHabitaciones, a.getNombre(), a.getDireccion(), a.getLocalidad(), a.getGerente());
        return h;
    }

    /*
     PrecioHabitación = $50 + ($1 x capacidad del hotel) .

     */
    public int precioHabitacion(int cantidadHabitaciones, int cantidadCamas, int cantidadPisos) {
        int capacidadHotel = cantidadHabitaciones * cantidadCamas * cantidadPisos;
        int precioHabitaciones = 50 + capacidadHotel;
        return precioHabitaciones;
    }
}
