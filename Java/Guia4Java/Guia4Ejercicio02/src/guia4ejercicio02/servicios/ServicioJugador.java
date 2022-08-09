package guia4ejercicio02.servicios;

import guia4ejercicio02.entidades.Jugador;
import guia4ejercicio02.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ServicioRevolver sr = new ServicioRevolver();

    public ArrayList<Jugador> crearJugadores() {
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidadDeJugadores = leer.nextInt();
        if (cantidadDeJugadores > 5 || cantidadDeJugadores < 1) {
            cantidadDeJugadores = 6;
        }
        ArrayList<Jugador> jugadores = new ArrayList();
        for (int i = 0; i < cantidadDeJugadores; i++) {
            Jugador j = new Jugador();
            j.setId(i + 1);
            j.setNombre("Jugador " + j.getId());
            j.setMojado(false);
            jugadores.add(j);
        }
        return jugadores;
    }

    public boolean disparo(ArrayList<Jugador> jugadores, Revolver r) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (sr.mojar(r) == true) {
                jugadores.get(i).setMojado(true);
                System.out.println("El "+ jugadores.get(i).getNombre()+" es mojado.");
                return true;
            } else {
                System.out.println("El "+ jugadores.get(i).getNombre()+" no es mojado.");
                sr.siguienteChorro(r);
            }
            System.out.println("Siguiente ronda.");
        }
        return false;
    }

}
