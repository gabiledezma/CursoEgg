package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        /*
        15. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
        salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
        deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
        número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break
        */
        Scanner leer = new Scanner(System.in);
        int num,sumatoria=0;
        System.out.println("Ingrese los números: ");
        for (int i = 0; i < 20; i++) {
            num=leer.nextInt();
            if (num==0){
                System.out.println("Se capturó el número cero.");
                break;
            } else if (num >0) {
                sumatoria=sumatoria+num;
            }
        }
        System.out.println("La suma de todos los números es: "+sumatoria);
    }
}
