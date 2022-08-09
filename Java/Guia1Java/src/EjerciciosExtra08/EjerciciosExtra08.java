package EjerciciosExtra08;

import java.util.Scanner;

public class EjerciciosExtra08 {

    public static void main(String[] args) {
        /*
        8. Escriba un programa que lea números enteros. Si el número es 
        múltiplo de cinco debe detener la lectura y mostrar la cantidad 
        de números leídos, la cantidad de números pares y la cantidad de 
        números impares. Al igual que en el ejercicio anterior los 
        números negativos no deben sumarse. Nota: recordar el uso de la 
        sentencia break.
        */
        Scanner leer = new Scanner(System.in);
        int cantidad,pares=0,impares=0,totalleidos=0;
        System.out.println("Ingrese la cantidad de números a evaluar: ");
        cantidad=leer.nextInt();
        int numeros[] = new int [cantidad];
        for (int i = 0; i < numeros.length; i++) {
            do {
            System.out.println("Ingrese un valor para el subindice "+i+": ");
            numeros[i]=leer.nextInt();
            } while (numeros[i]<0);
            totalleidos=totalleidos+1;
            if (numeros[i]%2==0) {
                pares=pares+1;
            }else{
                impares=impares+1;
            }
            if (numeros[i]%5==0) {
                break;
            }
        }
        System.out.println("El total de números leídos es: "+totalleidos);
        System.out.println("El total de números pares leídos es: "+pares);
        System.out.println("El total de números impares leídos es: "+impares);
    } 
}
