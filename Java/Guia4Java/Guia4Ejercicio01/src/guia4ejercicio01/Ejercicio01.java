package guia4ejercicio01;

import guia4ejercicio01.entidades.Perro;
import guia4ejercicio01.entidades.Persona;
import guia4ejercicio01.servicio.ServicioPerro;
import guia4ejercicio01.servicio.ServicioPersona;
import java.util.ArrayList;

public class Ejercicio01 {

    public static void main(String[] args) {
        /*
            1. Realizar un programa para que una Persona pueda adoptar un Perro. 
        Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre, 
        raza, edad y tamaño; y la clase Persona con atributos: nombre, apellido, 
        edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, 
        vamos a tener que pensar la lógica necesaria para asignarle a cada 
        Persona un Perro y por ultimo, mostrar desde la clase Persona, la 
        información del Perro y de la Persona.
         */
        ArrayList<Persona> lista = new ArrayList();
        ArrayList<Perro> listaperros = new ArrayList();
        ServicioPersona sp = new ServicioPersona();
        ServicioPerro sperro = new ServicioPerro();
        System.out.println("Ingrese datos de Perros");
        for (int i = 0; i < 2; i++) {
            Perro pe = sperro.crearPerro();
            listaperros.add(pe);
        }
        System.out.println("Ingrese datos de Personas");
        for (int i = 0; i < 2; i++) {
            Persona p = sp.crearPersona(listaperros);
            lista.add(p);
        }
        sp.mostrarPersonas(lista);
    }
}
