package guia5ejerciciosextra01.Servicios;

import guia5ejerciciosextra01.Entidades.Barco;
import guia5ejerciciosextra01.Interfaces.ModulosAlquiler;
import java.util.Scanner;

public class ServicioBarco implements ModulosAlquiler<Barco> {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Barco crearBarco() {
        Barco b = new Barco();
        System.out.println("Ingrese la matrícula: ");
        b.setMatricula(leer.next());
        System.out.println("Ingrese la eslora (en mts): ");
        b.setEslora(leer.nextDouble());
        System.out.println("Ingrese el año de fabricación: ");
        b.setAnioDeFabricacion(leer.nextInt());
        b.setModulo(this.calcularModulo(b.getEslora()));
        return b;
    }

    
    public double calcularModulo(double eslora) {
        double modulo = eslora * 10;
        return modulo;
    }

}
