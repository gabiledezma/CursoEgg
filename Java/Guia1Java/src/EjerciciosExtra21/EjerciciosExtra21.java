package EjerciciosExtra21;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtra21 {

    public static void main(String[] args) {
        /*
        21. Los profesores del curso de programación de Egg necesitan llevar un 
        registro de las notas adquiridas por sus 10 alumnos para luego obtener 
        una cantidad de aprobados y desaprobados. Durante el periodo de cursado 
        cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 
        por parciales. Las ponderaciones de cada nota son:
            Primer trabajo práctico evaluativo 10% 
            Segundo trabajo práctico evaluativo 15% 
            Primer Integrador 25% 
            Segundo integrador 50% 
        Una vez cargadas las notas, se calcula el promedio y se guarda en el 
        arreglo. Al final del programa los profesores necesitan obtener por 
        pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que
        solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas 
        del curso
        */
        Scanner leer = new Scanner(System.in);
        int alumnos=10, notas=4;
        double [][] tabladecalificaciones = new double [alumnos][notas+1];
        cargarnotas(tabladecalificaciones,notas);
        obtenerpromedios(tabladecalificaciones,notas);
        aprobados(tabladecalificaciones,alumnos);
    }
    public static void cargarnotas(double[][] tabla,int notas) {
        Random aleatorio = new Random();
        int nota;
        //System.out.println("Ingrese las notas de los alumnos: ");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < notas ; j++) {
                //System.out.println("Alumno n°"+(i+1)+", nota "+(j+1));
                nota = aleatorio.nextInt(11);
                //System.out.println(nota);
                tabla[i][j]=nota;
            } 
        }
    }
    public static void obtenerpromedios(double[][] tabla, int notas) {
        for (int i = 0; i < tabla.length; i++) {
            tabla[i][4]=(tabla[i][0]*0.1)+(tabla[i][1]*0.15)+(tabla[i][2]*0.25)+(tabla[i][3]*0.5); 
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print("/Alumno "+(i+1)+"/ "+tabla[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void aprobados (double [][] tabla, int totalalumnos) {
        int contador=0, desaprobados;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i][4]>=7) {
                contador=contador+1;
            }
        }
        System.out.println("El total de alumnos aprobados es: "+contador);
        desaprobados=totalalumnos-contador;
        System.out.println("El total de alumnos desaprobados es: "+desaprobados);
    }
}
