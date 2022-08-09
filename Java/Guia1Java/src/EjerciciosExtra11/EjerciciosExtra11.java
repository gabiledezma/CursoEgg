package EjerciciosExtra11;

import java.util.Scanner;

public class EjerciciosExtra11 {

    public static void main(String[] args) {
        /*
        11. Escribir un programa que lea un número entero y devuelva el número 
        de dígitos que componen ese número. Por ejemplo, si introducimos el 
        número 12345, el programa deberá devolver 5. Calcular la cantidad de 
        dígitos matemáticamente utilizando el operador de división. 
        Nota: recordar que las variables de tipo entero truncan los números 
        o resultados.
        */
        Scanner leer = new Scanner(System.in);
        int num,contador=1,aux,auxingresado;
        System.out.println("Ingrese un número: ");
        num=leer.nextInt();
        auxingresado=num;
        do{
            if (num>9) {
                 aux=(int) Math.floor(num/10);
                 contador=contador+1;
                 num=aux;
            }
        }while(num>9);
        System.out.println(auxingresado+" tiene "+contador+" dígitos.");
    }
}
