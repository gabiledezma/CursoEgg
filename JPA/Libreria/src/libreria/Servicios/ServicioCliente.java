package libreria.Servicios;

import java.util.List;
import java.util.Scanner;
import libreria.Entidades.Cliente;
import libreria.Persistencia.ClienteDAO;

public class ServicioCliente {

    /*
    private Integer id;
    
    private Long documento;
    
    private String nombre;
  
    private String apellido;
   
    private String telefono;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ClienteDAO dao = new ClienteDAO();

    public Cliente crearCliente() {
        try {
            Cliente c = new Cliente();
            System.out.println("Creando cliente...");
            do {
                System.out.println("Ingrese el documento: ");
                c.setDocumento(leer.nextLong());
                if (c.getDocumento() == null) {
                    System.err.println("Debe ingresar un documento");
                }
            } while (c.getDocumento() == null);
            do {
                System.out.println("Ingrese el nombre: ");
                c.setNombre(leer.next());
                if (c.getNombre() == null || c.getNombre().trim().isEmpty()) {
                    System.err.println("Debe ingresar un nombre");
                }
            } while (c.getNombre() == null || c.getNombre().trim().isEmpty());
            do {
                System.out.println("Ingrese el apellido: ");
                c.setApellido(leer.next());
                if (c.getApellido() == null || c.getApellido().trim().isEmpty()) {
                    System.err.println("Debe ingresar un apellido");
                }
            } while (c.getApellido() == null || c.getApellido().trim().isEmpty());
            do {
                System.out.println("Ingrese el telefono: ");
                c.setTelefono(leer.next());
                if (c.getTelefono() == null || c.getTelefono().trim().isEmpty()) {
                    System.err.println("Debe ingresar un telefono");
                }
            } while (c.getTelefono() == null || c.getTelefono().trim().isEmpty());
            return c;
        } catch (Exception e) {
            System.out.println("Error al crear Cliente.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void guardarCliente() {
        try {
            Cliente c = crearCliente();
            if (c.getNombre().trim().isEmpty() || c.getNombre() == null) {
                throw new Exception("Debe indicar el nombre");
            }
            if (c.getApellido().trim().isEmpty() || c.getApellido() == null) {
                throw new Exception("Debe indicar el apellido");
            }
            if (c.getTelefono().trim().isEmpty() || c.getTelefono() == null) {
                throw new Exception("Debe indicar el telefono");
            }
            if (c.getDocumento() == null || c.getDocumento() == 0) {
                throw new Exception("Debe indicar el documento");
            }
            dao.guardar(c);
        } catch (Exception e) {
            System.out.println("Error al guardar Cliente.");
            System.err.println(e.getMessage());
        }
    }

    public void guardarCliente(Cliente c) {
        try {
            if (c.getNombre().trim().isEmpty() || c.getNombre() == null) {
                throw new Exception("Debe indicar el nombre");
            }
            if (c.getApellido().trim().isEmpty() || c.getApellido() == null) {
                throw new Exception("Debe indicar el apellido");
            }
            if (c.getTelefono().trim().isEmpty() || c.getTelefono() == null) {
                throw new Exception("Debe indicar el telefono");
            }
            if (c.getDocumento() == null || c.getDocumento() == 0) {
                throw new Exception("Debe indicar el documento");
            }
            dao.guardar(c);
        } catch (Exception e) {
            System.out.println("Error al guardar Cliente.");
            System.err.println(e.getMessage());
        }
    }

    public Cliente elegirCliente() {
        try {
            int opcion;
            List<Cliente> clientes = dao.listarClientes();
            if (clientes.isEmpty()) {
                System.out.println("Lista de clientes vacia. ");
                Cliente c = this.crearCliente();
                dao.guardar(c);
                return c;
            } else {
                Cliente c = new Cliente();
                System.out.println("Elija uno de los siguientes clientes según ID: ");
                for (Cliente aux : clientes) {
                    System.out.println(aux.toString());
                }
                do {
                    opcion = leer.nextInt();
                    if (opcion > clientes.size() || opcion < 0) {
                        System.err.println("Opcion inválida. intentelo nuevamente.");
                    }
                    c = clientes.get(opcion - 1);
                } while (opcion > clientes.size() || opcion < 0);
                return c;
            }
        } catch (Exception e) {
            System.out.println("Error al elegir Cliente.");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void mostrarClientes() {
        try {
            List<Cliente> clientes = dao.listarClientes();
            if (clientes.isEmpty()) {
                System.out.println("Lista de clientes vacia. ");
            } else {
                for (Cliente aux : clientes) {
                    System.out.println(aux.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar clientes.");
            System.err.println(e.getMessage());
        }
    }

    public void buscarPorID() {
        try {
            System.out.println("Ingrese el id del autor que desea buscar");
            int id = leer.nextInt();
            Cliente c = dao.buscarClientePorId(id);
            if (c == null) {
                System.out.println("No existe el autor que desea buscar.");
            } else {
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar cliente.");
            System.err.println(e.getMessage());
        }
    }

    

    public void modificarCliente() {
        System.out.println("¿Qué autor desea modificar?");
        Cliente aux = this.elegirCliente();
        String opcion;
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
    public void eliminarCliente() {
        System.out.println("¿Qué cliente desea eliminar?");
        Cliente aux = this.elegirCliente();
        dao.eliminar(aux);
    }

    
}
