package guia5ejercicio02.Servicios;

import guia5ejercicio02.Entidades.Electrodomestico;
import guia5ejercicio02.Entidades.Lavadora;
import java.util.Scanner;

public class ServicioLavadora extends ServicioElectrodomestico {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
        • Método crearLavadora (): este método llama a crearElectrodomestico() 
        de la clase padre, lo utilizamos para llenar los atributos heredados 
        del padre y después llenamos el atributo propio de la lavadora.
     */
    public Lavadora crearLavadora() {
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println("Ingrese el límite de carga: ");
        int limite = 0;
        do {
            limite = leer.nextInt();
            if (limite < 1) {
                System.out.println("La carga debe ser mayor a 1.");
            }
        } while (limite < 1);
        Lavadora l = new Lavadora(limite, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
        return l;

    }

    /*
        • Método precioFinal(): este método será heredado y se le sumará 
        la siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará 
        el precio en $500, si la carga es menor o igual, no se incrementará el 
        precio. Este método debe llamar al método padre y añadir el código 
        necesario. Recuerda que las condiciones que hemos visto en la clase 
        Electrodoméstico también deben afectar al precio.
     */
    public void precioFinal(Lavadora l) {
        double aumentoParcial = super.precioFinal(l.getConsumoEnergetico(), l.getPeso());
        double aux = l.getPrecio();
        if (l.getCarga() > 30) {
            aumentoParcial = aumentoParcial + 500;
        }
        l.setPrecio(l.getPrecio() + aumentoParcial);
    }
}
