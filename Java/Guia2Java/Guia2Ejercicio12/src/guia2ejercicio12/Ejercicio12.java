package guia2ejercicio12;

import guia2ejercicio12.Entidades.Persona;
import guia2ejercicio12.Servicio.ServicioPersona;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        /*
            12. Implemente la clase Persona. Una persona tiene un nombre y una 
        fecha de nacimiento (Tipo Date), constructor vacío, constructor 
        parametrizado, get y set. Y los siguientes métodos:
        
        Nota: encontraras un ejemplo descargable de un Date como atributo en 
        Moodle.
        
        • Agregar un método de creación del objeto que respete la siguiente 
        firma: crearPersona(). Este método rellena el objeto mediante un 
        Scanner y le pregunta al usuario el nombre y la fecha de nacimiento de 
        la persona a crear, recordemos que la fecha de nacimiento debe 
        guardarse en un Date y los guarda en el objeto.
        • Escribir un método calcularEdad() a partir de la fecha de nacimiento 
        ingresada. Tener en cuenta que para conocer la edad de la persona 
        también se debe conocer la fecha actual.
        • Agregar a la clase el método menorQue(int edad) que recibe como 
        parámetro otra edad y retorna true en caso de que el receptor tenga 
        menor edad que la persona que se recibe como parámetro, o false en caso
        contrario.
        • Metodo mostrarPersona(): este método muestra la persona creada en el 
        método anterior.

         */
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPersona sp = new ServicioPersona();
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();
        Date fechaNacimiento = new Date(anio, mes, dia);
        Persona p1 = sp.crearPersona(fechaNacimiento);
        p1.setNombre(nombre);
        Date fechaActual = new Date();
        sp.calcularEdad(p1);
        System.out.println("Ingrese una edad para comparar: ");
        int edadComparativa = leer.nextInt();
        if (sp.menorQue(p1, edadComparativa) == true) {
            System.out.println("Es menor que la edad ingresada.");
        } else {
            System.out.println("Es mayor o tiene la misma edad que la edad ingresada.");
        }
        sp.mostrarPersona(p1);

        /*
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p1 = new Persona();
        System.out.println("Ingrese su nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();
        Date fechaNacimiento = new Date(anio, mes, dia);
        p1.crearPersona(fechaNacimiento);
        Date fechaActual = new Date();
        p1.calcularEdad();
        System.out.println("Ingrese una edad para comparar: ");
        int edadComparativa = leer.nextInt();
        if (p1.menorQue(edadComparativa) == true) {
            System.out.println("Es menor que la edad ingresada.");
        } else {
            System.out.println("Es mayor o tiene la misma edad que la edad ingresada.");
        }
        p1.mostrarPersona();
         */
    }
    
}
