package Ejercicio21;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        /*
        21. Realizar un algoritmo que rellene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un numero a buscar en el vector. El programa 
        mostrará donde se encuentra el numero y si se encuentra repetido.
        */
        Scanner leer = new Scanner(System.in);
        Random numero = new Random();
        Random num = new Random();
        int numaleatorio, numaleatorio2, buscado, contador=0;
        numaleatorio=numero.nextInt(100);
        //numaleatorio=50;
        
        int [] vector = new int[numaleatorio];
        for (int i = 0; i < numaleatorio; i++) {
            numaleatorio2=num.nextInt(100);
            vector[i]=numaleatorio2;
        }
        System.out.println("Ingrese un valor a buscar: ");
        buscado=leer.nextInt();
        for (int i = 0; i < numaleatorio; i++) {
            if (vector[i]==buscado) {
                contador=contador+1;
                System.out.println("El número buscado se encuentra en el subíndice "+i);
            }
        }
        if (contador>1) {
            System.out.println("El número buscado se encuentra repetido "+contador+" veces.");
        }
        if (contador==0) {
            System.out.println("El número buscado NO se encuentra dentro del vector.");
        }
    }
}
