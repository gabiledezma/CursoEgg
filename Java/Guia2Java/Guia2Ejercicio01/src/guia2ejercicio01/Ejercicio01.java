package guia2ejercicio01;

import guia2ejercicio01.Servicio.ServicioLibro;
import guia2ejercicio01.entidades.Libro;

public class Ejercicio01 {

    public static void main(String[] args) {
        /*
            1. Crear una clase llamada Libro que contenga los siguientes 
        atributos: ISBN, Título, Autor, Número de páginas, y un constructor con 
        todos los atributos pasados por parámetro y un constructor vacío. Crear 
        un método para cargar un libro pidiendo los datos al usuario y luego 
        informar mediante otro método el número de ISBN, el título, el autor del 
        libro y el numero de páginas
         */
        ServicioLibro sl = new ServicioLibro();
        Libro libro = sl.cargarLibro();
        sl.mostrarDatos(libro);
        /*
        Libro texto = new Libro();
        texto=texto.cargarLibro();
        texto.mostrarDatos();
         */
    }
}
