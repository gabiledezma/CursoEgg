/*
            10. Realizar un programa en Java donde se creen dos arreglos: el 
        primero será un arreglo A de 50 números reales, y el segundo B, un 
        arreglo de 20 números, también reales. El programa deberá inicializar el
        arreglo A con números aleatorios y mostrarlo por pantalla. Luego, el 
        arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 
        números ordenados al arreglo B de 20 elementos, y rellenar los 10 
        últimos elementos con el valor 0.5. Mostrar los dos arreglos 
        resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
package guia2ejercicio10.Entidades;

import java.util.Arrays;
//import java.util.Random;

public class Funcion {

    private double[] Arreglo1 = new double[50];
    private double[] Arreglo2 = new double[20];
    //Random aleatorio = new Random();

    public Funcion() {
    }

    public double[] getArreglo1() {
        return Arreglo1;
    }

    public void setArreglo1(double[] Arreglo1) {
        this.Arreglo1 = Arreglo1;
    }

    public double[] getArreglo2() {
        return Arreglo2;
    }

    public void setArreglo2(double[] Arreglo2) {
        this.Arreglo2 = Arreglo2;
    }

    @Override
    public String toString() {
        return "Funcion{" + "Arreglo1=" + Arrays.toString(Arreglo1) + ", Arreglo2=" + Arrays.toString(Arreglo2) + '}';
    }

    /*
    public Funcion rellenarArregloDeFuncion() {
        Funcion f = new Funcion();
        for (int i = 0; i < Arreglo1.length; i++) {
            Arreglo1[i] = (double) aleatorio.nextInt(1000) / 100;
        }
        System.out.println("Arreglo Base: \n"
                + Arrays.toString(Arreglo1));

        return f;
    }

    public void ordenarArreglo() {
        double aux;
        for (int i = 1; i < Arreglo1.length; i++) {
            for (int j = 0; j < (Arreglo1.length - i); j++) {
                if (Arreglo1[j] > Arreglo1[j + 1]) {
                    aux = Arreglo1[j];
                    Arreglo1[j] = Arreglo1[j + 1];
                    Arreglo1[j + 1] = aux;
                }
            }
        }
    }

    public void rellenarArregloSecundario() {
        for (int i = 0; i < 10; i++) {
            Arreglo2[i] = Arreglo1[i];
        }
        for (int i = 10; i < 20; i++) {
            Arreglo2[i] = 0.5;
        }
    }

    public void mostrarArreglos() {
        System.out.println("Arreglo de 50 números ordenado de menor a mayor: \n"
                + Arrays.toString(Arreglo1) + "\n"
                + "Arreglo de 20 números: \n"
                + Arrays.toString(Arreglo2));
    }
     */
}
