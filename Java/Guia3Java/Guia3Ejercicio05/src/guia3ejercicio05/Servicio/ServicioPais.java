package guia3ejercicio05.Servicio;

import guia3ejercicio05.Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pais crearPais() {
        Pais p = new Pais();
        System.out.println("Ingrese el nombre de un pais: ");
        p.setNombre(leer.next());
        return p;
    }

    public void mostrarPaises(HashSet<Pais> Paises) {
        for (Pais ListaPaises : Paises) {
            System.out.println(ListaPaises);
        }
    }

    public void ordenarPaisesPorNombre(HashSet<Pais> Paises) {
        ArrayList<Pais> ListaPaises = new ArrayList(Paises);
        Collections.sort(ListaPaises, Pais.ordenarPaises);
        System.out.println(ListaPaises.toString());
    }

    public void buscarYEliminar(HashSet<Pais> Paises) {
        int contador = 0;
        int aux = 0;
        System.out.println("Ingrese un pais a eliminar: ");
        String buscado = leer.next();
        Iterator<Pais> it = Paises.iterator();
        while (it.hasNext()) {
            Pais p = it.next();
            if (p.getNombre().equals(buscado)) {
                it.remove();
                aux++;
            } else {
                contador++;
            }
            if (contador == Paises.size() && aux == 0) {
                System.out.println("El pais buscado NO se encuentra en el conjunto.");
            }
        }
        System.out.println(Paises.toString());
    }
}
