package tienda.servicios;

import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ServicioProducto {

    private ProductoDAO dao = new ProductoDAO();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto crearProducto() {
        Producto p = new Producto();
        System.out.println("Creando Producto...");
        System.out.println("Ingrese el nombre: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese el precio: ");
        p.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el código del fabricante: ");
        p.setCodigoFabricante(leer.nextInt());
        return p;
    }

    public void insertarProducto(String nombre, Double precio, Integer codigoFabricante) throws Exception {

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (precio == null || precio == 0) {
                throw new Exception("Debe indicar el precio");
            }
            if (codigoFabricante == null || codigoFabricante == 0) {
                throw new Exception("Debe indicar el codigo del fabricante");
            }
            if (precio < 0) {
                throw new Exception("El precio no puede ser menor a 0");
            }
            if (buscarProductoPorNombre(nombre) != null) {
                throw new Exception("Ya existe un producto con el nombre indicado " + nombre);
            }
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.guardarProducto(producto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarPrecioProducto(String nombre, Double precioActual, Double nuevoPrecio) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el producto");
            }
            if (precioActual == null || precioActual == 0) {
                throw new Exception("Debe indicar el precio actual");
            }
            if (nuevoPrecio == null || nuevoPrecio == 0) {
                throw new Exception("Debe indicar el precio nuevo");
            }
            Producto producto = buscarProductoPorNombre(nombre);
            if (!producto.getPrecio().equals(precioActual)) {
                throw new Exception("El precio actual no es el registrado en el sistema para el nombre indicado");
            }
            producto.setPrecio(nuevoPrecio);
            dao.modificarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            dao.eliminarProducto(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            Producto producto = dao.buscarProductoPorNombre(nombre);
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(Integer codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo");
            }
            Producto producto = dao.buscarProductoPorCodigo(codigo);
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProducto() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductos();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarNombresDeProductos() throws Exception {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("----Nombres----");
                for (Producto p : productos) {
                    System.out.println(p.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarNombresYPreciosDeProductos() throws Exception {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("----Nombres y Precios----");
                for (Producto p : productos) {
                    System.out.println("Nombre: " + p.getNombre() + " Precio: " + p.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarPreciosEntre120y202() throws Exception {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("----Productos----");
                for (Producto p : productos) {
                    if (p.getPrecio() >= 120 && p.getPrecio() <= 202) {
                        System.out.println(p);
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarPortatiles() throws Exception {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("----Portátiles----");
                for (Producto p : productos) {
                    if (p.getNombre().contains("Portátil")) {
                        System.out.println(p);
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarProductoMasBarato() throws Exception {
        try {
            Producto p = dao.buscarProductoMasBarato();
            if (p.getNombre().equals(null) || p.getPrecio() == null) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("----Producto Más Barato----");
                System.out.println("Nombre: " + p.getNombre() + " Precio: " + p.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarProductoMasCaro() throws Exception {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println(Collections.max(productos, Producto.compararPrecio)); 
            }
        } catch (Exception e) {
            throw e;
        }
    }


    public void modificarProducto() throws Exception {

        try {
            String nombre = "", opcion = "";
            int contador = 0, contador2 = 0, aux = 0;
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                do {
                    System.out.println("Ingrese el nombre del producto a modificar: ");
                    nombre = leer.next();
                    for (Producto producto : productos) {
                        if (producto.getNombre().contains(nombre)) {
                            contador++;
                        } else {
                            aux++;
                        }
                    }
                    if (aux == productos.size()) {
                        System.out.println("No se encontró el nombre, vuelva a intentarlo.");
                    }
                } while (contador == 0);
                do {
                    System.out.println("¿Qué desea modificar?\n"
                            + "1. Codigo. \n"
                            + "2. Nombre. \n"
                            + "3. Precio. \n"
                            + "4. Codigo Fabricante. \n"
                            + "5. Salir. ");
                    opcion = leer.next();
                    switch (opcion) {
                        case "1": // codigo
                            System.out.println("Nuevo codigo: ");
                            int nuevoCodigo = leer.nextInt();
                            dao.editarCodigo(nombre, nuevoCodigo);
                            System.out.println("Producto modificado correctamente.");
                            break;
                        case "2": // nombre
                            System.out.println("Nuevo nombre: ");
                            String nuevoNombre = leer.next();
                            dao.editarNombre(nombre, nuevoNombre);
                            System.out.println("Producto modificado correctamente.");
                            break;
                        case "3": // precio
                            System.out.println("Nuevo precio: ");
                            double nuevoPrecio = leer.nextDouble();
                            dao.editarPrecio(nombre, nuevoPrecio);
                            System.out.println("Producto modificado correctamente.");
                            break;
                        case "4": // fabricante
                            int nuevoCodigoFab = 0;
                            do {
                                System.out.println("Nuevo codigo de fabricante: ");
                                contador2 = 0;
                                nuevoCodigoFab = leer.nextInt();
                                for (Producto producto : productos) {
                                    if (producto.getCodigoFabricante() == nuevoCodigoFab) {
                                        contador++;
                                    } else {
                                        System.out.println("No se puede utilizar ese número, ya corresponde a otro fabricante, vuelva a intentarlo.");
                                    }
                                }
                            } while (contador2 != 0);
                            dao.editarCodigoFab(nombre, nuevoCodigoFab);
                            System.out.println("Producto modificado correctamente.");
                            break;
                        default:
                            System.out.println("Opción inválida. Inténtelo nuevamente");
                            break;
                    }
                } while (!opcion.equals("5"));
            }
        } catch (Exception e) {
            throw e;
        }

    }
}
