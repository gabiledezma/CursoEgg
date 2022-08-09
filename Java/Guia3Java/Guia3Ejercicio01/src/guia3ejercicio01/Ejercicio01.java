package guia3ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        /*
            1. Diseñar un programa que lea y guarde razas de perros en un 
        ArrayList de tipo String. El programa pedirá una raza de perro en un 
        bucle, el mismo se guardará en la lista y después se le preguntará al 
        usuario si quiere guardar otro perro o si quiere salir. Si decide salir, 
        se mostrará todos los perros guardados en el ArrayList.
         */

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> listaPerros = new ArrayList();
        String raza, salir;
        do {
            System.out.println("Ingrese una raza de perros: ");
            raza = leer.next();
            listaPerros.add(raza);
            System.out.println("¿Desea salir? s/n ");
            salir = leer.next();
        } while (!salir.equals("s"));
        System.out.println(listaPerros.toString());
    }

}
