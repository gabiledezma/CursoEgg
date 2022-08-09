package Ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        /*
        19. Crea una aplicación que a través de una función nos convierta una cantidad de 
        euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
        libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
        convertir que será una cadena, este no devolverá ningún valor y mostrará un 
        mensaje indicando el cambio (void).
        El cambio de divisas es:
            * 0.86 libras es un 1 €
            * 1.28611 $ es un 1 €
            * 129.852 yenes es un 1 €
        */
        Scanner leer = new Scanner(System.in);
        int dinero;
        String TipoBuscado,Dolares="DOLARES",Yenes="YENES",Libras="LIBRAS";
        System.out.println("Ingrese la cantidad de euros a convertir: ");
        dinero=leer.nextInt();
        System.out.println("Ingrese la moneda buscada: ");
        TipoBuscado=leer.next();
        TipoBuscado=TipoBuscado.toUpperCase();
        Conversion(dinero,TipoBuscado);
    }
    public static void Conversion(int dinero,String tipobuscado){
        double resultado=0;
        String simbolos;
        switch (tipobuscado) {
            case "LIBRAS":
                resultado=dinero*0.86;
                break;
            case "DOLARES":
                resultado=dinero*1.28611;
                break;
            case "YENES":
                resultado=dinero*129.852;
            default:
                System.out.println("El tipo de moneda ingresado es inválido.");    
        }
        System.out.println("La conversión es: "+resultado+" "+tipobuscado);
    }
}
