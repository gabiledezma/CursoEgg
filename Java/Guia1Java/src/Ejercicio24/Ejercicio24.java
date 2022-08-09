package Ejercicio24;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {

   public static void main(String[] args) {
        /*
        24. Realice un programa que compruebe si una matriz dada es anti simétrica. 
        Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia 
        traspuesta, pero cambiada de signo. Es decir, A(Filas x Columnas) es 
        antisimétrica si A(FxC) = -A(CxF).
        
           MATRIZ        MATRIZ TRASPUESTA
        0   -2    4         0    2   -4
        2    0    2        -2    0   -2
       -4   -2    0         4    2    0
        En este caso la matriz es anti simétrica.
        */
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        Random aleatorio2 = new Random();
        int relleno,tamanio,contador=0;
        
        tamanio  = aleatorio2.nextInt(4);
        //tamanio=3;
        int[][]matriz = new int [tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                relleno  = aleatorio.nextInt(5);
                matriz[i][j]=relleno;
                //System.out.println("Ingrese un valor para "+i+","+j+": ");
                //matriz[i][j]=leer.nextInt();
            }
        }
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (matriz[i][j]*-1==matriz[j][i]) {
                    contador=contador+1;
                } 
            }
        }
        if (contador ==(tamanio*tamanio)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz NO es antisimétrica.");
        }
        
    }
    
}
