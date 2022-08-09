package Ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

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
        int num1,num2,num3,num4;
        String simbolos1="",simbolos2="",simbolos3="",simbolos4="";
        System.out.println("Ingrese un número: ");
        num1=leer.nextInt();
        for (int i = 0; i < num1; i++) {
            simbolos1=simbolos1.concat("*");
        }
        System.out.println("Ingrese un número: ");
        num2=leer.nextInt();
        for (int i = 0; i < num2; i++) {
            simbolos2=simbolos2.concat("*");
        }
        System.out.println("Ingrese un número: ");
        num3=leer.nextInt();
        for (int i = 0; i < num3; i++) {
            simbolos3=simbolos3.concat("*");
        }
        System.out.println("Ingrese un número: ");
        num4=leer.nextInt();
        for (int i = 0; i < num4; i++) {
            simbolos4=simbolos4.concat("*");
        }
        System.out.println(num1+" "+simbolos1);
        System.out.println(num2+" "+simbolos2);
        System.out.println(num3+" "+simbolos3);
        System.out.println(num4+" "+simbolos4);
    }
}
