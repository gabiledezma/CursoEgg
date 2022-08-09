package guia4ejerciciosextra02.Entidades;

import java.util.ArrayList;

public class Cine {

    private ArrayList<Sala> Salas = new ArrayList();

    public Cine() {
    }

    public Cine(ArrayList<Sala> Salas) {
        this.Salas = Salas;
    }

    public ArrayList<Sala> getSalas() {
        return Salas;
    }

    public void setSalas(ArrayList<Sala> Salas) {
        this.Salas = Salas;
    }

    @Override
    public String toString() {
        return "Cine{" + "Salas=" + Salas + '}';
    }

}
