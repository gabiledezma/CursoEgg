package EjerciciosExtra06;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtra06 {

    public static void main(String[] args) {
        /*
        6. Leer la altura de N personas y determinar el promedio de estaturas 
        que se encuentran por debajo de 1.60 mts. y el promedio de estaturas 
        en general.
        */
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        Random aleatorio2 = new Random();
        int cantidad, alturadepersonas, sumatoriaaltgral=0, sumatoriachica=0,alturachica=0;
        double promediodealtgral, promediochico;
        //cantidad=10;
        cantidad  = aleatorio.nextInt(10); //cargar cantidad de personas
        int alturas [] = new int[cantidad];
        for (int i = 0; i < alturas.length; i++) { //cargar estaturas
            //alturadepersonas=leer.nextInt();
            alturadepersonas  = aleatorio.nextInt(201);
            alturas[i]=alturadepersonas;
        }
        for (int i = 0; i < alturas.length; i++) {
            sumatoriaaltgral=sumatoriaaltgral+alturas[i];
        }
        promediodealtgral=sumatoriaaltgral/alturas.length;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i]<=160) {
                alturachica+=1;
                sumatoriachica=sumatoriachica+alturas[i];
            }
        }
        promediochico=sumatoriachica/alturachica;
        System.out.println("El promedio de altura general es "+promediodealtgral);
        System.out.println("El promedio de personas con estatura inferior a 160cm es "+promediochico);

    }
    
}
