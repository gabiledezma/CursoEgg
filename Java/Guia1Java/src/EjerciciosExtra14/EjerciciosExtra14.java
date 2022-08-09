package EjerciciosExtra14;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtra14 {

    public static void main(String[] args) {
        /*
        14. Se dispone de un conjunto de N familias, cada una de las cuales 
        tiene una M cantidad de hijos. Escriba un programa que pida la cantidad
        de familias y para cada familia la cantidad de hijos para averiguar la 
        media de edad de los hijos de todas las familias.
        */
        Scanner leer = new Scanner(System.in);
        int cantidad, hijos,sumatoria=0;
        double promedio;
        Random aleatorio = new Random();
        int edades;
        System.out.println("Ingrese la cantidad de familias: ");
        cantidad=leer.nextInt();
        System.out.println("Ingrese la cantidad de hijos: ");
        hijos=leer.nextInt();
        int[][]familias = new int[cantidad][hijos];
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < hijos; j++) {
                
                edades  = aleatorio.nextInt(22);
                familias[i][j]= edades;
            }
        }
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < hijos; j++) {
                sumatoria=sumatoria+familias[i][j];
            }
        }
        promedio=sumatoria/(cantidad*hijos);
        System.out.println("La media de los hijos de las familias es: "+promedio);
    } 
}
