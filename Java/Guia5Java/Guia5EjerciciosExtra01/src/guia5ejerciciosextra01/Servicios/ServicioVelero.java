package guia5ejerciciosextra01.Servicios;

import guia5ejerciciosextra01.Entidades.Barco;
import guia5ejerciciosextra01.Entidades.Velero;
import guia5ejerciciosextra01.Interfaces.ModulosAlquiler;
import java.util.Scanner;

public class ServicioVelero implements ModulosAlquiler<Velero> {

    private ServicioBarco sb = new ServicioBarco();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Velero crearBarco() {
        Barco b = sb.crearBarco();
        System.out.println("Ingrese la cantidad de mastiles:");
        double mastiles = leer.nextDouble();
        Velero v = new Velero(mastiles, b.getMatricula(), b.getEslora(), b.getAnioDeFabricacion(), 0.0);
        v.setModulo(this.calcularModulo(v.getEslora(), v.getMastiles()));
        return v;
    }

    public double calcularModulo(double eslora, double mastiles) {
        double modulo = (eslora * 10) + mastiles;
        return modulo;
    }

}
