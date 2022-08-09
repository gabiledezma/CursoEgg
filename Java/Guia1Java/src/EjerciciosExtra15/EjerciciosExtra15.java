package EjerciciosExtra15;

import java.util.Scanner;

public class EjerciciosExtra15 {

    public static void main(String[] args) {
        /*
        15. Crea una aplicación que le pida dos números al usuario y este pueda
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        tener una función para cada operación matemática y deben devolver sus 
        resultados para imprimirlos en el main. 
        */
        
        Scanner leer = new Scanner(System.in);
        int num1,num2,opcion;
        System.out.println("Ingrese dos números: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        do {
        System.out.println("Menú\n"+
                "1. Sumar.\n"+
                "2. Restar.\n"+
                "3. Multiplicar.\n"+
                "4. Dividir.\n"+
                "Elija una opción:");
        opcion=leer.nextInt();
        } while(opcion>4 || opcion<=0);
        switch (opcion) {
            case 1:
                System.out.println("La suma de: "+num1+" y "+num2+" es: "+sumar(num1,num2));
                break;
            case 2:
                System.out.println("La resta de: "+num1+" y "+num2+" es: "+restar(num1,num2));
                break;
            case 3:
                System.out.println("La multiplicación de: "+num1+" por "+num2+" es: "+multiplicar(num1,num2));
                break;
            case 4:
                if (num2!=0) {
                    System.out.println("La división de: "+num1+" por "+num2+" es: "+dividir(num1,num2));
                } else {
                    System.out.println("La división por cero no es posible.");
                }
                break;
            default:
                System.out.println("La opción ingresada es inválida.");
        } 
    }
    public static int sumar(int a, int b){
        int resultado;
        resultado=a+b;
        return resultado;
    }
    public static int restar(int a, int b){
        int resultado;
        resultado=a-b;
        return resultado;
    }
    public static int multiplicar(int a, int b){
        int resultado;
        resultado=a*b;
        return resultado;
    }
    public static int dividir(int a, int b){
        int resultado;
        resultado=a/b;
        return resultado;
    }
}
