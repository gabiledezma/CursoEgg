package guia3ejerciciosextra01;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosExtra01 {

    public static void main(String[] args) {
        /*
            1. Diseñar un programa que lea una serie de valores numéricos 
        enteros desde el teclado y los guarde en un ArrayList de tipo Integer. 
        La lectura de números termina cuando se introduzca el valor -99. Este 
        valor no se guarda en el ArrayList. A continuación, el programa mostrará
        por pantalla el número de valores que se han leído, su suma y su media 
        (promedio).
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> numeros = new ArrayList();
        int num, sumatoria = 0;
        double prom;
        do {
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            if (num != -99) {
                numeros.add(num);
                sumatoria += num;
            }
        } while (num != -99);
        prom = (double) sumatoria / numeros.size();
        System.out.println("Se leyeron: " + numeros.size() + " números, estos son: ");
        for (Integer numero : numeros) {
            System.out.print(numero + "; ");
        }
        System.out.println("");
        System.out.println("La sumatoria de todos los números es: " + sumatoria + "\n"
                + "Además el promedio de todos los números ingresados es: " + prom);
    }

}
