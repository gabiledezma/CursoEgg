package guia2ejercicio10.Servicio;

import guia2ejercicio10.Entidades.Funcion;
import java.util.Arrays;
import java.util.Random;

public class ServicioFuncion {

    Random aleatorio = new Random();

    public Funcion rellenarArregloDeFuncion() {
        Funcion f = new Funcion();
        for (int i = 0; i < f.getArreglo1().length; i++) {
            Arrays.fill(f.getArreglo1(), i, i + 1, ((double) aleatorio.nextInt(1000) / 100));
        }
        System.out.println("Arreglo Base: \n"
                + Arrays.toString(f.getArreglo1()));

        return f;
    }

    public void ordenarArreglo(Funcion f) {
        Arrays.sort(f.getArreglo1());
    }

    public void rellenarArregloSecundario(Funcion f) {

        for (int i = 0; i < f.getArreglo2().length; i++) {
            if (i < 10) {
                Arrays.fill(f.getArreglo2(), i, i + 1, f.getArreglo1()[i]);
            } else {
                Arrays.fill(f.getArreglo2(), i, i + 1, 0.5);
            }

        }
    }

    public void mostrarArreglos(Funcion f) {
        System.out.println("Arreglo de 50 números ordenado de menor a mayor: \n"
                + Arrays.toString(f.getArreglo1()) + "\n"
                + "Arreglo de 20 números: \n"
                + Arrays.toString(f.getArreglo2()));

    }

}
