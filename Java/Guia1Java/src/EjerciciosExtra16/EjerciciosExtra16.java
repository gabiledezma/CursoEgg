package EjerciciosExtra16;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtra16 {

    public static void main(String[] args) {
        /*
        16. Diseñe una función que pida el nombre y la edad de N personas e 
        imprima los datos de las personas ingresadas por teclado e indique si 
        son mayores o menores de edad. Después de cada persona, el programa 
        debe preguntarle al usuario si quiere seguir mostrando personas y 
        frenar cuando el usuario ingrese la palabra “No”.
        */
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int cantidaddepersonas, edad;
        String nombre, opcion;
        cantidaddepersonas  = aleatorio.nextInt(5);
        for (int i = 0; i < cantidaddepersonas; i++) {
            System.out.println("Ingrese su nombre: ");
            nombre=leer.nextLine();
            System.out.println("Ingrese su edad: ");
            edad=leer.nextInt();
            if (edad>17) {
                System.out.println(nombre+" tiene "+edad+" años, por lo tanto, es mayor de edad.");
            } else {
                System.out.println(nombre+" tiene "+edad+" años, por lo tanto, es menor de edad.");
            }
            System.out.println("¿Desea seguir mostrando personas?(Si/No)");
            opcion=leer.next();
            opcion=opcion.toUpperCase();
            if (opcion.equals("NO")) {
                break;
            }else {
                continue;
            }
        }
    }
    
}
