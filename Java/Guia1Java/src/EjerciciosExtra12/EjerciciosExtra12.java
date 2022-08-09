package EjerciciosExtra12;

import java.util.Scanner;

public class EjerciciosExtra12 {

    public static void main(String[] args) {
        /*
        12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre 
        los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
        aparezca un 3 lo sustituya por una E. Ejemplo:
            0-0-0
            0-0-1
            0-0-2
            0-0-E
            0-0-4
            0-1-2
            0-1-E
        Nota: investigar función equals() y como convertir números a String.
        */
        Scanner leer = new Scanner(System.in);
        String[][][] matriz = new String[10][10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                        matriz[i][j][k]="";
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 3 && j == 3 && k == 3) {
                        matriz[i][j][k]=matriz[i][j][k].concat("E"+"-"+"E"+"-"+"E");
                        
                    }else if (i == 3 && j== 3 && k != 3) {
                        matriz[i][j][k]=matriz[i][j][k].concat("E"+"-"+"E"+"-"+Integer.toString(k));
                        
                    }else if (i == 3 && j!= 3 && k == 3) {
                        matriz[i][j][k]=matriz[i][j][k].concat("E"+"-"+Integer.toString(j)+"-"+"E");
                        
                    }else if (i == 3 && j!= 3 && k != 3) {
                        matriz[i][j][k]=matriz[i][j][k].concat("E"+"-"+Integer.toString(j)+"-"+Integer.toString(k));
                        
                    }else if (i != 3 && j== 3 && k == 3) {
                        matriz[i][j][k]=matriz[i][j][k].concat(Integer.toString(i)+"-"+"E"+"-"+"E");
                        
                    }else if (i != 3 && j== 3 && k != 3) {
                        matriz[i][j][k]=matriz[i][j][k].concat(Integer.toString(i)+"-"+"E"+"-"+Integer.toString(k));
                        
                    }else if (i != 3 && j!= 3 && k == 3) {
                        matriz[i][j][k]=matriz[i][j][k].concat(Integer.toString(i)+"-"+Integer.toString(j)+"-"+"E");
                        
                    }else {
                        matriz[i][j][k]=matriz[i][j][k].concat(Integer.toString(i)+"-"+Integer.toString(j)+"-"+Integer.toString(k));
                        
                    }
                }    
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(matriz[i][j][k]+" ");
                }
            }
        }
    }
}
