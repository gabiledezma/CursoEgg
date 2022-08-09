
package Ejercicio26;

import java.util.Scanner;

public class Ejercicio26bis {

    public static void main(String[] args) {
        /*
        26. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 
        y la matriz P de 3x3, se solicita escribir un programa en el cual se 
        compruebe si la matriz P está contenida dentro de la matriz M. Para ello 
        se debe verificar si entre todas las submatrices de 3x3 que se pueden 
        formar en la matriz M, desplazándose por filas o columnas, existe al 
        menos una que coincida con la matriz P. En ese caso, el programa debe 
        indicar la fila y la columna de la matriz M en la cual empieza el primer 
        elemento de la submatriz P.
        Ejemplo: 
        
        Como podemos observar nuestra submatriz P se encuentra en la matriz M en 
        los índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
        */
        Scanner leer = new Scanner(System.in);
        int contador=0;
        int[][] matrizchica={{36,5,67},{89,90,75},{14,22,26}};
        int[][] matrizgrande={{1,26,36,47,5,6,72,81,95,10},
                              {11,12,13,21,41,22,67,20,10,61},
                              {56,78,87,90,9,90,17,12,87,67},
                              {41,87,24,56,97,74,87,42,64,35},
                              {32,76,79,1,36,5,67,96,12,11},
                              {99,13,54,88,89,90,75,12,41,76},
                              {67,78,87,45,14,22,26,42,56,78},
                              {98,45,34,23,32,56,74,16,19,18},
                              {24,67,97,46,87,13,67,89,93,24},
                              {21,68,78,98,90,67,12,41,65,12}};
        String aux2;
        System.out.println("La matriz general es: ");
        for (int[] fila : matrizgrande) {
            aux2="";
            for (int elemento :fila) {
                aux2+=" "+elemento;
            }
            System.out.println(aux2);
        }
        String aux3;
        System.out.println("Mientras que la pequeña es: ");
        for (int[] fila : matrizchica) {
            aux3="";
            for (int elemento :fila) {
                aux3+=" "+elemento;
            }
            System.out.println(aux3);
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (matrizgrande[i+k][j+l]==matrizchica[k][l]) {
                            contador= contador+1; //contador++ es lo mismo
                        }
                    }
                }
                if (contador==9) {
                    System.out.println("La matriz pequeña se encuentra en la grande desde "+i+","+j+" hasta "+(i+2)+","+(j+2));
                    contador=0;
                    break;
                } else {
                    contador=0;
                }
            }
        }
    }       
}
    
    
    
    

