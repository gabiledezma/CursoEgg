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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
        solicite números al usuario hasta que la suma de los números introducidos supere 
        el límite inicial. 
        */
        Scanner leer = new Scanner (System.in);
        int limite, num, aux=0;
        System.out.println("Ingrese el limite: ");
        limite=leer.nextInt();
        do {
            System.out.println("Ingrese los números a sumar: ");
            num=leer.nextInt();
            aux=aux+num; 
        }while(aux<limite);   
    }
    
}
