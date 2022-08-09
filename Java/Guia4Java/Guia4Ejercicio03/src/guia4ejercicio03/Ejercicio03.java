package guia4ejercicio03;

import guia4ejercicio03.entidades.Carta;
import guia4ejercicio03.servicios.ServicioBaraja;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        /*
            3. Realizar una baraja de cartas españolas orientada a objetos. Una 
        carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un 
        palo (espadas, bastos, oros y copas). Esta clase debe contener un método 
        toString() que retorne el número de carta y el palo. La baraja estará 
        compuesta por un conjunto de cartas, 40 exactamente.
            Las operaciones que podrá realizar la baraja son:
                • barajar(): cambia de posición todas las cartas aleatoriamente.
                • siguienteCarta(): devuelve la siguiente carta que está en la 
        baraja, cuando no haya más o se haya llegado al final, se indica al 
        usuario que no hay más cartas.
                • cartasDisponibles(): indica el número de cartas que aún se 
        puede repartir.
                • darCartas(): dado un número de cartas que nos pidan, le 
        devolveremos ese número de cartas. En caso de que haya menos cartas que 
        las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
                • cartasMonton(): mostramos aquellas cartas que ya han salido, 
        si no ha salido ninguna indicárselo al usuario
                • mostrarBaraja(): muestra todas las cartas hasta el final. Es 
        decir, si se saca una carta y luego se llama al método, este no mostrara 
        esa primera carta.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioBaraja sb = new ServicioBaraja();
        HashMap<Integer, Carta> base = sb.crearBaraja();
        int opcion;
        boolean conf = false;
        HashMap<Integer, Carta> mezclada = new HashMap();
        HashMap<Integer, Carta> monton = new HashMap();
        do {
            sb.menu();
            System.out.println("Seleccione una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    mezclada = sb.barajar(base);
                    conf = true;
                    break;
                case 2:
                    if (mezclada.size() == 0) {
                        sb.siguienteCarta(base);
                    } else {
                        sb.siguienteCarta(mezclada);
                    }
                    break;
                case 3:
                    if (mezclada.size() == 0) {
                        sb.cartasDisponibles(base);
                    } else {
                        sb.cartasDisponibles(mezclada);
                    }
                    break;
                case 4:
                    if (conf == true) {
                        monton = sb.darCartas(mezclada);
                    } else {
                        System.out.println("Primero debe mezclar la baraja.");
                    }
                    break;
                case 5:
                    sb.cartasMonton(monton);
                    break;
                case 6:
                    if (mezclada.size() == 0) {
                        sb.mostrarBaraja(base);
                    } else {
                        sb.mostrarBaraja(mezclada);
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("La opción ingresada no es válida. ");
                    break;
            }
        } while (opcion != 7);

    }

}
