package guia2ejerciciosextra03.Servicio;

import guia2ejerciciosextra03.Entidades.Raiz;
import java.util.Scanner;

public class ServicioRaiz {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raiz crearRaiz() {
        Raiz x = new Raiz();
        System.out.println("Ingrese un valor para a: ");
        x.setA(leer.nextInt());
        System.out.println("Ingrese un valor para b: ");
        x.setB(leer.nextInt());
        System.out.println("Ingrese un valor para c: ");
        x.setC(leer.nextInt());
        x.setDiscriminante();
        System.out.println(x.getDiscriminante());
        return x;
    }

    public boolean tieneRaices(Raiz x) {
        boolean soluciones;
        if (x.getDiscriminante() > 0) {
            return soluciones = true;
        }
        return soluciones = false;
    }

    public boolean tieneRaiz(Raiz x) {
        boolean solucion;
        if (x.getDiscriminante() == 0) {
            return solucion = true;
        }
        return solucion = false;
    }

    public void obtenerRaices(Raiz x, boolean soluciones) {
        double solucion1, solucion2;
        if (soluciones == true) {
            solucion1 = ((double) ((x.getB() * -1) + ((double) (Math.sqrt(x.getDiscriminante())))) / (2 * x.getA()));
            System.out.println("Solución 1:" + solucion1);
            solucion2 = ((double) ((x.getB() * -1) - ((double) (Math.sqrt(x.getDiscriminante())))) / (2 * x.getA()));
            System.out.println("Solución 2: " + solucion2);
        }
    }

    public void obtenerRaiz(Raiz x, boolean solucion) {
        double solucion1;
        if (solucion == true) {
            solucion1 = (x.getB() * -1) / (2 * x.getA());
            System.out.println("Solución:  " + solucion1);
        }
    }

    public void calcular(Raiz x) {
        if (this.tieneRaices(x) == true || this.tieneRaiz(x) == true) {
            this.obtenerRaices(x, this.tieneRaices(x));
            this.obtenerRaiz(x, this.tieneRaiz(x));
        } else {
            System.out.println("No tiene solución.");
        }
    }
}
