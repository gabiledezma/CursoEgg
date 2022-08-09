package EjerciciosExtra17;

import java.util.Scanner;

public class EjerciciosExtra17 {

    public static void main(String[] args) {
        /*
        17. Crea una aplicación que nos pida un número por teclado y con una 
        función se lo pasamos por parámetro para que nos indique si es o no un 
        número primo, debe devolver true si es primo, sino false.
        Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por 
        ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
        17 si es primo.
        */
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número: ");
        num=leer.nextInt();
        if (primo(num)== true) {
            System.out.println("El número ingresado: "+num+" es primo.");
        } else {
            System.out.println("El número ingresado: "+num+" NO es primo.");
        }
    }
    public static boolean primo(int num){
        int contador=0;
        boolean resultado;
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                contador=contador+1;
            }
        }
        if (contador<=2) {
            resultado=true;
        } else {
            resultado=false;
        }
        return resultado;
    }
}
