package guia5ejercicio01;

import guia5ejercicio01.Entidades.Animal;
import guia5ejercicio01.Entidades.Caballo;
import guia5ejercicio01.Entidades.Gato;
import guia5ejercicio01.Entidades.Perro;

public class Ejercicio01 {

    public static void main(String[] args) {
        /*
            1. Tenemos una clase padre Animal junto con sus 3 clases hijas 
        Perro, Gato, Caballo.
            La clase Animal tendrá como atributos el nombre, alimento, edad y 
        raza del Animal.
            Crear un método en la clase Animal a través del cual cada clase 
        hija deberá mostrar luego un mensaje por pantalla informando de que se 
        alimenta.
         */

        Animal perro = new Perro("Stitch", "Carne", 15, "Doberman");
        perro.Alimentarse();

        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();

        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();

        Animal caballo = new Caballo("Spirit", "Pasto", 25, "Fino");
        caballo.Alimentarse();

    }

}
