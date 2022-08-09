package EjerciciosExtra04;

import java.util.Scanner;

public class EjerciciosExtra04 {

    public static void main(String[] args) {
        /*
        4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
        y se muestre su equivalente en romano.
        */
        Scanner leer = new Scanner(System.in);
        int numingresado,udemil,centena,decena,unidad;
        System.out.println("Ingrese un número: ");
        numingresado=leer.nextInt();
        udemil =(int) Math.floor(numingresado/1000) %10;
        centena =(int) Math.floor(numingresado/100) %10;
        decena =(int) Math.floor(numingresado/10) %10;
        unidad =(int) Math.floor(numingresado/1) %10;
        if (udemil>3) {
            System.out.println("El número ingresado NO se puede representar.");
        } else {
            switch(udemil){
                case 1:
                    System.out.print("M");
                    break;
                case 2:
                    System.out.print("MM");
                    break;
                case 3:
                    System.out.print("MMM");
                    break;
            }
            switch(centena){
                case 1:
                    System.out.print("C");
                    break;
                case 2:
                    System.out.print("CC");
                    break;
                case 3:
                    System.out.print("CCC");
                    break;
                case 4:
                    System.out.print("CD");
                    break;
                case 5:
                    System.out.print("D");
                    break;
                case 6:
                    System.out.print("DC");
                    break;
                case 7:
                    System.out.print("DCC");
                    break;
                case 8:
                    System.out.print("DCCC");
                    break;
                case 9:
                    System.out.print("CM");
                    break;    
            }
            switch(decena){
                case 1:
                    System.out.print("X");
                    break;
                case 2:
                    System.out.print("XX");
                    break;
                case 3:
                    System.out.print("XXX");
                    break;
                case 4:
                    System.out.print("XL");
                    break;
                case 5:
                    System.out.print("L");
                    break;
                case 6:
                    System.out.print("LX");
                    break;
                case 7:
                    System.out.print("LXX");
                    break;
                case 8:
                    System.out.print("LXXX");
                    break;
                case 9:
                    System.out.print("XC");
                    break;    
            }
            switch(unidad){
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VIII");
                    break;
                case 9:
                    System.out.print("IX");
                    break;    
            }
        }
        System.out.println("");  
    }
}
