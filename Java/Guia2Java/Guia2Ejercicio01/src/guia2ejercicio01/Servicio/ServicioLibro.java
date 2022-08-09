package guia2ejercicio01.Servicio;

import guia2ejercicio01.entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {

    public Libro cargarLibro() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro texto = new Libro();

        System.out.println("Ingrese el número de ISBN: ");
        texto.setISBN(leer.nextInt());

        System.out.println("Ingrese el número de páginas del libro: ");
        texto.setCantpaginas(leer.nextInt());

        System.out.println("Ingrese el autor del libro: ");
        texto.setAutor(leer.nextLine());

        System.out.println("Ingrese el título del libro: ");
        texto.setTitulo(leer.nextLine());

        return texto;
    }

    public void mostrarDatos(Libro libro) {

        System.out.print(libro);

    }

}
