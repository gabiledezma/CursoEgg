package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class ServicioFabricante {

    private FabricanteDAO dao = new FabricanteDAO();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Fabricante crearFabricante() {
        Fabricante f = new Fabricante();
        System.out.println("Creando Fabricante...");
        System.out.println("Ingrese el nombre: ");
        f.setNombre(leer.next());
        return f;
    }

    public void insertarFabricante(String nombre) throws Exception {

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (buscarFabricantePorNombre(nombre) != null) {
                throw new Exception("Ya existe un fabricante con el nombre indicado " + nombre);
            }
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarNombreFabricante(Integer codigo, String nombreActual, String nuevoNombre) throws Exception {
        try {
            if (codigo == null || codigo == 0) {
                throw new Exception("Debe indicar el fabricante");
            }
            if (nombreActual == null || nombreActual.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre actual");
            }
            if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre nuevo");
            }
            Fabricante fabricante = buscarFabricantePorCodigo(codigo);
            if (!fabricante.getNombre().equals(nombreActual)) {
                throw new Exception("El nombre actual no es el registrado en el sistema para el codigo indicado");
            }
            fabricante.setNombre(nuevoNombre);
            dao.modificarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFabricante(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            dao.eliminarFabricante(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            Fabricante fabricante = dao.buscarFabricantePorNombre(nombre);
            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo");
            }
            Fabricante fabricante = dao.buscarFabricantePorCodigo(codigo);
            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Fabricante> listarFabricante() throws Exception {
        try {
            Collection<Fabricante> fabricantes = dao.listarFabricantes();
            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirFabricantes() throws Exception {

        try {
            Collection<Fabricante> fabricantes = listarFabricante();
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para imprimir");
            } else {
                for (Fabricante f : fabricantes) {
                    System.out.println(f);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
