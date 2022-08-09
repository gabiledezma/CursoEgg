package EjerciciosExtra23;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtra23 {

    public static void main(String[] args) {
        /*
        23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 
        caracteres y, a medida que el usuario las va ingresando, construya una 
        “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las 
        palabras se ubicarán todas en orden horizontal en una fila que será 
        seleccionada de manera aleatoria. Una vez concluida la ubicación de las 
        palabras, rellene los espacios no utilizados con un número aleatorio del
        0 al 9. Finalmente imprima por pantalla la sopa de letras creada. 
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
        siguientes funciones de Java substring(), Length() y Math.random(
        */
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        String[] palabras = new String[5];
        String palabra;
        int fila,columna;
        System.out.println("Ingrese 5 palabras de entre 3 y 5 caracteres: ");
        for (int i = 0; i < 5; i++) {
            do {
                palabra=leer.next();
            } while (palabra.length()<3 || palabra.length()>5);
            palabra=palabra.toUpperCase();
            palabras[i]=palabra;
        }
        String[][]sopadeletras = new String [20][20];
        boolean ocupado=false;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopadeletras[i][j]="";
            }
        }
        for (int i = 0; i < 5; i++) {
            do {
                fila = aleatorio.nextInt(20);
                columna = aleatorio.nextInt(16);
                if (sopadeletras[fila][columna].equals("")) {
                    ocupado=true;
                    sopadeletras[fila][columna]=palabras[i].substring(0,1);
                    sopadeletras[fila][(columna+1)]=palabras[i].substring(1,2);
                    sopadeletras[fila][(columna+2)]=palabras[i].substring(2,3);
                    if (palabras[i].length()>3) {
                        if (palabras[i].length()==4) {
                            sopadeletras[fila][(columna+3)]=palabras[i].substring(3,4);
                        } else if (palabras[i].length()==5) {
                            sopadeletras[fila][(columna+3)]=palabras[i].substring(3,4);
                            sopadeletras[fila][(columna+4)]=palabras[i].substring(4,5);
                        }
                    }
                } else {
                    ocupado=false;
                }
            } while(ocupado!=true);
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopadeletras[i][j].equals("")) {
                    sopadeletras[i][j]=Integer.toString(aleatorio.nextInt(10));
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopadeletras[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
