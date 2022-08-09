package guia2ejercicio06.Servicio;

import guia2ejercicio06.Entidades.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {
        Cafetera c = new Cafetera();
        System.out.println("Ingrese el tamaño de la cafetera.");
        c.setCapacidadmax(leer.nextInt());
        do {
            System.out.println("Ingrese la cantidad actual");
            c.setCantactual(leer.nextInt());
            if (c.getCantactual() > c.getCapacidadmax()) {
                System.out.println("NO puede ingresar mas del máximo. ");
            }
        } while (c.getCantactual() > c.getCapacidadmax());
        return c;
    }

    public void llenarCafetera(Cafetera c) {
        c.setCantactual(c.getCapacidadmax());
    }

    public void servirTaza(Cafetera c) {
        int tamaniotaza;
        double porctaza, tamtaza;
        System.out.println("Ingrese el tamaño de la taza: ");
        tamaniotaza = leer.nextInt();
        tamtaza = tamaniotaza;
        if (c.getCantactual() > 0) {
            if (c.getCantactual() >= tamaniotaza) {
                c.setCantactual(c.getCantactual() - tamaniotaza);
                System.out.println("Se llenó la taza.");
            } else {
                porctaza = (c.getCantactual() / tamtaza) * 100;
                c.setCantactual(0);
                System.out.println("La taza fue cargada hasta " + porctaza + "%.");
            }
        } else if (c.getCantactual() == 0) {
            System.out.println("La cafetera está vacía.");
        }
    }

    public void vaciarCafetera(Cafetera c) {
        c.setCantactual(0);
    }

    public void agregarCafe(Cafetera c) {
        int cafeextra;
        System.out.println("Ingrese la cantidad deseada a agregar: ");
        cafeextra = leer.nextInt();
        if ((c.getCantactual() + cafeextra) < c.getCapacidadmax()) {
            c.setCantactual(c.getCantactual() + cafeextra);
        }
    }

}
