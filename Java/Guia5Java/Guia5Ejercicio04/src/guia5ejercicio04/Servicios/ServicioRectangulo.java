package guia5ejercicio04.Servicios;

import guia5ejercicio04.Entidades.Rectangulo;
import guia5ejercicio04.Interfaces.calculosFormas;
import java.util.Scanner;

public class ServicioRectangulo implements calculosFormas<Rectangulo> {

    /*
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Rectangulo crearForma() {
        System.out.println("----Crear Rectángulo----");
        Rectangulo r = new Rectangulo();
        System.out.println("Ingrese la base: ");
        r.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura: ");
        r.setAltura(leer.nextDouble());
        this.calcularArea(r);
        this.calcularPerimetro(r);
        return r;
    }

    @Override
    public void calcularArea(Rectangulo r) {
        double area;
        area=r.getBase()*r.getAltura();
        r.setArea(area);
    }

    @Override
    public void calcularPerimetro(Rectangulo r) {
        double perimetro;
        perimetro=(r.getBase()+r.getAltura())*2;
        r.setPerimetro(perimetro);
    }
    
}
