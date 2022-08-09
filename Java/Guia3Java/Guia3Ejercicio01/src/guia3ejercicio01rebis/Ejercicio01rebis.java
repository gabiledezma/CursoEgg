package guia3ejercicio01rebis;

import guia3ejercicio01rebis.Entidades.Perrorebis;
import guia3ejercicio01rebis.Servicio.ServicioPerrorebis;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01rebis {
    
    public static void main(String[] args) {
        /*
            1. Diseñar un programa que lea y guarde razas de perros en un 
        ArrayList de tipo String. El programa pedirá una raza de perro en un 
        bucle, el mismo se guardará en la lista y después se le preguntará al 
        usuario si quiere guardar otro perro o si quiere salir. Si decide salir, 
        se mostrará todos los perros guardados en el ArrayList.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Perrorebis> listaPerros = new ArrayList();
        ServicioPerrorebis sp = new ServicioPerrorebis();
        Perrorebis p = new Perrorebis();
        String salir;
        do {
            sp.crearYGuardarPerro(listaPerros);
            System.out.println("¿Desea salir? s/n ");
            salir = leer.next();
        } while (!salir.equals("s"));
        sp.mostrarPerros(listaPerros);
        sp.buscarYEliminar(listaPerros);
    }
    
}
