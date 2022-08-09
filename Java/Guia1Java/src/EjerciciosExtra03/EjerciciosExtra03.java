package EjerciciosExtra03;

import java.util.Scanner;

public class EjerciciosExtra03 {

    public static void main(String[] args) {
        /*
        3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si    
        se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
        la función equals() de la clase String. 
        */
        Scanner leer = new Scanner(System.in);
        String letra;
        int largoletra;
        boolean confirmarvocal=true;
        String vocales[] = new String[5];
        vocales[0]="A";
        vocales[1]="E";
        vocales[2]="I";
        vocales[3]="O";
        vocales[4]="U";
        do {
        System.out.println("Ingrese una letra: ");
        letra=leer.next();
        letra=letra.toUpperCase();
        largoletra=letra.length();
            if (largoletra>1) {
                System.out.println("el dato ingresado supera 1 dígito. Por Favor, inténtelo nuevamente.");
            }
        }while(largoletra>1);
        for (int i = 0; i < 5; i++) {
            if (!letra.equals(vocales[i])) {
                confirmarvocal=true;
            } else {
                confirmarvocal=false;
                System.out.println("La letra ingresada( "+letra+" ) es una vocal.");
                break;
            }    
        }
        if (confirmarvocal==true) {
            System.out.println("La letra ingresada( "+letra+" ) NO es una vocal.");
        }  
    }
}
    

