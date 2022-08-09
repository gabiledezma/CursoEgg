package guia4ejerciciosextra02.Servicios;

import guia4ejerciciosextra02.Entidades.Pelicula;
import java.util.Random;

public class ServicioPelicula {

    private Random aleatorio = new Random();

    public Pelicula crearPelicula() {
        Pelicula p = new Pelicula();
        p.setTitulo(this.crearTitulo(aleatorio.nextInt(10)));
        int duracion = (int) aleatorio.nextInt(40);
        p.setDuracion((double) duracion / 100);
        p.setEdadMinima(this.crearEdadMinima(aleatorio.nextInt(7)));
        p.setDirector(this.crearDirector(aleatorio.nextInt(10)));
        return p;
    }

    public String crearTitulo(Integer opcion) {
        String titulo = "";
        switch (opcion) {
            case 0:
                titulo = "Guerra de los Mundos";
                break;
            case 1:
                titulo = "Atrapame si puedes";
                break;
            case 2:
                titulo = "Karate Kid";
                break;
            case 3:
                titulo = "Transformers";
                break;
            case 4:
                titulo = "Avengers: ENDGAME";
                break;
            case 5:
                titulo = "Amazing Spider-Man";
                break;
            case 6:
                titulo = "Harry Potter: La Piedra Filosofal";
                break;
            case 7:
                titulo = "Joker";
                break;
            case 8:
                titulo = "Batman: Inicia";
                break;
            case 9:
                titulo = "Angry Birds";
                break;
        }
        return titulo;
    }

    public int crearEdadMinima(Integer opcion) {
        int edadMinima = 0;
        switch (opcion) {
            case 0:
                edadMinima = 0;
                break;
            case 1:
                edadMinima = 6;
                break;
            case 2:
                edadMinima = 10;
                break;
            case 3:
                edadMinima = 13;
                break;
            case 4:
                edadMinima = 16;
                break;
            case 5:
                edadMinima = 18;
                break;
            case 6:
                edadMinima = 21;
                break;
        }
        return edadMinima;
    }

    public String crearDirector(Integer opcion) {
        String director = "";
        switch (opcion) {
            case 0:
                director = "Steven Spielberg";
                break;
            case 1:
                director = "Gabriel Ledezma";
                break;
            case 2:
                director = "Abel Borsine";
                break;
            case 3:
                director = "Eduardo Anchava";
                break;
            case 4:
                director = "Claudia Fernandez";
                break;
            case 5:
                director = "Nilda Andrade";
                break;
            case 6:
                director = "Marcelina Lafuente";
                break;
            case 7:
                director = "Mike Tyson";
                break;
            case 8:
                director = "Sylvester Stallone";
                break;
            case 9:
                director = "Ryan Reynolds";
                break;
        }
        return director;
    }

}
