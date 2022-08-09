package Ejercicio23;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        /*
        23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
        y muestre la traspuesta de la matriz.
        */
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int relleno;
        int [][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                relleno  = aleatorio.nextInt(100);
                matriz[i][j]=relleno;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
