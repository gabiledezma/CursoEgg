/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05;

import java.util.Scanner;

/**
 *
 * @author Neqro
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        5. Escribir un programa que lea un número entero por teclado y muestre por pantalla 
        el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
        Math.sqrt()
        */
        Scanner leer = new Scanner (System.in);
        int num,numx2,numx3 ;
        double raiznum;
        System.out.println("Ingrese un número: ");
        num = leer.nextInt();
        numx2=num*2;
        numx3=num*3;
        raiznum=Math.sqrt(num);
        System.out.println("El doble de "+num+" es: "+numx2);
        System.out.println("El trile de "+num+" es: "+numx3);
        System.out.println("La raiz cuadrada de "+num+" es: "+raiznum);
        
    }
    
}
