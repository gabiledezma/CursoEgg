package guia5ejerciciosextra01.Servicios;

import guia5ejerciciosextra01.Entidades.Alquiler;
import guia5ejerciciosextra01.Entidades.Barco;
import guia5ejerciciosextra01.Entidades.BarcoAMotor;
import guia5ejerciciosextra01.Entidades.Velero;
import guia5ejerciciosextra01.Entidades.Yate;
import java.util.Date;
import java.util.Scanner;

public class ServicioAlquiler {

    /*
            Un alquiler se calcula multiplicando el número de días de ocupación 
        (calculado con la fecha de alquiler y devolución), por un valor módulo 
        de cada barco (obtenido simplemente multiplicando por 10 los metros de 
        eslora).
            En los barcos de tipo especial el módulo de cada barco, se calcula 
        sacando el modulo normal y sumándole el atributo particular de cada 
        barco. En los veleros se suma el número de mástiles, en los barcos a 
        motor se le suma la potencia en CV y en los yates se suma la potencia en 
        CV y el número de camarotes.
            Utilizando la herencia de forma apropiada, deberemos programar en 
        Java, las clases y los métodos necesarios que permitan al usuario elegir 
        el barco que quiera alquilar y mostrarle el precio final de su alquiler.
    
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler() {
        Alquiler a = new Alquiler();
        System.out.println("Ingrese el nombre: ");
        a.setNombre(leer.next());
        System.out.println("Ingrese el documento: ");
        a.setDocumento(leer.nextLong());
        System.out.println("Ingrese la fecha de inicio del alquiler: (DD/MM/AAAA)");
        System.out.println("Dia: (1-31)");
        int dia = leer.nextInt();
        System.out.println("Mes: (1-12)");
        int mes = leer.nextInt();
        System.out.println("Año: (4 digitos) ");
        int anio = leer.nextInt();
        Date fechaInicio = new Date(anio - 1900, mes - 1, dia);
        System.out.println("Ingrese la fecha de fin del alquiler: (DD/MM/AAAA)");
        System.out.println("Dia: (1-31)");
        int diaFin = leer.nextInt();
        System.out.println("Mes: (1-12)");
        int mesFin = leer.nextInt();
        System.out.println("Año: (4 digitos) ");
        int anioFin = leer.nextInt();
        Date fechaFin = new Date(anioFin - 1900, mesFin - 1, diaFin);
        System.out.println("Ingrese posición de amarre: ");
        a.setPosicionAmarre(leer.nextInt());
        a.setBarco(this.elegirBarco());
        double diferencia = (double) fechaFin.getTime() - (double) fechaInicio.getTime();
        diferencia = diferencia / 86400000; // el divisor es la cantidad de milisegundos que hay en el dia. (1000*60*60*24)
        a.setMontoAlquiler(this.calcularAlquiler(diferencia, a.getBarco().getModulo()));
        System.out.println("El monto a abonar es: $" + a.getMontoAlquiler() + ". ");
        return a;
    }

    public Barco elegirBarco() {
        System.out.println("¿Qué tipo de barco desea? \n"
                + "1. Barco a motor. \n"
                + "2. Velero.\n"
                + "3. Yate. \n"
                + "4. Otro. ");
        String opcion = leer.next();
        switch (opcion) {
            case "1":
                ServicioBarcoAMotor sbam = new ServicioBarcoAMotor();
                BarcoAMotor bam = sbam.crearBarco();
                return bam;
            case "2":
                ServicioVelero sv = new ServicioVelero();
                Velero v = sv.crearBarco();
                return v;
            case "3":
                ServicioYate sy = new ServicioYate();
                Yate y = sy.crearBarco();
                return y;
            default:
                ServicioBarco sb = new ServicioBarco();
                Barco b = sb.crearBarco();
                return b;
        }
    }

    public double calcularAlquiler(double diferencia, double modulo) { // diferencia hace referencia a los dias del alquiler
        double monto;
        monto = (double) diferencia * modulo;
        return monto;
    }

}
