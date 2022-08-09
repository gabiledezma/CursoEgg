package guia3ejerciciosextra04.Servicio;

import guia3ejerciciosextra04.Entidad.Ciudad;
import java.util.HashMap;
import java.util.Scanner;

public class ServicioCiudad {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        System.out.println("---MENU---\n"
                + "1. Ingresar nueva ciudad.\n"
                + "2. Mostrar ciudades guardadas.\n"
                + "3. Buscar ciudad.\n" /*segun codigo postal*/
                + "4. Eliminar ciudad.\n" /*segun codigo postal*/
                + "5. Salir.");
        System.out.println("Seleccione la opción deseada: ");
    }

    public void crearCiudades(HashMap<Integer, String> listadoCiudades) {
        for (int i = 0; i < 10; i++) {
            this.crearCiudad(listadoCiudades);
        }
    }

    public void crearCiudad(HashMap<Integer, String> listadoCiudades) {
        Ciudad c = new Ciudad();
        boolean confirmacion;
        System.out.println("Ingrese el nombre de la ciudad: ");
        c.setNombre(leer.next());
        do {
            System.out.println("Ingrese el código postal: ");
            c.setCodigopostal(leer.nextInt());
            if (listadoCiudades.containsKey(c.getCodigopostal())) {
                System.out.println("Ya existe una ciudad con ese código postal.");
                confirmacion = false;
            } else {
                listadoCiudades.put(c.getCodigopostal(), c.getNombre());
                confirmacion = true;
            }
        } while (confirmacion == false);

    }

    public void mostrarCiudades(HashMap<Integer, String> listadoCiudades) {
        for (HashMap.Entry<Integer, String> entry : listadoCiudades.entrySet()) {
            System.out.println("Nombre: " + entry.getValue() + ", Código Postal: " + entry.getKey());
        }
    }

    public void buscarCiudad(HashMap<Integer, String> listadoCiudades) {
        System.out.println("Ingrese el código postal de la ciudad buscada: ");
        Integer buscado = leer.nextInt();
        if (listadoCiudades.containsKey(buscado)) {
            System.out.println("Nombre: " + listadoCiudades.get(buscado));
        } else {
            System.out.println("La ciudad buscada no se encuentra en el listado.");
        }
    }

    public void eliminarCiudad(HashMap<Integer, String> listadoCiudades) {
        System.out.println("Ingrese el código postal de la ciudad a eliminar: ");
        Integer buscado = leer.nextInt();
        if (listadoCiudades.containsKey(buscado)) {
            listadoCiudades.remove(buscado);
        } else {
            System.out.println("La ciudad buscada no se encuentra en el listado.");
        }
    }

    public void crearMenu(HashMap<Integer, String> listadoCiudades) {
        int opcion;
        do {
            this.menu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    this.crearCiudad(listadoCiudades);
                    break;
                case 2:
                    this.mostrarCiudades(listadoCiudades);
                    break;
                case 3:
                    this.buscarCiudad(listadoCiudades);
                    break;
                case 4:
                    this.eliminarCiudad(listadoCiudades);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("La opción ingresada no es válida.");

            }
        } while (opcion != 5);

    }
}
