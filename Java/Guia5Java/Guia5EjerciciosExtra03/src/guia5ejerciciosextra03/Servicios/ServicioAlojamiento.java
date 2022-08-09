package guia5ejerciciosextra03.Servicios;

import guia5ejerciciosextra03.Entidades.Alojamiento;
import java.util.Scanner;

public class ServicioAlojamiento {

    /*
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alojamiento crearAlojamiento() {
        Alojamiento a = new Alojamiento();
        System.out.println("----Alojamiento----");
        System.out.println("Ingrese el nombre: ");
        a.setNombre(leer.next());
        System.out.println("Ingrese la dirección: ");
        a.setDireccion(leer.next());
        System.out.println("Ingrese la localidad: ");
        a.setLocalidad(leer.next());
        System.out.println("Ingrese el nombre del Gerente: ");
        a.setGerente(leer.next());
        return a;
    }
    
}
