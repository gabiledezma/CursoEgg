package Ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        /*
        25. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
        del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales 
        son idénticas. Crear un programa que permita introducir un cuadrado por 
        teclado y determine si este cuadrado es mágico o no. El programa deberá 
        comprobar que los números introducidos son correctos, es decir, están 
        entre el 1 y el 9.
                2   7   6
                9   5   1
                4   3   8
        */
        Scanner leer = new Scanner(System.in);
        int tamanio=3,filas,columnas,diagonales;
        int [][] matriz = new int [tamanio][tamanio];
        RellenarMatriz(matriz,tamanio,leer);
        filas=SumarFilas(matriz,tamanio);
        columnas=SumarColumnas(matriz,tamanio);
        diagonales=SumarDiagonales(matriz,tamanio);
        if ((filas==columnas)&&(filas==diagonales)) {
            System.out.println("Es una matriz mágica.");
        } else {
            System.out.println("NO es una matriz mágica.");
        }
        MostrarMatriz(matriz,tamanio);
    }
    public static void RellenarMatriz(int[][] matriz, int tamanio,Scanner leer){
    int numingresado;
    for (int i = 0; i < tamanio; i++) {
        for (int j = 0; j < tamanio; j++) {
            do {
		System.out.println("Ingrese el número que ocupara el espacio: "+i+","+j+"."); 
                numingresado=leer.nextInt();
                if (numingresado<1 || numingresado>9) {
                    System.out.println("No es posible ingresar un número con este valor.");
                }
            }while (numingresado<1 || numingresado>9);
            matriz[i][j]=numingresado;
        }
    }
    }
    public static int SumarFilas(int[][] matriz, int tamanio){
        int sumatoria, suma=0,aux=0,contador=0;
        for (int i = 0; i < tamanio; i++) {
            aux=aux+matriz[0][i];
        }
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                suma=suma+matriz[i][j];
            }
            if (aux==suma) {
                contador=contador+1;
            }
            suma=0;
        }
        if (contador==tamanio) {
            sumatoria=aux;
        }else{
            sumatoria=-1;
        }
        return sumatoria;
    }
    public static int SumarColumnas(int[][] matriz, int tamanio){
        int sumatoria, suma=0,aux=0,contador=0;
        for (int i = 0; i < tamanio; i++) {
            aux=aux+matriz[i][0];
        }
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                suma=suma+matriz[j][i];
            }
            if (aux==suma) {
                contador=contador+1;
            }
            suma=0;
        }
        if (contador==tamanio) {
            sumatoria=aux;
        }else{
            sumatoria=-2;
        }
        return sumatoria;
    }
    public static int SumarDiagonales(int[][] matriz, int tamanio){
        int sumatoria,diagonales1=0,diagonales2=0;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i==j) {
                    diagonales1=diagonales1+matriz[i][j];
                }
                if ((i+j)==(tamanio-1)) {
                    diagonales2=diagonales2+matriz[i][j];
                }
            }
        }
        if (diagonales1==diagonales2) {
            sumatoria=diagonales1;
        }else{
            sumatoria=0;
        }
        return sumatoria;
    }
    public static void MostrarMatriz(int[][] matriz, int tamanio){
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
