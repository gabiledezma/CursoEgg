package Ejercicio18;

import java.util.Scanner;

public class Ejercicio18bis {

    public static void main(String[] args) {
       /*
        18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
        número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
        */
        Scanner leer = new Scanner(System.in);
        int[] num = new int[4];
        String[] simbolos = new String[4];
        for (int i = 0; i < 4; i++) {
            simbolos[i]="";
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número: ");
            num[i] = leer.nextInt();
            for (int j = 0; j < num[i]; j++) {
                simbolos[i]=simbolos[i].concat("*");
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(num[i]+" "+simbolos[i]);
        }
    }
}
