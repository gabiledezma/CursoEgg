package guia4ejercicio03.entidades;

import java.util.HashMap;

public class Baraja {
    /*
        La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
     */
    private HashMap<Integer, Carta> baraja = new HashMap();

    public Baraja() {
    }

    public Baraja(HashMap<Integer, Carta> baraja) {
        this.baraja = baraja;
    }

    public HashMap<Integer, Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(HashMap<Integer, Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
    
    
}
