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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
        grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
        */
       Scanner leer = new Scanner (System.in);
       int numc,numf;
       System.out.println("Ingrese una Temperatura (en °C): ");
       numc = leer.nextInt();
       numf=32+(9*numc/5);
        System.out.println(numc+"°C es igual a: "+numf+"°F");
    }
    
}
