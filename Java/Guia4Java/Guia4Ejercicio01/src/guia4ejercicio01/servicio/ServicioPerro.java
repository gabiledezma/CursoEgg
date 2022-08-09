package guia4ejercicio01.servicio;

import guia4ejercicio01.entidades.Perro;
import java.util.Scanner;

public class ServicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro p = new Perro();
        System.out.println("Ingrese el nombre: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese la raza: ");
        p.setRaza(leer.next());
        System.out.println("Ingrese la edad: ");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño: ");
        p.setTamanio(leer.next());
        return p;
    }

}
