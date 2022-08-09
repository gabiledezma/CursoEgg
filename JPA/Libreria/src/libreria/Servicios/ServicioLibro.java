package libreria.Servicios;

import java.util.List;
import java.util.Scanner;
import libreria.Entidades.Libro;
import libreria.Persistencia.LibroDAO;

public class ServicioLibro {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private LibroDAO dao = new LibroDAO();
    private ServicioAutor sa = new ServicioAutor();
    private ServicioEditorial se = new ServicioEditorial();

    public Libro crearLibro() throws Exception {
        try {
            Libro l = new Libro();
            System.out.println("Creando libro...");
            System.out.println("Ingrese el ISBN: ");
            l.setIsbn(leer.nextLong());
            System.out.println("Ingrese el titulo: ");
            l.setTitulo(leer.next());
            System.out.println("Ingrese el año: ");
            l.setAnio(leer.nextInt());
            System.out.println("Ingrese la cantidad de ejemplares: ");
            l.setEjemplares(leer.nextInt());
            do {
                System.out.println("Ingrese la cantidad de ejemplares prestados: ");
                l.setEjemplaresPrestados(leer.nextInt());
                if (l.getEjemplares() < l.getEjemplaresPrestados()) {
                    System.out.println("No puede prestar más de lo que tiene.");
                }
            } while (l.getEjemplares() < l.getEjemplaresPrestados());
            l.setEjemplaresRestantes(l.getEjemplares() - l.getEjemplaresPrestados());
            l.setAlta(true);
            l.setAutor(sa.elegirAutor());
            l.setEditorial(se.elegirEditorial());
            return l;
        } catch (Exception e) {
            System.out.println("Error al crear Libro.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void guardarLibro() throws Exception {
        try {
            Libro l = crearLibro();
            dao.guardar(l);
        } catch (Exception e) {
            System.out.println("Error al guardar Libro.");
            System.err.println(e.getMessage());
        }
    }

    public Libro elegirLibro() {
        try {
            int opcion, contador = 0;
            List<Libro> libros = dao.listarLibros();
            for (Libro libro : libros) {
                if (libro.getAlta() == false) {
                    contador++;
                }
            }
            if (libros.isEmpty() || libros.size() == contador) {
                System.out.println("Lista de libros vacia. ");
                return null;
            } else {
                Libro l = new Libro();
                System.out.println("Elija uno de los siguientes libros según ISBN: ");
                for (Libro aux : libros) {
                    if (aux.getAlta() == true) {
                        System.out.println(aux.toString());
                    }
                }
                do {
                    opcion = leer.nextInt();
                    if (opcion > libros.size() || opcion < 0) {
                        System.err.println("Opcion inválida. intentelo nuevamente.");
                    }
                    l = libros.get(opcion - 1);
                    if (l.getAlta() == false) {
                        System.err.println("libro dado de baja, intentelo nuevamente");
                    }

                } while (opcion > libros.size() || opcion < 0 || l.getAlta() == false);

                return l;
            }
        } catch (Exception e) {
            System.out.println("Error al elegir Libro.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void mostrarLibros() {
        try {
            int contador = 0;
            List<Libro> libros = dao.listarLibros();
            for (Libro libro : libros) {
                if (libro.getAlta() == false) {
                    contador++;
                }
            }
            if (libros.isEmpty() || libros.size() == contador) {
                System.out.println("Lista de libros vacia. ");
            } else {
                for (Libro aux : libros) {
                    if (aux.getAlta() == true) {
                        System.out.println(aux.toString());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar libros.");
            System.err.println(e.getMessage());
        }
    }

    public void darDeAltaLibro() {
        try {
            Libro l = this.elegirLibro();
            l.setAlta(true);
        } catch (Exception e) {
            System.out.println("Error al dar de alta el Libro.");
            System.err.println(e.getMessage());
        }
    }

    public void darDeBajaLibro() {
        try {
            Libro l = this.elegirLibro();
            l.setAlta(false);
        } catch (Exception e) {
            System.out.println("Error al dar de baja el Libro.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorISBN() {
        try {
            Libro l = new Libro();
            do {
                System.out.println("Ingrese el isbn del libro que desea buscar");
                long isbn = leer.nextLong();
                l = dao.buscarLibroPorISBN(isbn);
                if (l.getAlta() == false) {
                    System.out.println("Libro dado de baja, vuelva a intentarlo");
                }
            } while (l.getAlta() == false);
            if (l == null) {
                System.out.println("No existe el libro que desea buscar.");
            } else {
                System.out.println(l);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar libro.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorNombre() {
        try {
            int contador = 0;
            List<Libro> libros = dao.listarLibros();
            for (Libro libro : libros) {
                if (libro.getAlta() == false) {
                    contador++;
                }
            }
            Libro l = new Libro();
            if (libros.isEmpty() || libros.size() == contador) {
                System.out.println("Lista de libros vacia. ");
            } else {
                for (Libro aux : libros) {
                    System.out.println("Ingrese el nombre del titulo del libro: ");
                    String titulo = leer.next();
                    if (aux.getTitulo().equals(titulo)) {
                        l = aux;
                    }
                }
                if (l.getAlta() == true) {
                    System.out.println(l);
                } else {
                    System.out.println("Libro dado de baja");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar libro.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorAutor() {
        try {
            int contador = 0;
            List<Libro> libros = dao.listarLibros();
            for (Libro libro : libros) {
                if (libro.getAlta() == false) {
                    contador++;
                }
            }
            Libro l = new Libro();
            if (libros.isEmpty() || libros.size() == contador) {
                System.out.println("Lista de libros vacia. ");
            } else {
                for (Libro aux : libros) {
                    System.out.println("Ingrese el nombre del autor del libro: ");
                    String nombre = leer.next();
                    if (aux.getAutor().getNombre().equals(nombre)) {
                        l = aux;
                    }
                }
                if (l.getAlta() == true) {
                    System.out.println(l);
                } else {
                    System.out.println("Libro dado de baja");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar libro.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorEditorial() {
        try {
            int contador = 0;
            List<Libro> libros = dao.listarLibros();
            for (Libro libro : libros) {
                if (libro.getAlta() == false) {
                    contador++;
                }
            }
            Libro l = new Libro();
            if (libros.isEmpty() || libros.size() == contador) {
                System.out.println("Lista de libros vacia. ");
            } else {
                for (Libro aux : libros) {
                    System.out.println("Ingrese el nombre del editorial del libro: ");
                    String nombre = leer.next();
                    if (aux.getEditorial().getNombre().equals(nombre)) {
                        l = aux;
                    }
                }
                if (l.getAlta() == true) {
                    System.out.println(l);
                } else {
                    System.out.println("Libro dado de baja");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar libro.");
            System.err.println(e.getMessage());
        }
    }

    public void modificarLibro() throws Exception {
        Libro aux = new Libro();
        do {
            System.out.println("¿Qué libro desea modificar?");
            aux = this.elegirLibro();
            if (aux.getAlta() == false) {
                System.out.println("el libro ya fue dado de baja, no puede ser modificado.");
            }
        } while (aux.getAlta() == false);
        String opcion = "";
        do {
            System.out.println("¿Qué desea modificar?\n"
                    + "1. ISBN. \n"
                    + "2. Titulo. \n"
                    + "3. Año. \n"
                    + "4. Ejemplares. \n"
                    + "5. Ejemplares Prestados. \n"
                    + "6. Ejemplares Restantes. \n"
                    + "7. Autor. \n"
                    + "8. Editorial. \n"
                    + "9. Guardar Cambios. \n"
                    + "0. Salir. ");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    Libro laux;
                    do {
                        long isbn = leer.nextLong();
                        laux = dao.buscarLibroPorISBN(isbn);
                        if (laux == null) {
                            aux.setIsbn(isbn);
                        } else {
                            System.out.println("ISBN ya ocupado, intentelo nuevamente");
                        }
                    } while (laux != null);
                    break;
                case "2":
                    aux.setTitulo(leer.next());
                    break;
                case "3":
                    aux.setAnio(leer.nextInt());
                    break;
                case "4":
                    int ejemplares = leer.nextInt();
                    aux.setEjemplares(ejemplares);
                    do {
                        System.out.println("Ingrese la cantidad de ejemplares prestados: ");
                        aux.setEjemplaresPrestados(leer.nextInt());
                        if (aux.getEjemplares() < aux.getEjemplaresPrestados()) {
                            System.out.println("No puede prestar más de lo que tiene.");
                        }
                    } while (aux.getEjemplares() < aux.getEjemplaresPrestados());
                    aux.setEjemplaresRestantes(aux.getEjemplares() - aux.getEjemplaresPrestados());
                    break;
                case "5":
                    do {
                        System.out.println("Ingrese la cantidad de ejemplares prestados: ");
                        aux.setEjemplaresPrestados(leer.nextInt());
                        if (aux.getEjemplares() < aux.getEjemplaresPrestados()) {
                            System.out.println("No puede prestar más de lo que tiene.");
                        }
                    } while (aux.getEjemplares() < aux.getEjemplaresPrestados());
                    aux.setEjemplaresRestantes(aux.getEjemplares() - aux.getEjemplaresPrestados());
                    break;
                case "6":
                    do {
                        System.out.println("Ingrese la cantidad de ejemplares restantes: ");
                        aux.setEjemplaresRestantes(leer.nextInt());
                        if (aux.getEjemplaresRestantes() > aux.getEjemplares()) {
                            System.out.println("No puede tener más ejemplares que los que creo.");
                        }
                    } while (aux.getEjemplaresRestantes() > aux.getEjemplares());
                    aux.setEjemplaresPrestados(aux.getEjemplares() - aux.getEjemplaresRestantes());
                    break;
                case "7":
                    sa.elegirAutor();
                    break;
                case "8":
                    se.elegirEditorial();
                    break;
                case "9":
                    dao.editar(aux);
                    System.out.println("Se guardaron los cambios.");
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intentelo nuevamente.");
                    break;
            }
        } while (!opcion.equals("9"));
    }
//no se utiliza comunmente en base de datos, es mas conveniente dar de baja

    public void eliminarLibro() {
        System.out.println("¿Qué libro desea eliminar?");
        Libro aux = this.elegirLibro();
        dao.eliminar(aux);
    }

}
