package guia4ejercicio02.servicios;

import guia4ejercicio02.entidades.Juego;
import java.util.Scanner;

public class ServicioJuego {

    /*
                • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este 
                método recibe los jugadores y el revolver para guardarlos en los 
                atributos del juego.
                • ronda(): cada ronda consiste en un jugador que se apunta con 
                el revolver de agua y aprieta el gatillo. Sí el revolver tira el 
                agua el  jugador se moja y se termina el juego, sino se moja, se 
                pasa al  siguiente jugador hasta que uno se moje. Si o si 
                alguien se tiene que mojar. Al final del juego, se debe mostrar 
                que jugador se mojó.
                Pensar la lógica necesaria para realizar esto, usando los 
                atributos de la clase Juego.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ServicioJugador sj = new ServicioJugador();
    private ServicioRevolver sr = new ServicioRevolver();

    public Juego llenarJuego() {
        Juego nuevo = new Juego();
        nuevo.setJugadores(sj.crearJugadores());
        nuevo.setR(sr.llenarRevolver());
        return nuevo;
    }

    public void ronda(Juego j) {
        boolean conf;
        do {
            conf = sj.disparo(j.getJugadores(), j.getR());
        } while (conf == false);

    }

}
