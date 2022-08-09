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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
        la nota se pedirá de nuevo hasta que la nota sea correcta. 
        */
        Scanner leer = new Scanner (System.in);
        int Nota;
        do {
            System.out.println("Ingrese una nota: ");
            Nota=leer.nextInt();
        } while(Nota>10 || Nota<0 );
        
        
        
        
        
    }
    
    
}
