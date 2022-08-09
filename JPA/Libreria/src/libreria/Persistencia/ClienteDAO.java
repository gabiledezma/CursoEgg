package libreria.Persistencia;

import java.util.List;
import libreria.Entidades.Cliente;

public class ClienteDAO extends DAO {

    public Cliente buscarClientePorId(Integer id) throws Exception {
        conectar();
        Cliente prestamo = em.find(Cliente.class, id);
        desconectar();
        return prestamo;
    }

    public void guardar(Cliente cliente) {
        conectar();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        desconectar();
    }

    public void editar(Cliente cliente) {
        conectar();
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        desconectar();
    }

    public void eliminar(Cliente cliente) {
        conectar();
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
        desconectar();
    }

    public List<Cliente> listarClientes() {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c").getResultList();
        desconectar();
        return clientes;
    }
}
