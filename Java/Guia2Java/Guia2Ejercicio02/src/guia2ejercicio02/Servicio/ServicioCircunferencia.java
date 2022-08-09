package guia2ejercicio02.Servicio;

import guia2ejercicio02.entidades.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {

    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        Circunferencia c = new Circunferencia();
        System.out.println("Ingrese el radio: ");
        c.setRadio(leer.nextDouble());
        return c;
    }

    public double area(Circunferencia c) {
        double area;
        area = Math.PI * c.getRadio() * c.getRadio();
        return area;
    }

    public double perimetro(Circunferencia c) {
        double perimetro;
        perimetro = 2 * c.getRadio() * Math.PI;
        return perimetro;
    }

}
