package EjerciciosExtra22;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtra22 {

    public static void main(String[] args) {
        /*
        22. Realizar un programa que rellene una matriz de tamaño NxM con 
        valores aleatorios y muestre la suma de sus elementos.
        */
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int sumatoria=0;
        int [][] matriz = new int [aleatorio.nextInt(10)][aleatorio.nextInt(10)]; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j]=aleatorio.nextInt(10);
                sumatoria=sumatoria+matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("La sumatoria de todos los elementos de la matriz es: "+sumatoria);
    }
    
}
