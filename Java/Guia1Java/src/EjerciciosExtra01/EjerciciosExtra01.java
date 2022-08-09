package EjerciciosExtra01;

import java.util.Scanner;

public class EjerciciosExtra01 {

    public static void main(String[] args) {
        /*
        1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por 
        ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
        equivalente: 1 día, 2 horas.
        */
        Scanner leer = new Scanner(System.in);
        double minutosingresados, horas, dias;
        int dia;
        System.out.println("Ingrese los minutos: ");
        minutosingresados=leer.nextDouble();
        if (minutosingresados>1440) {
            dias=minutosingresados/1440;
            dia=(int) Math.floor(dias);
            horas=(minutosingresados-(1440*dia))/60;
            
            System.out.print(minutosingresados+" minutos es igual a "+dia+" dias y "+horas+" horas.");
            
        }else if(minutosingresados<1440){
            horas=minutosingresados/60;
            System.out.print(minutosingresados+" minutos es igual a "+horas+" horas");
        }
        
        
    }
}
