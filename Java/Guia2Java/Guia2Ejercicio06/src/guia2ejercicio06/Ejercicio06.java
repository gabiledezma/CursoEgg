package guia2ejercicio06;

import guia2ejercicio06.Entidades.Cafetera;
import guia2ejercicio06.Servicio.ServicioCafetera;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        /*
            6. Programa Nespresso. Desarrolle una clase Cafetera con los 
        atributos capacidadMaxima (la cantidad máxima de café que puede contener 
        la cafetera) y cantidadActual (la cantidad actual de café que hay en la 
        cafetera). Implemente, al menos, los siguientes métodos: 
                • Constructor predeterminado o vacío
                • Constructor con la capacidad máxima y la cantidad actual
                • Métodos getters y setters.
                • Método llenarCafetera(): hace que la cantidad actual sea igual
            a la capacidad máxima.
                • Método servirTaza(int): se pide el tamaño de una taza vacía, 
            el método recibe el tamaño de la taza y simula la acción de servir  
            la taza con la capacidad indicada. Si la cantidad actual de café “no
            alcanza” para llenar la taza, se sirve lo que quede. El método le 
            informará al usuario si se llenó o no la taza, y de no haberse 
            llenado en cuanto quedó la taza.
                • Método vaciarCafetera(): pone la cantidad de café actual en 
            cero.
                • Método agregarCafe(int): se le pide al usuario una cantidad de 
            café, el método lo recibe y se añade a la cafetera la cantidad de 
            café indicada.
         */
        ServicioCafetera sc = new ServicioCafetera();
        Cafetera c = sc.crearCafetera();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("---Menú---\n"
                    + "1. Llenar cafetera.\n"
                    + "2. Servir taza.\n"
                    + "3. Vaciar cafetera.\n"
                    + "4. Agregar café.\n"
                    + "5. Salir. ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sc.llenarCafetera(c);
                    break;
                case 2:
                    sc.servirTaza(c);
                    break;
                case 3:
                    sc.vaciarCafetera(c);
                    break;
                case 4:
                    sc.agregarCafe(c);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("La opcion ingresada NO es válida. Inténtelo nuevamente.");
            }
        } while (opcion != 5);
    }
    /*

        Cafetera c = new Cafetera(100, 15);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("---Menú---\n"
                    + "1. Llenar cafetera.\n"
                    + "2. Servir taza.\n"
                    + "3. Vaciar cafetera.\n"
                    + "4. Agregar café.\n"
                    + "5. Salir. ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    c.llenarCafetera();
                    break;
                case 2:
                    c.servirTaza();
                    break;
                case 3:
                    c.vaciarCafetera();
                    break;
                case 4:
                    c.agregarCafe();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("La opcion ingresada NO es válida. Inténtelo nuevamente.");
            }
        } while (opcion != 5);
     */
//}
}
