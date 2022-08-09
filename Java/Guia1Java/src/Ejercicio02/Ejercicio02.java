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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
        por pantalla.
        */
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre=leer.next();
        System.out.println("Hola "+nombre+"!");
    }
    
}
