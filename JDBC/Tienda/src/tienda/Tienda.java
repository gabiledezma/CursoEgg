package tienda;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.ServicioFabricante;
import tienda.servicios.ServicioProducto;

public class Tienda {

    public static void main(String[] args) throws Exception {
        /*
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioProducto sp = new ServicioProducto();
        ServicioFabricante sf = new ServicioFabricante();
        sp.mostrarProductoMasCaro();
        String opcion = "";
        do {
            System.out.println("---MENÚ---\n"
                    + "1. Mostrar el nombre de todos los productos. \n"
                    + "2. Mostrar los nombres y los precios de todos los productos. \n"
                    + "3. Mostrar productos con precio entre 120 y 202. \n"
                    + "4. Mostrar todos los Portátiles. \n"
                    + "5. Mostrar el producto más barato. \n"
                    + "6. Ingresar un producto a la base de datos. \n"
                    + "7. Ingresar un fabricante a la base de datos. \n"
                    + "8. Modificar un producto. \n"
                    + "9. Salir. \n"
                    + "Elija una opción: ");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    sp.mostrarNombresDeProductos();
                    break;
                case "2":
                    sp.mostrarNombresYPreciosDeProductos();
                    break;
                case "3":
                    sp.mostrarPreciosEntre120y202();
                    break;
                case "4":
                    sp.mostrarPortatiles();
                    break;
                case "5":
                    sp.mostrarProductoMasBarato();
                    break;
                case "6":
                    Producto p = sp.crearProducto();
                    sp.insertarProducto(p.getNombre(), p.getPrecio(), p.getCodigoFabricante());
                    break;
                case "7":
                    Fabricante f = sf.crearFabricante();
                    sf.insertarFabricante(f.getNombre());
                    break;
                case "8":
                    sp.modificarProducto();
                    break;
                case "9":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente");
                    break;
            }
        } while (!opcion.equals("9"));
    }

}
