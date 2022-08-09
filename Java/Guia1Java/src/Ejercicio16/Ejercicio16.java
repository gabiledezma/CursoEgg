/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio16;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Neqro
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
        tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
        con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
        carácter tiene que ser X y el último tiene que ser una O. 
        Las secuencias leídas que respeten el formato se consideran correctas, la 
        secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
        secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
        correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
        se utilizan las siguientes funciones de Java Substring(), Length(), equals().
        */
        Scanner leer = new Scanner(System.in);
        String cadenas,FDE="&&&&&",letra1,letra5;
        int Largo,contadorc=0,contadori=0;
        do {
            System.out.println("Ingrese la cadena: ");
            cadenas=leer.next();
            Largo=cadenas.length();
            cadenas=toUpperCase(cadenas);
            letra1=cadenas.substring(0,1);
            letra5=cadenas.substring(4,5);
            if (!cadenas.equals(FDE)){
                if (Largo==5) {
                    if (letra1.equals("X")){
                        if (letra5.equals("O")) {
                           contadorc=contadorc+1; 
                        }
                    } else {
                        contadori=contadori+1;
                    }      
                } else {
                    contadori=contadori+1;
                }
            }
        } while (!cadenas.equals(FDE));
        System.out.println("La cantidad de cadenas correctas es: "+contadorc);
        System.out.println("La cantidad de cadenas incorrectas es: "+contadori);
    }
}
    

