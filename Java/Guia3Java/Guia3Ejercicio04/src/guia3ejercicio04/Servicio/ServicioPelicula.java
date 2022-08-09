package guia3ejercicio04.Servicio;

import guia3ejercicio04.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarPelicula(ArrayList<Pelicula> cartelera) {
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula: ");
        p.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula: ");
        p.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula (en horas):");
        p.setDuracion(leer.nextDouble());
        cartelera.add(p);
    }

    public void mostrarPeliculas(ArrayList<Pelicula> cartelera) {
        System.out.println(cartelera.toString());
    }

    public void mostrarPeliculasLargas(ArrayList<Pelicula> cartelera) {
        int contador = 0;
        Iterator<Pelicula> it = cartelera.iterator();
        while (it.hasNext()) {
            Pelicula p = it.next();
            if (p.getDuracion() > 1) {
                System.out.println(p.toString());
            } else {
                contador++;
            }
        }
        if (contador == cartelera.size()) {
            System.out.println("Ninguna pelicula dura más de 1 hora. ");
        }
    }

    public void masLargaAMasCorta(ArrayList<Pelicula> cartelera) {

        Collections.sort(cartelera, Pelicula.compararDuracion);

        System.out.println(cartelera.toString());

    }

    public void masCortaAMasLarga(ArrayList<Pelicula> cartelera) {

        Collections.sort(cartelera, Pelicula.compararDuracionInvertida);

        System.out.println(cartelera.toString());

    }

    public void tituloAlfabeticamente(ArrayList<Pelicula> cartelera) {
        Collections.sort(cartelera, Pelicula.compararTitulo);

        System.out.println(cartelera.toString());

    }

    public void directorAlfabeticamente(ArrayList<Pelicula> cartelera) {
        Collections.sort(cartelera, Pelicula.compararDirector);

        System.out.println(cartelera.toString());
    }
}
