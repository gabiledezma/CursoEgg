package guia3ejerciciosextra03.Servicio;

import guia3ejerciciosextra03.Entidad.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLibro(HashSet<Libro> libreria) {
        Libro l = new Libro();
        System.out.println("Ingrese el titulo: ");
        l.setTitulo(leer.next());
        System.out.println("Ingrese el autor: ");
        l.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de ejemplares: ");
        l.setNumeroDeEjemplares(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares prestados: ");
        l.setNumeroDeEjemplaresPrestados(leer.nextInt());
        libreria.add(l);
    }

    public boolean prestamo(HashSet<Libro> libreria) {
        boolean conf = false;
        System.out.println("Ingrese el titulo del libro que desea pedir prestado: ");
        String buscado = leer.next();
        Iterator<Libro> it = libreria.iterator();
        while (it.hasNext()) {
            Libro l = it.next();
            if (l.getTitulo().equals(buscado)) {
                if (l.getNumeroDeEjemplares() > l.getNumeroDeEjemplaresPrestados()) {
                    l.setNumeroDeEjemplares(l.getNumeroDeEjemplares() - 1);
                    l.setNumeroDeEjemplaresPrestados(l.getNumeroDeEjemplaresPrestados() + 1);
                    conf = true;
                } else {
                    conf = false;
                }
            }
        }
        return conf;

    }

    public boolean devolucion(HashSet<Libro> libreria) {
        boolean conf = false;
        System.out.println("Ingrese el titulo del libro que desea devolver: ");
        String buscado = leer.next();
        Iterator<Libro> it = libreria.iterator();
        while (it.hasNext()) {
            Libro l = it.next();
            if (l.getTitulo().equals(buscado)) {
                if (l.getNumeroDeEjemplaresPrestados() != 0) {
                    l.setNumeroDeEjemplaresPrestados(l.getNumeroDeEjemplaresPrestados() - 1);
                    l.setNumeroDeEjemplares(l.getNumeroDeEjemplares() + 1);
                    conf = true;
                } else {
                    conf = false;
                }
            }
        }
        return conf;
    }

    public void mostrarLibreria(HashSet<Libro> libreria) {
        for (Libro libro : libreria) {
            System.out.println(libro.toString());
        }
    }
}
