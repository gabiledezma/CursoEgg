package guia4ejercicio03.servicios;

import guia4ejercicio03.entidades.Carta;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ServicioBaraja {

    private ServicioCarta sc = new ServicioCarta();
    private Random aleatorio = new Random();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashMap<Integer, Carta> crearBaraja() {
        HashMap<Integer, Carta> mazo = new HashMap();
        String palo = "";
        Integer numero = 0;
        Integer posicion = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        numero = i + 1;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        numero = i + 3;
                        break;
                }
                switch (j) {
                    case 0:
                        palo = "Oro";
                        break;
                    case 1:
                        palo = "Copa";
                        break;
                    case 2:
                        palo = "Espada";
                        break;
                    case 3:
                        palo = "Basto";
                        break;
                }
                Carta c = new Carta();
                c.setNumero(numero);
                c.setPalo(palo);
                mazo.put(posicion, c);
                posicion++;
            }
        }
        return mazo;
    }

    public void mostrarBaraja(HashMap<Integer, Carta> mazo) {
        for (Map.Entry<Integer, Carta> entry : mazo.entrySet()) {
            Integer key = entry.getKey();
            Carta value = entry.getValue();
            System.out.println(value.toString());
        }
    }

    public HashMap<Integer, Carta> barajar(HashMap<Integer, Carta> mazo) {
        HashMap<Integer, Carta> nuevo = new HashMap();
        int posicionNueva;
        boolean conf;

        for (Map.Entry<Integer, Carta> entry : mazo.entrySet()) {
            Integer key = entry.getKey();
            Carta value = entry.getValue();
            do {
                posicionNueva = aleatorio.nextInt(40);
                if (!nuevo.containsKey(posicionNueva)) {
                    conf = false;
                } else {
                    conf = true;
                }
            } while (conf == true && nuevo.size() < 40);
            nuevo.put(posicionNueva, value);
        }
        return nuevo;
    }

    public HashMap<Integer, Carta> darCartas(HashMap<Integer, Carta> mazo) {
        HashMap<Integer, Carta> monton = new HashMap();
        System.out.println("¿Cuántas cartas desea? ");
        int num = leer.nextInt();
        int aux = 40 - mazo.size();
        if (mazo.size() >= num) {
            for (Map.Entry<Integer, Carta> entry : mazo.entrySet()) {
                Integer key = entry.getKey();
                Carta value = entry.getValue();
                if (key < num + aux) {
                    System.out.println(value.toString());
                    monton.put(key, value);
                }
            }
            for (int i = aux; i < (num + aux); i++) {
                mazo.remove(i);
            }

        } else {
            System.out.println("No hay tantas cartas en la baraja.");
        }
        return monton;
    }

    public void cartasDisponibles(HashMap<Integer, Carta> mazo) {
        int disponibles = mazo.size();
        System.out.println("Quedan disponibles " + disponibles + " cartas.");

    }

    public void siguienteCarta(HashMap<Integer, Carta> mazo) {
        int num = 0;
        int aux = 40 - mazo.size();
        if (mazo.size() >= num) {
            for (Map.Entry<Integer, Carta> entry : mazo.entrySet()) {
                Integer key = entry.getKey();
                Carta value = entry.getValue();
                if (key <= num + aux) {
                    System.out.println(value.toString());
                }
            }
        }
    }

    public void cartasMonton(HashMap<Integer, Carta> monton) {
        if (monton.size() == 0) {
            System.out.println("No ha salido ninguna carta de la baraja.");
        } else {
            System.out.println("Hay " + monton.size() + " cartas en el montón.");
            for (Map.Entry<Integer, Carta> entry : monton.entrySet()) {
                Integer key = entry.getKey();
                Carta value = entry.getValue();
                System.out.println(value.toString());
            }
        }
    }

    public void menu() {
        System.out.println("---MENÚ---\n"
                + "1. Barajar. \n"
                + "2. Siguiente Carta. \n"
                + "3. Cartas Disponibles. \n"
                + "4. Dar Cartas. \n"
                + "5. Cartas Monton. \n"
                + "6. Mostrar Baraja. \n"
                + "7. Salir. ");

    }
}
