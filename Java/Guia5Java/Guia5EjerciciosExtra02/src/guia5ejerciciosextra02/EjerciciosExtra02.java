package guia5ejerciciosextra02;

import guia5ejerciciosextra02.Entidades.Edificio;
import guia5ejerciciosextra02.Entidades.EdificioDeOficinas;
import guia5ejerciciosextra02.Entidades.Polideportivo;
import guia5ejerciciosextra02.Servicios.ServicioEdificioDeOficinas;
import guia5ejerciciosextra02.Servicios.ServicioPolideportivo;
import java.util.ArrayList;

public class EjerciciosExtra02 {

    public static void main(String[] args) {
        /*
            2. Crear una superclase llamada Edificio con los siguientes 
            atributos: ancho, alto y largo. 
            La clase edificio tendrá como métodos:
            • Método calcularSuperficie(): calcula la superficie del 
            edificio.
            • Método calcularVolumen(): calcula el volumen del edifico.
            Estos métodos serán abstractos y los implementarán las siguientes 
            clases:
            • Clase Polideportivo con su nombre y tipo de instalación que puede 
            ser Techado o Abierto, esta clase implementará los dos métodos 
            abstractos y los atributos del padre.
            • Clase EdificioDeOficinas con sus atributos número de oficinas, 
            cantidad de personas por oficina y numero de pisos. Esta clase 
            implementará los dos métodos abstractos y los atributos del padre.
            De esta clase nos interesa saber cuantas personas pueden trabajar en 
            todo el edificio, el usuario dirá cuantas personas entran en cada 
            oficina, cuantas oficinas y el numero de piso (suponiendo que en 
            cada piso hay una oficina).
            Crear el método cantPersonas(), que muestre cuantas personas 
            entrarían en un piso y cuantas en todo el edificio.
            Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. 
            El ArrayList debe contener dos polideportivos y dos edificios de 
            oficinas. Luego, recorrer este array y ejecutar los métodos 
            calcularSuperficie y calcularVolumen en cada Edificio. Se deberá 
            mostrar la superficie y el volumen de cada edificio.
            Además de esto, para la clase Polideportivo nos interesa saber 
            cuantos polideportivos son techados y cuantos abiertos. Y para la 
            clase EdificioDeOficinas deberemos llamar al método cantPersonas() y
            mostrar los resultados de cada edificio de oficinas.
         */

        ArrayList<Edificio> consorcio = new ArrayList();
        ServicioPolideportivo sp = new ServicioPolideportivo();
        ServicioEdificioDeOficinas sedo = new ServicioEdificioDeOficinas();
        int cantPolideportivos = 2;
        int cantEdificiosDeOficinas = 2;
        for (int i = 0; i < cantPolideportivos; i++) { // crear polideportivos
            Polideportivo p = sp.crearPolideportivo();
            consorcio.add(p);
        }
        for (int i = 0; i < cantEdificiosDeOficinas; i++) {
            EdificioDeOficinas edo = sedo.crearEdificioDeOficinas();
            consorcio.add(edo);
        }
        for (int i = 0; i < consorcio.size(); i++) {
            if (i < cantPolideportivos) {
                System.out.println("----Polideportivo----");
                System.out.println("La superficie del edificio es: " + sp.calcularSuperficie(consorcio.get(i).getAlto(), consorcio.get(i).getLargo(), consorcio.get(i).getAncho()));
                System.out.println("El volumen del edificio es:" + sp.calcularVolumen(consorcio.get(i).getAlto(), consorcio.get(i).getLargo(), consorcio.get(i).getAncho()));
                sp.esTechado((Polideportivo) consorcio.get(i));
            } else {
                System.out.println("----Edificio De Oficinas----");
                System.out.println("La superficie del edificio es: " + sedo.calcularSuperficie(consorcio.get(i).getAlto(), consorcio.get(i).getLargo(), consorcio.get(i).getAncho()));
                System.out.println("El volumen del edificio es:" + sedo.calcularVolumen(consorcio.get(i).getAlto(), consorcio.get(i).getLargo(), consorcio.get(i).getAncho()));
                sedo.cantPersonas((EdificioDeOficinas) consorcio.get(i));
            }
        }

    }

}
