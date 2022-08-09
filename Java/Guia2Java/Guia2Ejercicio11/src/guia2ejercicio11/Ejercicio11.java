package guia2ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        /*
            11. Pongamos de lado un momento el concepto de POO, ahora vamos a 
        trabajar solo con la clase Date. En este ejercicio deberemos instanciar
        en el main, una fecha usando la clase Date, para esto vamos a tener que 
        crear 3 variables, dia, mes y anio que se le pedirán al usuario para 
        poner el constructor del objeto Date. Una vez creada la fecha de tipo 
        Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y 
        la fecha actual, que se puede conseguir instanciando un objeto Date con 
        constructor vacío.
            Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
            Ejemplo fecha actual: Date fechaActual = new Date();
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dia, mes, anio, aniodif=0;
        System.out.println("Ingrese una fecha(DD/MM/AAAA): .\n"
                + "Empezando por el Dia: ");
        dia = leer.nextInt();
        System.out.println("Mes: ");
        mes = leer.nextInt();
        System.out.println("Año: ");
        anio = leer.nextInt();
        int aniodate = anio - 1900;
        Date fecha = new Date(aniodate, mes, dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        if (fecha.compareTo(fechaActual) < 0) {
            aniodif = fechaActual.getYear() - anio;
            System.out.println("La fecha ingresada es anterior a la actual.");
            
        } else if (fecha.compareTo(fechaActual) > 0) {
            aniodif = anio - fechaActual.getYear();
            System.out.println("La fecha ingresada es posterior a la actual.");
            
        } else {
            
            System.out.println("Las fechas son iguales.");
            
        }
        System.out.println("Entre las fechas hay "+aniodif+ "años de diferencia.");
       

    }

}
