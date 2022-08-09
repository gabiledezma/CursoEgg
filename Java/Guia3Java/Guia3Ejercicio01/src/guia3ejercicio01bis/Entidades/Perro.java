package guia3ejercicio01bis.Entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Perro {

    private String raza;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }

    public void crearYGuardarPerro(ArrayList<Perro> listaPerros) {
        Perro p = new Perro();
        System.out.println("Ingrese una raza de perros: ");
        p.raza = leer.next();
        listaPerros.add(p);

    }

    public void mostrarPerros(ArrayList<Perro> listaPerros) {
        System.out.println(listaPerros.toString());
    }

    public void buscarYEliminar(ArrayList<Perro> listaPerros) {
        System.out.println("Ingrese la raza a buscar: ");
        String buscada = leer.next();
        int contador = 0;
        Iterator<Perro> it = listaPerros.iterator();
        while (it.hasNext()) {
            Perro p = it.next();
            if (p.raza.equals(buscada)) {
                it.remove();
            } else {
                contador++;
            }
        }
        if (contador == listaPerros.size()) {
            System.out.println("La raza NO se encuentra en la lista.");
        }
        System.out.println(listaPerros.toString());
    }
}
