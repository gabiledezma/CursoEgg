package guia3ejercicio01rebis.Servicio;

import guia3ejercicio01rebis.Entidades.Perrorebis;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerrorebis {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearYGuardarPerro(ArrayList<Perrorebis> listaPerros) {
        Perrorebis p = new Perrorebis();
        System.out.println("Ingrese una raza de perros: ");
        p.setRaza(leer.next());
        listaPerros.add(p);

    }

    public void mostrarPerros(ArrayList<Perrorebis> listaPerros) {
        System.out.println(listaPerros.toString());
    }

    public void buscarYEliminar(ArrayList<Perrorebis> listaPerros) {
        System.out.println("Ingrese la raza a buscar: ");
        String buscada = leer.next();
        int contador = 0;
        Iterator<Perrorebis> it = listaPerros.iterator();
        while (it.hasNext()) {
            Perrorebis p = it.next();
            if (p.getRaza().equals(buscada)) {
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
