package libreria;

import java.util.Scanner;
import libreria.Servicios.ServicioAutor;
import libreria.Servicios.ServicioEditorial;
import libreria.Servicios.ServicioLibro;

public class Libreria {

    public static void main(String[] args) throws Exception {
        /*
            agregar en main prestamos y clientes con sus respectivos metodos
            agregar condicion de que no se pueden prestar libros que tengan todos prestados
            agregar modificaciones para el cliente
         */
        ServicioAutor sa = new ServicioAutor();
        ServicioEditorial se = new ServicioEditorial();
        ServicioLibro sl = new ServicioLibro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opcion, opcionl, opciona, opcione;
        do {
            System.out.println("---MENÚ---\n"
                    + "1. Libro. \n"
                    + "2. Autor. \n"
                    + "3. Editorial. \n"
                    + "4. Salir. ");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    do {
                        System.out.println("---Libro---\n"
                                + "1. Agregar. \n"
                                + "2. Modificar. \n"
                                + "3. Eliminar. \n"
                                + "4. Ver Todos. \n"
                                + "5. Buscar por ISBN. \n"
                                + "6. Buscar por Titulo. \n"
                                + "7. Buscar por Nombre de Autor. \n"
                                + "8. Buscar por Nombre de Editorial. \n"
                                + "9. Salir. ");
                        opcionl = leer.next();
                        switch (opcionl) {
                            case "1":
                                sl.guardarLibro();
                                break;
                            case "2":
                                sl.modificarLibro();
                                break;
                            case "3":
                                sl.darDeBajaLibro();
                                break;
                            case "4":
                                sl.mostrarLibros();
                                break;
                            case "5":
                                sl.buscarPorISBN();
                                break;
                            case "6":
                                sl.buscarPorNombre();
                                break;
                            case "7":
                                sl.buscarPorAutor();
                                break;
                            case "8":
                                sl.buscarPorEditorial();
                                break;
                            case "9":
                                System.out.println("Volviendo al menú anterior...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta, intentelo nuevamente.");
                                break;
                        }
                    } while (!opcionl.equals("9"));
                    break;
                case "2":
                    do {
                        System.out.println("---Autor---\n"
                                + "1. Agregar. \n"
                                + "2. Modificar. \n"
                                + "3. Eliminar. \n"
                                + "4. Ver Todos. \n"
                                + "5. Buscar por ID. \n"
                                + "6. Buscar por Nombre. \n"
                                + "7. Salir. ");
                        opciona = leer.next();
                        switch (opciona) {
                            case "1":
                                sa.guardarAutor();
                                break;
                            case "2":
                                sa.modificarAutor();
                                break;
                            case "3":
                                sa.darDeBajaAutor();
                                break;
                            case "4":
                                sa.mostrarAutores();
                                break;
                            case "5":
                                sa.buscarPorID();
                                break;
                            case "6":
                                sa.buscarPorNombre();
                                break;
                            case "7":
                                System.out.println("Volviendo al menú anterior...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta, intentelo nuevamente.");
                                break;
                        }
                    } while (!opciona.equals("7"));
                    break;
                case "3":
                    do {
                        System.out.println("---Editorial---\n"
                                + "1. Agregar. \n"
                                + "2. Modificar. \n"
                                + "3. Eliminar. \n"
                                + "4. Ver Todos. \n"
                                + "5. Buscar por ID. \n"
                                + "6. Buscar por Nombre. \n"
                                + "7. Salir. ");
                        opcione = leer.next();
                        switch (opcione) {
                            case "1":
                                se.guardarEditorial();
                                break;
                            case "2":
                                se.modificarEditorial();
                                break;
                            case "3":
                                se.darDeBajaEditorial();
                                break;
                            case "4":
                                se.mostrarEditoriales();
                                break;
                            case "5":
                                se.buscarPorID();
                                break;
                            case "6":
                                se.buscarPorNombre();
                                break;
                            case "7":
                                System.out.println("Volviendo al menú anterior...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta, intentelo nuevamente.");
                                break;
                        }
                    } while (!opcione.equals("7"));
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intentelo nuevamente.");
                    break;

            }
        } while (!opcion.equals("4"));

    }

}
