package guia5ejerciciosextra02.Servicios;

import guia5ejerciciosextra02.Entidades.Polideportivo;
import java.util.Scanner;

public class ServicioPolideportivo extends ServicioEdificio {

    /*
        • Clase Polideportivo con su nombre y tipo de instalación que puede ser 
        Techado o Abierto, esta clase implementará los dos métodos abstractos y 
        los atributos del padre.
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo crearPolideportivo() {
        Polideportivo p = new Polideportivo();
        System.out.println("----Polideportivo----");
        System.out.println("Ingrese nombre: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese el alto: ");
        p.setAlto(leer.nextInt());
        System.out.println("Ingrese el ancho: ");
        p.setAncho(leer.nextInt());
        System.out.println("Ingrese el largo: ");
        p.setLargo(leer.nextInt());
        System.out.println("¿Es techado? (s/n)");
        String techado;
        do {
            techado = leer.next();
        } while (!techado.equalsIgnoreCase("s") && !techado.equalsIgnoreCase("n"));
        boolean conf;
        if (techado.equalsIgnoreCase("s")) {
            conf = true;
        } else {
            conf = false;
        }
        p.setTechado(conf);
        return p;
    }

    public void esTechado(Polideportivo p) {
        if (p.getTechado()) {
            System.out.println("El polideportivo " + p.getNombre() + " está techado. ");
        } else {
            System.out.println("El polideportivo " + p.getNombre() + " NO está techado. ");
        }
    }

    @Override
    public int calcularSuperficie(Integer alto, Integer largo, Integer ancho) {
        int superficie = 2 * ((alto * largo) + (alto * ancho) + (largo * ancho));
        return superficie;
    }

    @Override
    public int calcularVolumen(Integer alto, Integer largo, Integer ancho) {
        int volumen = (alto * largo * ancho);
        return volumen;
    }

}
