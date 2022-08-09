package EjerciciosExtra13;

import java.util.Scanner;

public class EjerciciosExtra13 {

    public static void main(String[] args) {
        /*
        13. Crear un programa que dibuje una escalera de números, donde cada 
        línea de números comience en uno y termine en el número de la línea. 
        Solicitar la altura de la escalera al usuario al comenzar. 
        Ejemplo: si se ingresa el número 3: 
        1
        12
        123
        */
        Scanner leer = new Scanner(System.in);
        int nummax,aux=0,aux2;
        System.out.println("Ingrese la altura de la escalera: ");
        nummax=leer.nextInt();
        for (int i = 1; i <= nummax; i++) {
            aux2=(aux*10)+i;
            aux=aux2;
            System.out.println(aux);
        }
    }
}
