package guia3ejerciciosextra04;

import guia3ejerciciosextra04.Servicio.ServicioCiudad;
import java.util.HashMap;

public class EjerciciosExtra04 {

    public static void main(String[] args) {
        /*
            4. Almacena en un HashMap los códigos postales de 10 ciudades a 
        elección de estapágina: https://mapanet.eu/index.htm. Nota: Poner el 
        código postal sin la letra, solo el numero.
            • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
            • Muestra por pantalla los datos introducidos
            • Pide un código postal y muestra la ciudad asociada si existe sino 
        avisa al usuario.
            • Muestra por pantalla los datos
            • Agregar una ciudad con su código postal correspondiente más al 
        HashMap.
            • Elimina 3 ciudades existentes dentro del HashMap, que pida el 
        usuario.
            • Muestra por pantalla los datos.
         */
        ServicioCiudad sc = new ServicioCiudad ();
        HashMap <Integer, String> listadoCiudades = new HashMap(); // codigo postal, nombre de la ciudad
        sc.crearCiudades(listadoCiudades);
        sc.crearMenu(listadoCiudades);
    }

}
