package guia4ejerciciosextra02.Entidades;

import java.util.ArrayList;

public class Sala {

    private Asiento[][] asientos = new Asiento[8][6];
    private Pelicula peli = new Pelicula();
    private ArrayList<Espectador> espectadores = new ArrayList();
    private Double precioDeEntrada;

    public Sala() {
    }

    public Sala(Asiento[][] asientos, Pelicula peli, ArrayList<Espectador> espectadores, Double precioDeEntrada) {
        this.asientos = asientos;
        this.peli = peli;
        this.espectadores = espectadores;
        this.precioDeEntrada = precioDeEntrada;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Double getPrecioDeEntrada() {
        return precioDeEntrada;
    }

    public void setPrecioDeEntrada(Double precioDeEntrada) {
        this.precioDeEntrada = precioDeEntrada;
    }

    @Override
    public String toString() {
        return "Sala{" + ", Pelicula=" + peli + ", Espectadores=" + espectadores + ", Precio De Entrada=" + precioDeEntrada + '}';
    }

}
