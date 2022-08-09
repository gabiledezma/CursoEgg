package EjerciciosExtra07;

import java.util.Scanner;

public class EjerciciosExtra07 {

    public static void main(String[] args) {
        /*
        7. Realice un programa que calcule y visualice el valor máximo, el 
        valor mínimo y el promedio de n números (n>0). El valor de n se 
        solicitará al principio del programa y los números serán introducidos
        por el usuario. Realice dos versiones del programa, una usando el 
        bucle “while” y otra con el bucle “do - while”.
        */
        Scanner leer = new Scanner(System.in);
        int cantidad;
        String opcion;
        System.out.println("Ingrese la cantidad de números a evaluar: ");
        cantidad=leer.nextInt();
        int numeros[] = new int [cantidad];
        for (int i = 0; i < numeros.length; i++) {
            do {
            System.out.println("Ingrese un valor para el subindice "+i+": ");
            numeros[i]=leer.nextInt();
            } while (numeros[i]<0);
        }
        System.out.println("Elija el metodo a utilizar: A: While o B: DoWhile ");
        opcion=leer.next();
        opcion=opcion.toUpperCase();
        opcion=opcion.substring(0,1);
        if (opcion.equals("A")) {
            mientras(cantidad,numeros);
        } else if (opcion.equals("B")){
            hacermientras(cantidad,numeros);
        } 
    }
    public static void mientras(int cantidad, int numeros[]){
        int minimo=0, maximo=0, i=0, sumatoria=0;
        double promedio;
        while(i<numeros.length){
        if (numeros[i]>maximo) {
            maximo=numeros[i];
        }
        if (i==0) {
            minimo=numeros[0];    
        }else if (numeros[i]<minimo) {
             minimo=numeros[i];   
        }
        sumatoria=sumatoria+numeros[i];
        i=i+1;
        }
        promedio=sumatoria/numeros.length;
        System.out.println("El valor máximo es: "+maximo);
        System.out.println("El valor mínimo es: "+minimo);
        System.out.println("El promedio de los valores es: "+promedio);
    }
    public static void hacermientras(int cantidad, int numeros[]){
        int minimo=0, maximo=0, i=0, sumatoria=0;
        double promedio;
        do{
        if (numeros[i]>maximo) {
            maximo=numeros[i];
        }
        if (i==0) {
            minimo=numeros[0];    
        }else if (numeros[i]<minimo) {
             minimo=numeros[i];   
        }
        sumatoria=sumatoria+numeros[i];
        i=i+1;
        } while(i<numeros.length);
        promedio=sumatoria/numeros.length;
        System.out.println("El valor máximo es: "+maximo);
        System.out.println("El valor mínimo es: "+minimo);
        System.out.println("El promedio de los valores es: "+promedio);
    }
}
