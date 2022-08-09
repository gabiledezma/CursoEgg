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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        7. Crear un programa que dado un numero determine si es par o impar
        */
        Scanner leer = new Scanner (System.in);
        int num;
        boolean log=true;
        System.out.println("Ingrese un número:");
        num=leer.nextInt();
        if(num==0){
            System.out.println("El número 0 no es para ni impar.");
            log=false;
        }
        if(log==true){
            if(num%2==0){
                System.out.println("El número ingresado es Par.");
            }else{
                System.out.println("El número ingresado es impar.");
            }
        }
    }
    
}
