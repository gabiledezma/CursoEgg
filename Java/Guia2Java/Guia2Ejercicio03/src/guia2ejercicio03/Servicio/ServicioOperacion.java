package guia2ejercicio03.Servicio;

import guia2ejercicio03.Entidades.Operacion;
import java.util.Scanner;

public class ServicioOperacion {

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Operacion o = new Operacion();
        System.out.println("Ingrese el valor del número 1: ");
        o.setNumero1(leer.nextInt());
        System.out.println("Ingrese el valor del número 2: ");
        o.setNumero2(leer.nextInt());
        return o;
    }

    public int sumar(Operacion o) {

        int suma;
        suma = o.getNumero1() + o.getNumero2();
        return suma;
    }

    public int restar(Operacion o) {

        int resta;
        resta = o.getNumero1() - o.getNumero2();
        return resta;
    }

    public int multiplicar(Operacion o) {

        int multiplicacion;
        if (o.getNumero2() == 0) {
            System.out.println("Se intentó multiplicar por cero.");
            multiplicacion = 0;
        } else {
            multiplicacion = o.getNumero1() * o.getNumero2();
        }
        return multiplicacion;
    }

    public double dividir(Operacion o) {

        int division;
        if (o.getNumero2() == 0) {
            System.out.println("Error, Se intentó dividir por cero.");
            division = 0;
        } else {
            division = o.getNumero1() / o.getNumero2();
        }
        return division;
    }
}
