package EjerciciosExtra19;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtra19 {

   public static void main(String[] args) {
        /*
        19. Escriba un programa que averigüe si dos vectores de N enteros son 
       iguales (la comparación deberá detenerse en cuanto se detecte alguna 
       diferencia entre los elementos).
        */
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int n, relleno, relleno2,contador=0;
        n  = aleatorio.nextInt(5);
        int[]vector= new int[n];
        int[]vector2=new int[n];        
        for (int i = 0; i < vector.length; i++) {
            relleno=aleatorio.nextInt(10);
            vector[i]=relleno;
        }
        for (int i = 0; i < vector2.length; i++) {
            relleno2=aleatorio.nextInt(10);
            vector2[i]=relleno2;
        }
        if (vector.length==vector2.length) {
            for (int i = 0; i < vector.length; i++) {
                if (vector[i]==vector2[i]) {
                    contador=contador+1;
                } else {
                    System.out.println("Los vectores son diferentes.");
                    break;
                }
            }
        } else {
            System.out.println("Los vectores son de diferente tamaño.");
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i]+" ");
        }
        if (contador==vector.length) {
            System.out.println("Los vectores son iguales.");
        }
    } 
}
