/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Neqro
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        14. Realizar un programa que pida dos números enteros positivos por teclado y 
        muestre por pantalla el siguiente menú:
        
                MENU
        
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Salir
        
        Elija opción:
        
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
        del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
        ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
        carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
        */
        Scanner leer = new Scanner (System.in);
        int num1,num2,opcion,resultado;
        double resultadodivision;
        boolean salir=false;
        String confsalir;
        System.out.println("Ingrese 2 números: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        do {
            System.out.println("------MENÜ------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción: ");
            opcion=leer.nextInt();
            switch(opcion){
                case 1: 
                    resultado=num1+num2;
                    System.out.println("La suma de ambos números es: "+resultado);
                    break;
                case 2:
                    resultado=num1-num2;
                    System.out.println("La resta de ambos números es: "+resultado);
                    break;
                case 3:
                    resultado=num1*num2;
                    System.out.println("La multiplicación de ambos números es: "+resultado);
                    break;
                case 4:
                    resultadodivision=num1/num2;
                    System.out.println("La división de ambos números es: "+resultadodivision);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confsalir=leer.next();
                    confsalir=toUpperCase(confsalir);
                    confsalir=confsalir.substring(0,1);
                        switch (confsalir) {
                            case "S": 
                                salir=true;
                                break;
                            case "N":
                                ;
                                break;
                            default:
                                System.out.println("La opción ingresada es inválida. Saliendo...");
                                salir=true;
                            }
                    break;
                default:
                    System.out.println("La opción ingresada es inválida.");
                    salir=true;
            }
        } while(salir==false);
    }
}
