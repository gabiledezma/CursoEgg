/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Neqro
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
        si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * * 
        *     *
        *     *
        * * * *
        */
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el tamaño del cuadrado: ");
        num=leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i==num-1 || i==0 || j==num-1 || j==0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                } 
            }
            System.out.println("");
        }
    }
}
