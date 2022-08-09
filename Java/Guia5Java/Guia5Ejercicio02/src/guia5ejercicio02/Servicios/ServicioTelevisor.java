package guia5ejercicio02.Servicios;

import guia5ejercicio02.Entidades.Electrodomestico;
import guia5ejercicio02.Entidades.Televisor;
import java.util.Scanner;

public class ServicioTelevisor extends ServicioElectrodomestico {

    /*

     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Televisor crearTelevisor() {
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion: ");
        double resolucion = 0;
        do {
            resolucion = leer.nextDouble();
            if (resolucion < 1) {
                System.out.println("La resolucion debe ser mayor a 1.");
            }
        } while (resolucion < 1);
        System.out.println("Tiene sintonizador TDT: (true/false)");
        boolean TDT = leer.nextBoolean();
        Televisor t = new Televisor(resolucion, TDT, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
        return t;
    }

    /*
        • Método precioFinal(): este método será heredado y se le sumará
        la siguiente funcionalidad. Si el televisor tiene una resolución mayor 
        de 40 pulgadas, se incrementará el precio un 30% y si tiene un 
        sintonizador TDT incorporado, aumentará $500. Recuerda que las 
        condiciones que hemos visto en la clase Electrodomestico también deben 
        afectar al precio.
     */
    public void precioFinal(Televisor t) {
        double aumentoParcial = super.precioFinal(t.getConsumoEnergetico(), t.getPeso());
        double precio = t.getPrecio();
        if (t.getResolucion() > 40) {
            precio = precio + (0.3 * precio);
        }
        if (t.getTDT() == true) {
            aumentoParcial = aumentoParcial + 500;
        }
        t.setPrecio(precio + aumentoParcial);
    }

}
