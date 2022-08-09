package libreria.Servicios;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import libreria.Entidades.Prestamo;
import libreria.Persistencia.PrestamoDAO;

public class ServicioPrestamo {

    /*

    private Integer id;

    private Date fechaPrestamo;

    private Date fechaDevolucion;

    private Libro libro;

    private Cliente cliente;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private PrestamoDAO dao = new PrestamoDAO();
    private ServicioLibro sl = new ServicioLibro();
    private ServicioCliente sc = new ServicioCliente();

    public Prestamo crearPrestamo() throws Exception {
        try {
            Prestamo p = new Prestamo();
            System.out.println("Creando prestamo...");
            System.out.println("Ingrese la fecha de inicio: DD/MM/AAAA");
            int dia, mes, anio;
            do {
                System.out.println("Dia: ");
                dia = leer.nextInt();
            } while (dia > 31 || dia < 1);
            do {
                System.out.println("Mes:");
                mes = leer.nextInt();
            } while (mes > 12 || mes < 1);
            do {
                System.out.println("Año: ");
                anio = leer.nextInt();
            } while (anio > 2100 || anio < 2000);
            Date fechaInicio = new Date(anio - 1900, mes - 1, dia);
            p.setFechaPrestamo(fechaInicio);
            System.out.println("Ingrese la fecha de devolucion: DD/MM/AAAA");
            int dia2, mes2, anio2;
            do {
                System.out.println("Dia: ");
                dia2 = leer.nextInt();
            } while (dia2 > 31 || dia2 < 1);
            do {
                System.out.println("Mes:");
                mes2 = leer.nextInt();
            } while (mes2 > 12 || mes2 < 1);
            do {
                System.out.println("Año: ");
                anio2 = leer.nextInt();
            } while (anio2 > 2100 || anio2 < 2000);
            Date fechaDevolucion = new Date(anio2 - 1900, mes2 - 1, dia2);
            p.setFechaDevolucion(fechaDevolucion);
            do {
                p.setLibro(sl.elegirLibro());
                if (p.getLibro( )== null) {
                    System.err.println("Debe ingresar un libro");
                }
            } while (p.getLibro( )== null);
            do {
                p.setCliente(sc.elegirCliente());
                if (p.getCliente() == null) {
                    System.err.println("Debe ingresar un cliente");
                }
            } while (p.getCliente() == null);
            return p;
        } catch (Exception e) {
            System.out.println("Error al crear Prestamo.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void guardarPrestamo() throws Exception {
        try {
            Prestamo p = crearPrestamo();
            dao.guardar(p);
        } catch (Exception e) {
            System.out.println("Error al guardar Prestamo.");
            System.err.println(e.getMessage());
        }
    }

    public Prestamo elegirPrestamo() {
        try {
            int opcion;
            List<Prestamo> prestamos = dao.listarPrestamos();
            if (prestamos.isEmpty()) {
                System.out.println("Lista de prestamos vacia. ");
                return null;
            } else {
                Prestamo p = new Prestamo();
                System.out.println("Elija uno de los siguientes prestamos según ISBN: ");
                for (Prestamo aux : prestamos) {
                    System.out.println(aux.toString());
                }
                do {
                    opcion = leer.nextInt();
                    if (opcion > prestamos.size() || opcion < 0) {
                        System.err.println("Opcion inválida. intentelo nuevamente.");
                    }
                    p = prestamos.get(opcion - 1);
                } while (opcion > prestamos.size() || opcion < 0);
                return p;
            }
        } catch (Exception e) {
            System.out.println("Error al elegir Prestamo.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void mostrarPrestamos() {
        try {
            List<Prestamo> prestamos = dao.listarPrestamos();
            if (prestamos.isEmpty()) {
                System.out.println("Lista de prestamos vacia. ");
            } else {
                for (Prestamo aux : prestamos) {
                    System.out.println(aux.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar prestamos.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorID() {
        try {
            System.out.println("Ingrese el id del prestamo que desea buscar");
            int id = leer.nextInt();
            Prestamo p = dao.buscarPrestamoPorId(id);
            if (p == null) {
                System.out.println("No existe el prestamo que desea buscar.");
            } else {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar prestamo.");
            System.err.println(e.getMessage());
        }
    }

    public void modificarPrestamo() throws Exception {
        Prestamo aux = new Prestamo();
        System.out.println("¿Qué prestamo desea modificar?");
        aux = this.elegirPrestamo();
        String opcion;
        do {
            System.out.println("¿Qué desea modificar?\n"
                    + "1. Fecha de inicio del prestamo. \n"
                    + "2. Fecha de devolucion. \n"
                    + "3. Libro. \n"
                    + "4. Cliente. \n"
                    + "5. Guardar Cambios. \n"
                    + "6. Salir. ");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese la fecha de inicio: DD/MM/AAAA");
                    int dia, mes, anio;
                    do {
                        System.out.println("Dia: ");
                        dia = leer.nextInt();
                    } while (dia > 31 || dia < 1);
                    do {
                        System.out.println("Mes:");
                        mes = leer.nextInt();
                    } while (mes > 12 || mes < 1);
                    do {
                        System.out.println("Año: ");
                        anio = leer.nextInt();
                    } while (anio > 2100 || anio < 2000);
                    Date fechaInicio = new Date(anio - 1900, mes - 1, dia);
                    aux.setFechaPrestamo(fechaInicio);
                    break;
                case "2":
                    System.out.println("Ingrese la fecha de devolucion: DD/MM/AAAA");
                    int dia2, mes2, anio2;
                    do {
                        System.out.println("Dia: ");
                        dia2 = leer.nextInt();
                    } while (dia2 > 31 || dia2 < 1);
                    do {
                        System.out.println("Mes:");
                        mes2 = leer.nextInt();
                    } while (mes2 > 12 || mes2 < 1);
                    do {
                        System.out.println("Año: ");
                        anio2 = leer.nextInt();
                    } while (anio2 > 2100 || anio2 < 2000);
                    Date fechaDevolucion = new Date(anio2 - 1900, mes2 - 1, dia2);
                    aux.setFechaDevolucion(fechaDevolucion);
                    break;
                case "3":
                    aux.setLibro(sl.elegirLibro());
                    break;
                case "4":
                    aux.setCliente(sc.elegirCliente());
                    break;
                case "5":
                    dao.editar(aux);
                    System.out.println("Se guardaron los cambios.");
                    break;
                case "6":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intentelo nuevamente.");
                    break;
            }
        } while (!opcion.equals("6"));
    }
//no se utiliza comunmente en base de datos, es mas conveniente dar de baja

    public void eliminarPrestamo() {
        System.out.println("¿Qué prestamo desea eliminar?");
        Prestamo aux = this.elegirPrestamo();
        dao.eliminar(aux);
    }
}
