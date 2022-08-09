package libreria.Servicios;

import java.util.List;
import java.util.Scanner;
import libreria.Entidades.Autor;
import libreria.Persistencia.AutorDAO;

public class ServicioAutor {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private AutorDAO dao = new AutorDAO();

    public Autor crearAutor() {
        try {
            Autor a = new Autor();
            System.out.println("Creando autor...");
            do {
                System.out.println("Ingrese el nombre: ");
                a.setNombre(leer.next());
                if (a.getNombre() == null || a.getNombre().trim().isEmpty()) {
                    System.err.println("Debe ingresar un nombre");
                }
            } while (a.getNombre() == null || a.getNombre().trim().isEmpty());
            a.setAlta(true);
            return a;
        } catch (Exception e) {
            System.out.println("Error al crear Autor.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void guardarAutor() {
        try {
            Autor a = crearAutor();
            if (a.getNombre().trim().isEmpty() || a.getNombre() == null) {
                throw new Exception("Debe indicar el nombre");
            }
            if (a.getAlta() == null) {
                throw new Exception("Debe dar de alta al autor");
            }
            dao.guardar(a);
        } catch (Exception e) {
            System.out.println("Error al guardar Autor.");
            System.err.println(e.getMessage());
        }
    }

    public void guardarAutor(Autor a) {
        try {
            if (a.getNombre().trim().isEmpty() || a.getNombre() == null) {
                throw new Exception("Debe indicar el nombre");
            }
            if (a.getAlta() == null) {
                throw new Exception("Debe dar de alta al autor");
            }
            dao.guardar(a);
        } catch (Exception e) {
            System.out.println("Error al guardar Autor.");
            System.err.println(e.getMessage());
        }
    }

    public Autor elegirAutor() {
        try {
            int opcion, contador = 0;
            List<Autor> autores = dao.listarAutores();
            for (Autor autor : autores) {
                if (autor.getAlta() == false) {
                    contador++;
                }
            }
            if (autores.isEmpty() || autores.size() == contador) {
                System.out.println("Lista de autores vacia. ");
                Autor a = this.crearAutor();
                dao.guardar(a);
                return a;
            } else {
                Autor a = new Autor();
                System.out.println("Elija uno de los siguientes autores según ID: ");
                for (Autor aux : autores) {
                    if (aux.getAlta() == true) {
                        System.out.println(aux.toString());
                    }
                }
                do {
                    opcion = leer.nextInt();
                    if (opcion > autores.size() || opcion < 0) {
                        System.err.println("Opcion inválida. intentelo nuevamente.");
                    }
                    a = autores.get(opcion - 1);
                    if (a.getAlta() == false) {
                        System.err.println("autor dado de baja, intentelo nuevamente");
                    }

                } while (opcion > autores.size() || opcion < 0 || a.getAlta() == false);
                return a;
            }
        } catch (Exception e) {
            System.out.println("Error al elegir Autor.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void mostrarAutores() {
        try {
            int contador = 0;
            List<Autor> autores = dao.listarAutores();
            for (Autor autor : autores) {
                if (autor.getAlta() == false) {
                    contador++;
                }
            }
            if (autores.isEmpty() || autores.size() == contador) {
                System.out.println("Lista de autores vacia. ");
            } else {
                for (Autor aux : autores) {
                    if (aux.getAlta() == true) {
                        System.out.println(aux.toString());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar autores.");
            System.err.println(e.getMessage());
        }
    }

    public void darDeAltaAutor() {
        try {
            Autor a = this.elegirAutor();
            a.setAlta(true);
        } catch (Exception e) {
            System.out.println("Error al dar de alta el Autor.");
            System.err.println(e.getMessage());
        }
    }

    public void darDeBajaAutor() {
        try {
            Autor a = this.elegirAutor();
            a.setAlta(false);
        } catch (Exception e) {
            System.out.println("Error al dar de baja el Autor.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorID() {
        try {
            Autor a = new Autor();
            do {
                System.out.println("Ingrese el id del autor que desea buscar");
                int id = leer.nextInt();
                a = dao.buscarAutorPorId(id);
                if (a.getAlta() == false) {
                    System.out.println("Autor dado de baja, vuelva a intentarlo");
                }
            } while (a.getAlta() == false);
            if (a == null) {
                System.out.println("No existe el autor que desea buscar.");
            } else {
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar autor.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorNombre() {
        try {
            int contador = 0;
            List<Autor> autores = dao.listarAutores();
            for (Autor autor : autores) {
                if (autor.getAlta() == false) {
                    contador++;
                }
            }
            Autor a = new Autor();
            if (autores.isEmpty() || autores.size() == contador) {
                System.out.println("Lista de autores vacia. ");
            } else {
                System.out.println("Ingrese el nombre que desea buscar: ");
                String nombre = leer.next();
                for (Autor aux : autores) {
                    if (aux.getNombre().equals(nombre)) {
                        a = aux;
                    }
                }
                if (a.getAlta() == true) {
                    System.out.println(a);
                } else {
                    System.out.println("Autor dado de baja");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar autor.");
            System.err.println(e.getMessage());
        }

    }

    public void modificarAutor() {
        System.out.println("¿Qué autor desea modificar?");
        Autor aux = this.elegirAutor();
        String opcion = "";
        do {
            System.out.println("¿Qué desea modificar?\n"
                    + "1. Nombre. \n"
                    + "2. Guardar Cambios. \n"
                    + "3. Salir. ");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    aux.setNombre(leer.next());
                    break;
                case "2":
                    dao.editar(aux);
                    System.out.println("Se guardaron los cambios.");
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intentelo nuevamente.");
                    break;
            }
        } while (!opcion.equals("3"));
    }

//no se utiliza comunmente en base de datos, es mas conveniente dar de baja
    public void eliminarAutor() {
        System.out.println("¿Qué autor desea eliminar?");
        Autor aux = this.elegirAutor();
        dao.eliminar(aux);
    }

}
