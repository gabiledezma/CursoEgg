package guia2ejerciciosextra06.Servicio;

import guia2ejerciciosextra06.Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego(Ahorcado a) {
        System.out.println("Ingrese una palabra");
        String palab = leer.next();
        palab = palab.toUpperCase();
        a.setLargo(palab.length());
        a.setPalabra(new String[a.getLargo()]);
        for (int i = 0; i < palab.length(); i++) {
            Arrays.fill(a.getPalabra(), i, i + 1, palab.substring(i, i + 1));
        }
        System.out.println("Ingrese la cantidad maxima de jugadas. ");
        a.setJugadasMax(leer.nextInt());
        a.setLetras(0);
    }

    public void longitud(Ahorcado a) {
        System.out.println("Longitud de la palabra: " + a.getPalabra().length);
    }

    public void buscar(Ahorcado a, String letra) {
        int contador = 0;
        for (String palabra : a.getPalabra()) {
            if (letra.equals(palabra)) {
                contador++;
            }
        }
//        for (int i = 0; i < a.getPalabra().length; i++) {
//            if (letra.equals(a.getPalabra()[i])) {
//                contador++;
//            }
//        }
        if (contador > 0) {
            System.out.println("Mensaje: La letra pertenece a la palabra. ");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra. ");
        }
    }

    public boolean encontradas(Ahorcado a, String letra) {
        boolean resultado;
        int contador = 0;
        int faltantes;
        for (String palabra : a.getPalabra()) {
            if (letra.equals(palabra)) {
                a.setLetras(a.getLetras() + 1);
                contador++;
            }
        }
//        for (int i = 0; i < a.getPalabra().length; i++) {
//            if (letra.equals(a.getPalabra()[i])) {
//                a.setLetras(a.getLetras()+1);
//                contador++; 
//            }
//        }

        faltantes = a.getPalabra().length - a.getLetras();
        System.out.println("Número de letras (encontradas, faltantes): (" + a.getLetras() + "," + faltantes + ")");
        if (contador > 0) {
            return resultado = true;
        } else {
            return resultado = false;
        }

    }

    public void intentos(Ahorcado a) {
        System.out.println("Número de oportunidades restantes: " + a.getJugadasMax());
    }

    public void juego(Ahorcado a) {
        String letra;
        this.crearJuego(a);
        this.longitud(a);
        do {
            System.out.println("Ingrese una letra:");
            letra = leer.next();
            letra = letra.toUpperCase();
            this.buscar(a, letra);
            if (this.encontradas(a, letra) == false) {
                a.setJugadasMax(a.getJugadasMax() - 1);
                if (a.getJugadasMax() == 0) {
                    break;
                }
            }
            this.intentos(a);
        } while (a.getLetras() != a.getPalabra().length);
    }
}
