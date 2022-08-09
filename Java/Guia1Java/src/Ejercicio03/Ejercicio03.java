/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Neqro
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
        después toda en minúsculas. Nota: investigar la función toUpperCase() y 
        toLowerCase() en Java.
        */
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase=leer.nextLine();
        frase=toUpperCase(frase);
        System.out.println("La frase en mayúsculas es: "+frase);
        frase=toLowerCase(frase);
        System.out.println("La frase en mínúsculas es: "+frase);
    }
    
}
