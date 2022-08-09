package EjerciciosExtra18;

import java.util.Scanner;

public class EjerciciosExtra18 {

    public static void main(String[] args) {
        /*
        18. Realizar un algoritmo que calcule la suma de todos los elementos de 
        un vector de tamaño N, con los valores ingresados por el usuario.
        */
        Scanner leer = new Scanner(System.in);
        int tamanio, sumatoria=0;
        System.out.println("Ingrese el tamaño del vector: ");
        tamanio = leer.nextInt();
        int[]vector = new int [tamanio];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor para el subíndice: "+i);
            vector[i]=leer.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            sumatoria=sumatoria+vector[i];
        }
        System.out.println("La suma total de los elementos del vector es: "+sumatoria);
    }
    
}
