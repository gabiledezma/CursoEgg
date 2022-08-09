package libreria.Servicios;

import java.util.List;
import java.util.Scanner;
import libreria.Entidades.Editorial;
import libreria.Persistencia.EditorialDAO;

public class ServicioEditorial {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private EditorialDAO dao = new EditorialDAO();

    public Editorial crearEditorial() {
        try {
            Editorial e = new Editorial();
            System.out.println("Creando editorial...");
            do {
                System.out.println("Ingrese el nombre: ");
                e.setNombre(leer.next());
                if (e.getNombre() == null || e.getNombre().trim().isEmpty()) {
                    System.err.println("Debe ingresar un nombre");
                }
            } while (e.getNombre() == null || e.getNombre().trim().isEmpty());
            e.setAlta(true);
            return e;
        } catch (Exception e) {
            System.out.println("Error al crear Editorial.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void guardarEditorial() throws Exception {
        try {
            Editorial e = crearEditorial();
            if (e.getNombre() == null || e.getNombre().trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            dao.guardar(e);
        } catch (Exception e) {
            System.out.println("Error al guardar Editorial.");
            System.err.println(e.getMessage());
        }
    }

    public void guardarEditorial(Editorial e) throws Exception {
        try {
            if (e.getNombre() == null || e.getNombre().trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            dao.guardar(e);
        } catch (Exception ex) {
            System.out.println("Error al guardar Editorial.");
            System.err.println(ex.getMessage());
        }
    }

    public Editorial elegirEditorial() {
        try {
            int opcion = 0, contador = 0;
            List<Editorial> editoriales = dao.listarEditoriales();
            for (Editorial editorial : editoriales) {
                if (editorial.getAlta() == false) {
                    contador++;
                }
            }
            if (editoriales.isEmpty() || editoriales.size() == contador) {
                System.out.println("Lista de editoriales vacia. ");
                Editorial e = this.crearEditorial();
                dao.guardar(e);
                return e;
            } else {
                Editorial e = new Editorial();
                System.out.println("Elija una de los siguientes editoriales según ID: ");
                for (Editorial aux : editoriales) {
                    if (aux.getAlta() == true) {
                        System.out.println(aux.toString());
                    }
                }
                do {
                    opcion = leer.nextInt();
                    if (opcion > editoriales.size() || opcion < 0) {
                        System.err.println("Opcion inválida. intentelo nuevamente.");
                    }
                    e = editoriales.get(opcion - 1);
                    if (e.getAlta() == false) {
                        System.err.println("editorial dado de baja, intentelo nuevamente");
                    }
                } while (opcion > editoriales.size() || opcion < 0 || e.getAlta() == false);
                return e;
            }
        } catch (Exception e) {
            System.out.println("Error al elegir Editorial.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void mostrarEditoriales() {
        try {
            int contador = 0;
            List<Editorial> editoriales = dao.listarEditoriales();
            for (Editorial editorial : editoriales) {
                if (editorial.getAlta() == false) {
                    contador++;
                }
            }
            if (editoriales.isEmpty() || editoriales.size() == contador) {
                System.out.println("Lista de editoriales vacia. ");
            } else {
                for (Editorial aux : editoriales) {
                    if (aux.getAlta() == true) {
                        System.out.println(aux.toString());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar editoriales.");
            System.err.println(e.getMessage());
        }
    }

    public void darDeAltaEditorial() {
        try {
            Editorial e = this.elegirEditorial();
            e.setAlta(true);
        } catch (Exception e) {
            System.out.println("Error al dar de alta el Editorial.");
            System.err.println(e.getMessage());
        }
    }

    public void darDeBajaEditorial() {
        try {
            Editorial e = this.elegirEditorial();
            e.setAlta(false);
        } catch (Exception e) {
            System.out.println("Error al dar de baja el Editorial.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorID() {
        try {
            Editorial e = new Editorial();
            do {
                System.out.println("Ingrese el id del editorial que desea buscar");
                int id = leer.nextInt();
                e = dao.buscarEditorialPorId(id);
                if (e.getAlta() == false) {
                    System.out.println("Editorial dado de baja, vuelva a intentarlo");
                }
            } while (e.getAlta() == false);
            if (e == null) {
                System.out.println("No existe el editorial que desea buscar.");
            } else {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar editorial.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorNombre() {
        try {
            int contador = 0;
            List<Editorial> editoriales = dao.listarEditoriales();
            for (Editorial editorial : editoriales) {
                if (editorial.getAlta() == false) {
                    contador++;
                }
            }
            Editorial e = new Editorial();
            if (editoriales.isEmpty() || editoriales.size() == contador) {
                System.out.println("Lista de editoriales vacia. ");
            } else {
                System.out.println("Ingrese el nombre que desea buscar: ");
                String nombre = leer.next();
                for (Editorial aux : editoriales) {
                    if (aux.getNombre().equals(nombre)) {
                        e = aux;
                    }
                }
                if (e.getAlta() == true) {
                    System.out.println(e);
                } else {
                    System.out.println("Editorial dado de baja");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar editorial.");
            System.err.println(e.getMessage());
        }
    }

    public void modificarEditorial() {
        System.out.println("¿Qué editorial desea modificar?");
        Editorial aux = this.elegirEditorial();
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
    public void eliminarEditorial() {
        System.out.println("¿Qué editorial desea eliminar?");
        Editorial aux = this.elegirEditorial();
        dao.eliminar(aux);
    }

}
