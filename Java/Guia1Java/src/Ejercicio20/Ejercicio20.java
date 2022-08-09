package Ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        /*
        20. Realizar un algoritmo que rellene un vector con los 100 primeros números 
        enteros y los muestre por pantalla en orden descendente.
        */
        Scanner leer = new Scanner(System.in);
        int[] num = new int[100];
        for (int i = 0; i < 100; i++) {
            num[i]=i+1;
        }
        for (int j = 100; j > 0; j--) {
            System.out.println("Num "+j+" es igual a "+num[j-1]);
        }
    }
    
}
