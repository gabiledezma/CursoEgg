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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        10. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
        frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
        “INCORRECTO”. Nota: investigar la función Substring y equals() de Java
        */
        Scanner leer = new Scanner (System.in);
        String frase,letra;
        System.out.println("Ingrese una frase o palabra: ");
        frase=leer.nextLine();
        letra=frase.substring(0,1);
        letra=letra.toUpperCase();
        if (letra.equals("A")){
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
        
        System.out.println("el dia es: "+dia+", el mes es: "+mes+", el año es: "+anio);
    }
    
}
