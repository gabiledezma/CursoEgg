/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;

import java.util.Scanner;

/**
 *
 * @author Neqro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         1. Escribir un programa que pida dos números enteros por teclado y calcule la suma 
        de los dos. El programa deberá después mostrar el resultado de la suma
        */
        
    Scanner leer = new Scanner(System.in);
    int num, num2, suma;
    System.out.println("Ingrese dos números: ");
    num=leer.nextInt();
    num2=leer.nextInt();
    suma=num+num2;
    System.out.println("La suma de ambos números es: "+suma);
    }
    
}
