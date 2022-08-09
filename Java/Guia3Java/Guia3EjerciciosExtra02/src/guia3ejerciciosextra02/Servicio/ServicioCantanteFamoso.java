package guia3ejerciciosextra02.Servicio;

import guia3ejerciciosextra02.Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioCantanteFamoso {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLista(ArrayList<CantanteFamoso> cantantes) {
        System.out.println("Ingrese los cantantes con sus respectivos discos más vendidos: ");
        for (int i = 0; i < 5; i++) {
            CantanteFamoso cf = new CantanteFamoso();
            System.out.println("Ingrese el nombre del " + (i + 1) + "° cantante: ");
            cf.setNombre(leer.next());
            System.out.println("Ingrese el nombre del disco más vendido del " + (i + 1) + "° cantante: ");
            cf.setDiscoConMasVentas(leer.next());
            cantantes.add(cf);
        }
    }

    public void mostrarLista(ArrayList<CantanteFamoso> cantantes) {
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante.toString());
        }
    }

    public void menu(ArrayList<CantanteFamoso> cantantes) {
        int opcion;
        boolean conf;
        do {
            this.mostrarMenu();
            do {
                System.out.println("Ingrese la opción deseada: ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        this.agregarCantante(cantantes);
                        conf = true;
                        break;
                    case 2:
                        this.mostrarLista(cantantes);
                        conf = true;
                        break;
                    case 3:
                        this.eliminarCantante(cantantes);
                        conf = true;
                        break;
                    case 4:
                        conf = true;
                        break;
                    default:
                        System.out.println("La opción ingresada NO es válida.");
                        conf = false;
                }
            } while (conf == false);

        } while (opcion != 4);
    }

    public void agregarCantante(ArrayList<CantanteFamoso> cantantes) {
        CantanteFamoso cf = new CantanteFamoso();
        System.out.println("Ingrese el nombre del cantante: ");
        cf.setNombre(leer.next());
        System.out.println("Ingrese el nombre del disco más vendido del cantante: ");
        cf.setDiscoConMasVentas(leer.next());
        cantantes.add(cf);
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> cantantes) {
        System.out.println("Ingrese el nombre del cantante a eliminar: ");
        String buscado = leer.next();
        Iterator<CantanteFamoso> it = cantantes.iterator();
        while (it.hasNext()) {
            CantanteFamoso cf = it.next();
            if (cf.getNombre().equals(buscado)) {
                it.remove();
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("---MENÜ---\n"
                + "1. Agregar cantante.\n"
                + "2. Mostrar listado de cantantes.\n"
                + "3. Eliminar un cantante.\n"
                + "4. Salir.");
    }
}
