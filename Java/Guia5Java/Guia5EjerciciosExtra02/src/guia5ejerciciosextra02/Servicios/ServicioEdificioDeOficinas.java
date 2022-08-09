package guia5ejerciciosextra02.Servicios;

import guia5ejerciciosextra02.Entidades.EdificioDeOficinas;
import java.util.Scanner;

public class ServicioEdificioDeOficinas extends ServicioEdificio {

    /*
        Esta clase implementará los dos métodos abstractos y los atributos del 
        padre. De esta clase nos interesa saber cuantas personas pueden trabajar 
        en todo el edificio, el usuario dirá cuantas personas entran en cada 
        oficina, cuantas oficinas y el numero de piso (suponiendo que en cada 
        piso hay una oficina). Crear el método cantPersonas(), que muestre 
        cuantas personas entrarían en un piso y cuantas en todo el edificio.
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas crearEdificioDeOficinas() {
        EdificioDeOficinas edo = new EdificioDeOficinas();
        System.out.println("----Edificio De Oficinas----");
        System.out.println("Ingrese el alto: ");
        edo.setAlto(leer.nextInt());
        System.out.println("Ingrese el ancho: ");
        edo.setAncho(leer.nextInt());
        System.out.println("Ingrese el largo: ");
        edo.setLargo(leer.nextInt());
        System.out.println("Ingrese la cantidad de pisos: ");
        edo.setPisos(leer.nextInt());
        System.out.println("Ingrese la cantidad de oficinas por piso: ");
        edo.setCantidadDeOficinas(leer.nextInt());
        System.out.println("Ingrese la cantidad de personas por oficina: ");
        edo.setPersonasPorOficina(leer.nextInt());
        return edo;
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

    public void cantPersonas(EdificioDeOficinas edo) {
        int personasPorPiso = edo.getPersonasPorOficina() * edo.getCantidadDeOficinas();
        int personasEdificio = personasPorPiso * edo.getPisos();
        System.out.println("Ingresan por piso " + personasPorPiso + " personas, y en total en el edificio ingresan " + personasEdificio + " personas.");
    }

}
