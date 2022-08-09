package guia3ejercicio01bis;

import guia3ejercicio01bis.Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01bis {
    
    public static void main(String[] args) {
        /*
            1. Diseñar un programa que lea y guarde razas de perros en un 
        ArrayList de tipo String. El programa pedirá una raza de perro en un 
        bucle, el mismo se guardará en la lista y después se le preguntará al 
        usuario si quiere guardar otro perro o si quiere salir. Si decide salir, 
        se mostrará todos los perros guardados en el ArrayList.
         */
 /*
            2. Continuando el ejercicio anterior, después de mostrar los perros,
        al usuario se le pedirá un perro y se recorrerá la lista con un 
        Iterator, se buscará el perro en la lista. Si el perro está en la lista, 
        se eliminará el perro que ingresó el usuario y se mostrará la lista 
        ordenada. Si el perro no se encuentra en la lista, se le informará al 
        usuario y se mostrará la lista ordenada.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Perro> listaPerros = new ArrayList();
        Perro p = new Perro();
        String salir;
        do {
            p.crearYGuardarPerro(listaPerros);
            System.out.println("¿Desea salir? s/n ");
            salir = leer.next();
        } while (!salir.equals("s"));
        p.mostrarPerros(listaPerros);
        p.buscarYEliminar(listaPerros);
    }
    
}
