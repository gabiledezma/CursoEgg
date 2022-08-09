package guia2ejercicio04.Servicio;

import guia2ejercicio04.Entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    public Rectangulo crearRectangulo() {
        Rectangulo r = new Rectangulo();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectángulo: ");
        r.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo: ");
        r.setAltura(leer.nextInt());
        return r;
    }

    public int superficie(Rectangulo r) {
        int sup;
        sup = r.getBase() * r.getAltura();
        return sup;
    }

    public int perimetro(Rectangulo r) {
        int perim;
        perim = (r.getBase() + r.getAltura()) * 2;
        return perim;
    }

    public void dibujarRectangulo(Rectangulo r) {
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
