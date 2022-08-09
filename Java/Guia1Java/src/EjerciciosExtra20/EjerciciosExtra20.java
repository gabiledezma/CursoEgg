package EjerciciosExtra20;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtra20 {

    public static void main(String[] args) {
        /*
        20. Crear una función rellene un vector con números aleatorios, 
        pasándole un arreglo por parámetro. Después haremos otra función o 
        procedimiento que imprima el vector
        */
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamaniovector;
        tamaniovector  = aleatorio.nextInt(10);
        int[]vector = new int [tamaniovector];
        if (rellenarvector(vector,aleatorio)==true) {
            mostrarvector(vector);
        } else {
            System.out.println("El vector aun no se ha rellenado.");
        }
    }
    public static boolean rellenarvector(int[]vector, Random aleatorio) {
        int contador=0;
        boolean cargados=false;
        for (int i = 0; i < vector.length; i++) {
            vector[i]=aleatorio.nextInt(10);
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]>=0) {
                contador=contador+1;
            }
        }
        if (contador==vector.length) {
            cargados=true;
        }
        return cargados;
    }
    public static void mostrarvector(int[]vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println(" ");
    }
}
