package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO Producto ( nombre,  precio,  codigo_fabricante )"
                    + "VALUES ( '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            System.out.println("Error al crear el producto");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE Producto SET "
                    + "precio = '" + producto.getPrecio() + "' WHERE nombre = '" + producto.getNombre() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(String nombre) throws Exception {
        try {
            String sql = "DELETE FROM Producto WHERE nombre = '" + nombre + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM Producto "
                    + " WHERE nombre = '" + nombre + "'";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(Integer codigo) throws Exception {
        try {
            String sql = "SELECT * FROM Producto "
                    + " WHERE codigo = '" + codigo + "'";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Producto buscarProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT * FROM Producto "
                    + "ORDER BY precio LIMIT 1";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    /*
    8. Editar un producto con datos a elección.
     */
    public void editarNombre(String nombreActual, String nuevoNombre) throws Exception {
        try {
            if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre que desea agregar");
            }
            String sql = "UPDATE Producto SET "
                    + "nombre = '" + nuevoNombre + "' WHERE nombre LIKE '%" + nombreActual + "%'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void editarCodigo(String nombreActual, Integer nuevoCodigo) throws Exception {
        try {
            if (nuevoCodigo == null || nuevoCodigo == 0) {
                throw new Exception("Debe indicar el codigo que desea agregar");
            }
            String sql = "UPDATE Producto SET "
                    + "codigo = " + nuevoCodigo + " WHERE nombre LIKE '%" + nombreActual + "%'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void editarCodigoFab(String nombreActual, Integer nuevoCodigoFab) throws Exception {
        try {
            if (nuevoCodigoFab == null || nuevoCodigoFab == 0) {
                throw new Exception("Debe indicar el codigo que desea agregar");
            }
            String sql = "UPDATE Producto SET "
                    + "codigo_fabricante = " + nuevoCodigoFab + " WHERE nombre LIKE '%" + nombreActual + "%'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void editarPrecio(String nombreActual, Double nuevoPrecio) throws Exception {
        try {
            if (nuevoPrecio == null || nuevoPrecio == 0) {
                throw new Exception("Debe indicar el codigo que desea agregar");
            }
            String sql = "UPDATE Producto SET "
                    + "precio = " + nuevoPrecio + " WHERE nombre LIKE '%" + nombreActual + "%'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
