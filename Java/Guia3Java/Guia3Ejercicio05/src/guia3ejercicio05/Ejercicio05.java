package guia3ejercicio05;

import guia3ejercicio05.Entidad.Pais;
import guia3ejercicio05.Servicio.ServicioPais;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        /*
            5. Se requiere un programa que lea y guarde países, y para evitar 
        que se ingresen repetidos usaremos un conjunto. El programa pedirá un 
        país en un bucle, se guardará el país en el conjunto y después se le 
        preguntará al usuario si quiere guardar otro país o si quiere salir, si 
        decide salir, se mostrará todos los países guardados en el conjunto.
            Después deberemos mostrar el conjunto ordenado alfabéticamente para 
        esto recordar como se ordena un conjunto.
            Y por ultimo, al usuario se le pedirá un país y se recorrerá el 
        conjunto con un Iterator, se buscará el país en el conjunto y si está 
        en el conjunto se eliminará el país que ingresó el usuario y se 
        mostrará el conjunto. Si el país no se encuentra en el conjunto se le 
        informará al usuario.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPais sp = new ServicioPais();
        HashSet<Pais> Paises = new HashSet();
        String seguir;
        boolean confirmar = false;
        do {
            Pais p = sp.crearPais();
            Paises.add(p);
            do {
                System.out.println("¿Desea guardar otro país?");
                seguir = leer.next();
                switch (seguir) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        confirmar = true;
                        break;
                    default:
                        confirmar = false;
                }
            } while (confirmar == false);
        } while (seguir.equalsIgnoreCase("s"));
        sp.mostrarPaises(Paises);
        sp.ordenarPaisesPorNombre(Paises);
        sp.buscarYEliminar(Paises);
    }

}
