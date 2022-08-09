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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        6. Implementar un programa que dado dos números enteros determine cuál es el 
        mayor y lo muestre por pantalla.
        */
       Scanner leer = new Scanner (System.in);
       int num,num2;
       System.out.println("Ingrese dos números: ");
       num=leer.nextInt();
       num2=leer.nextInt();
       if (num>num2) {
           System.out.println("El mayor entre ambos números es: "+num);
       }else{ 
           System.out.println("El mayor entre ambos números es: "+num2);
       }
    }
    
}
