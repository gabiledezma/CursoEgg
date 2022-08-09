package Ejercicio22;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        /*
        22. Recorrer un vector de N enteros contabilizando cuántos números son 
        de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        Scanner leer = new Scanner(System.in);    
        Random aleatorio = new Random();
        Random aleatorio2 = new Random();
        int N,relleno,digitos1=0,digitos2=0,digitos3=0,digitos4=0,digitos5=0;
        N  = aleatorio.nextInt(100);
        int [] vector = new int[N];
        for (int i = 0; i < N; i++) {
            relleno = aleatorio2.nextInt(100000);
            vector[i]=relleno; 
        }
        for (int i = 0; i < N; i++) {
            if (vector[i]<10 ) {
                digitos1=digitos1+1;
            }
            if (vector[i]>=10 && vector[i]<100) {
                digitos2=digitos2+1;
            }
            if (vector[i]>=100 && vector[i]<1000) {
                digitos3=digitos3+1;
            }
            if (vector[i]>=1000 && vector[i]<10000) {
                digitos4=digitos4+1;
            }
            if (vector[i]>=10000 && vector[i]<100000) {
                digitos5=digitos5+1;
            }
        }
        System.out.println("Dentro del vector hay "+digitos1+" números de 1 dígito.");
        System.out.println("Dentro del vector hay "+digitos2+" números de 2 dígitos.");
        System.out.println("Dentro del vector hay "+digitos3+" números de 3 dígitos.");
        System.out.println("Dentro del vector hay "+digitos4+" números de 4 dígitos.");
        System.out.println("Dentro del vector hay "+digitos5+" números de 5 dígitos.");
    }
    
}
