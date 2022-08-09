/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_08;

import Entidades.Cadena;
import java.util.Scanner;


public class Ejercicio_08 {

    
    public static void main(String[] args) {
        Cadena micadena = new Cadena("Casa Blanca");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        
        
        
        
        
        int choice;
        
        do{
            System.out.println("1. Mostrar Vocales");
            System.out.println("2. Invertit Frase");
            System.out.println("3. Veces repetido");
            System.out.println("4. comparar longitud");
            System.out.println("5. Unir frases");
            System.out.println("6. Reemplazar");
            System.out.println("7. Contiene");
            System.out.println("0. Salir");
            choice = leer.nextInt();
            switch(choice){
                case 1:
                    System.out.println(micadena.mostrarVocales());
                    break;
                case 2:
                    System.out.println(micadena.invertirPalabra());
                    break;
                case 3:
                    System.out.println("Ingrese una letra");
                    int letrarepetida = micadena.vecesRepetido(leer.next());
                    System.out.println("La letra ingresada se repite "+letrarepetida+" veces");
                    break;
                case 4:
                    System.out.println("Ingrese una frase");
                    micadena.compararLongitud(leer.next());
                    break;
                case 5:
                    System.out.println("Ingrese la frase");
                    micadena.unirFrase(leer.next());
                    break;
                case 6:
                    System.out.println("Ingrese un caracter");
                    micadena.reemplazar(leer.next());
                    break;
                case 7:
                    System.out.println("Ingrese una letra");
                    if(micadena.contiene(leer.next())){
                        System.out.println("Contiene la letra");
                    }else{
                        System.out.println("No contiene la letra");
                    }
            }
            
            
        }while(choice!=0);
        
        
    }

}
