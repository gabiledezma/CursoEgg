package guia5ejercicio04.Servicios;

import guia5ejercicio04.Entidades.Circulo;
import guia5ejercicio04.Interfaces.calculosFormas;
import java.util.Scanner;

public class ServicioCirculo implements calculosFormas<Circulo> {

    /*
    Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Circulo crearForma() {
        System.out.println("----Crear Círculo----");
        Circulo c = new Circulo();
        System.out.println("Ingrese el radio: ");
        c.setRadio(leer.nextDouble());
        c.setDiametro(c.getRadio() * 2);
        this.calcularArea(c);
        this.calcularPerimetro(c);
        return c;
    }

    @Override
    public void calcularArea(Circulo c) {
        double area;
        double radio2;
        radio2 = c.getRadio() * c.getRadio();
        area = PI * radio2;
        c.setArea(area);
    }

    @Override
    public void calcularPerimetro(Circulo c) {
        double perimetro;
        perimetro = PI * c.getDiametro();
        c.setPerimetro(perimetro);
    }

}
