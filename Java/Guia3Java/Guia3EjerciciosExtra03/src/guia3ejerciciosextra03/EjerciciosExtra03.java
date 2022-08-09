package guia3ejerciciosextra03;

import guia3ejerciciosextra03.Entidad.Libro;
import guia3ejerciciosextra03.Servicio.ServicioLibro;
import java.util.HashSet;
import java.util.Scanner;

public class EjerciciosExtra03 {

    public static void main(String[] args) {
        /*
            3. Implemente un programa para una Librería haciendo uso de un 
        HashSet para evitar datos repetidos. Para ello, se debe crear una clase
        llamada Libro que guarde la información de cada uno de los libros de 
        una Biblioteca. La clase Libro debe guardar el título del libro, autor,
        número de ejemplares y número de ejemplares prestados. También se 
        creará en el main un HashSet de tipo Libro que guardará todos los 
        libros creados.
            En el main tendremos un bucle que crea un objeto Libro pidiéndole al
        usuario todos sus datos y los seteandolos en el Libro. Despues, ese 
        Libro se guarda en el conjunto y se le pregunta al usuario si quiere 
        crear otro Libro o no.
            La clase Librería contendrá además los siguientes métodos:
                • Constructor por defecto.
                • Constructor con parámetros.
                • Métodos Setters/getters.
                • Método prestamo(): El usuario ingresa el titulo del libro que 
        quiere prestar y se lo busca en el conjunto. Si está en el conjunto, se 
        llama con ese objeto Libro al método.
        El método se incrementa de a uno, como un carrito de compras, el 
        atributo ejemplares prestados, del libro que ingresó el usuario. Esto 
        sucederá cada vez que se realice un préstamo del libro. No se podrán 
        prestar libros de los que no queden ejemplares disponibles para prestar.
        Devuelve true si se ha podido realizar la operación y false en caso 
        contrario.
                • Método devolucion(): El usuario ingresa el titulo del libro 
        que quiere devolver y se lo busca en el conjunto. Si está en el 
        conjunto, se llama con ese objeto al método. El método decrementa de a 
        uno, como un carrito de compras, el atributo ejemplares prestados, del 
        libro seleccionado por el usuario. Esto sucederá cada vez que se 
        produzca la devolución de un libro. No se podrán devolver libros donde 
        que no tengan ejemplares prestados. Devuelve true si se ha podido 
        realizar la operación y false en caso contrario.
                • Método toString para mostrar los datos de los libros.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libro> libreria = new HashSet();
        ServicioLibro sl = new ServicioLibro();
        String seguir;
        do {
            sl.crearLibro(libreria);
            System.out.println("¿Desea crear otro libro? s/n ");
            seguir = leer.next();
        } while (seguir.equalsIgnoreCase("s"));
        sl.mostrarLibreria(libreria);
        if (sl.prestamo(libreria) == true) {
            System.out.println("Se prestó el libro solicitado.");
        } else {
            System.out.println("No se puede prestar el libro solicitado");
        }
        sl.mostrarLibreria(libreria);
        if (sl.devolucion(libreria) == true) {
            System.out.println("Se devolviò el libro correctamente.");
        } else {
            System.out.println("No se pudo devolver el libro.");
        }
        sl.mostrarLibreria(libreria);
    }

}
