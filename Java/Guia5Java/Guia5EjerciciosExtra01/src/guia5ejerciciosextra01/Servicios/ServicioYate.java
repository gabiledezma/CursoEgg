package guia5ejerciciosextra01.Servicios;

import guia5ejerciciosextra01.Entidades.BarcoAMotor;
import guia5ejerciciosextra01.Entidades.Yate;
import guia5ejerciciosextra01.Interfaces.ModulosAlquiler;
import java.util.Scanner;

public class ServicioYate implements ModulosAlquiler<Yate> {

    private ServicioBarcoAMotor sbam = new ServicioBarcoAMotor();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Yate crearBarco() {
        BarcoAMotor bam = sbam.crearBarco(); // se crear un barco a motor porque es la clase padre y asi se optimiza el codigo de este servicio
        System.out.println("Ingrese la cantidad de camarotes:");
        double camarotes = leer.nextDouble();
        Yate y = new Yate(camarotes, bam.getPotenciaMotor(), bam.getMatricula(), bam.getEslora(), bam.getAnioDeFabricacion(), 0.0);
        y.setModulo(this.calcularModulo(y.getEslora(), y.getPotenciaMotor(), y.getCamarotes()));
        return y;
    }

    public double calcularModulo(double eslora, double potenciaMotor, double camarotes) {
        double modulo = (eslora * 10) + potenciaMotor + camarotes;
        return modulo;
    }

}
