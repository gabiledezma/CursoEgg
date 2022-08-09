package guia3ejercicio06.Servicio;

import guia3ejercicio06.Entidades.Producto;
import java.util.HashMap;
import java.util.Scanner;

public class ServicioProducto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearMenu(HashMap<String, Double> listadoProductos) {
        int opcion;
        do {
            System.out.println("---Menú---\n"
                    + "1. Introducir producto nuevo.\n"
                    + "2. Modificar precio de producto.\n"
                    + "3. Eliminar producto.\n"
                    + "4. Mostrar listado de productos.\n"
                    + "5. Salir.");
            do {
                opcion = leer.nextInt();
                if (opcion < 1 || opcion > 5) {
                    System.out.println("Opción inválida, intentelo nuevamente.");
                }
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    this.crearProductos(listadoProductos);
                    break;
                case 2:
                    this.modificarPrecio(listadoProductos);
                    break;
                case 3:
                    this.eliminarProducto(listadoProductos);
                    break;
                case 4:
                    this.mostrarProductos(listadoProductos);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);
    }

    public void crearProductos(HashMap<String, Double> listadoProductos) {
        Producto p = new Producto();
        System.out.println("Ingrese el nombre del producto: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese el precio: ");
        p.setPrecio(leer.nextDouble());
        listadoProductos.put(p.getNombre(), p.getPrecio());

    }

    public void modificarPrecio(HashMap<String, Double> listadoProductos) {
        double precionuevo;
        System.out.println("Ingrese el nombre del producto que desea cambiar su precio: ");
        String buscado = leer.next();
        if (listadoProductos.containsKey(buscado)) {
            System.out.println("Ingrese el precio nuevo: ");
            precionuevo = leer.nextDouble();
            listadoProductos.replace(buscado, precionuevo);
        } else {
            System.out.println("El producto ingresado NO se encuentra en la lista. ");
        }
    }

    public void eliminarProducto(HashMap<String, Double> listadoProductos) {
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String buscado = leer.next();
        if (listadoProductos.containsKey(buscado)) {
            listadoProductos.remove(buscado);
        } else {
            System.out.println("El producto ingresado NO se encuentra en la lista. ");
        }
    }

    public void mostrarProductos(HashMap<String, Double> listadoProductos) {
        for (HashMap.Entry<String, Double> entry : listadoProductos.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", precio: " + entry.getValue());
        }
    }

}
