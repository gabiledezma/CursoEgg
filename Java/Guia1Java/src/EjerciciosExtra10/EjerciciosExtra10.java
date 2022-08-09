package EjerciciosExtra10;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtra10 {

    public static void main(String[] args) {
        /*
        10. Realice un programa para que el usuario adivine el resultado de una 
        multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
        El programa debe indicar al usuario si su respuesta es o no correcta. 
        En caso que la respuesta sea incorrecta se debe permitir al usuario 
        ingresar su respuesta nuevamente. Para realizar este ejercicio 
        investigue como utilizar la función Math.random() de Java.
        */
        Scanner leer = new Scanner(System.in); 
        Random aleatorio = new Random();
        int num1,num2,resultado,respuesta;
        num1  = aleatorio.nextInt(11);
        num2  = aleatorio.nextInt(11);
        resultado=num1*num2;
        do{
            System.out.println("Ingrese un resultado: ");
            respuesta=leer.nextInt();
            if (respuesta==resultado) {
                System.out.println("Su respuesta es correcta.");
            }else {
                System.out.println("Su respuesta es incorrecta, inténtelo nuevamente.");
            }
        }while(resultado!=respuesta);
        System.out.println(num1+"*"+num2+"="+resultado);
    } 
}
