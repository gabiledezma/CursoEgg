package guia5ejerciciosextra01.Servicios;

import guia5ejerciciosextra01.Entidades.Barco;
import guia5ejerciciosextra01.Entidades.BarcoAMotor;
import guia5ejerciciosextra01.Interfaces.ModulosAlquiler;
import java.util.Scanner;

public class ServicioBarcoAMotor implements ModulosAlquiler<BarcoAMotor> {

    private ServicioBarco sb = new ServicioBarco();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public BarcoAMotor crearBarco() {
        Barco b = sb.crearBarco();
        System.out.println("Ingrese la potencia del motor(en CV):");
        double potenciaMotor = leer.nextDouble();
        BarcoAMotor bam = new BarcoAMotor(potenciaMotor, b.getMatricula(), b.getEslora(), b.getAnioDeFabricacion(), 0.0);
        bam.setModulo(this.calcularModulo(bam.getEslora(), bam.getPotenciaMotor()));
        return bam;
    }

    public double calcularModulo(double eslora, double potenciaMotor) {
        double modulo = (eslora * 10) + potenciaMotor;
        return modulo;
    }

}
