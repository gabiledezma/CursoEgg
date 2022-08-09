package libreria.Persistencia;

import java.util.List;
import libreria.Entidades.Prestamo;

public class PrestamoDAO extends DAO {

    public Prestamo buscarPrestamoPorId(Integer id) throws Exception {
        conectar();
        Prestamo prestamo = em.find(Prestamo.class, id);
        desconectar();
        return prestamo;
    }

    public void guardar(Prestamo prestamo) {
        conectar();
        em.getTransaction().begin();
        em.persist(prestamo);
        em.getTransaction().commit();
        desconectar();
    }

    public void editar(Prestamo prestamo) {
        conectar();
        em.getTransaction().begin();
        em.merge(prestamo);
        em.getTransaction().commit();
        desconectar();
    }

    public void eliminar(Prestamo prestamo) {
        conectar();
        em.getTransaction().begin();
        em.remove(prestamo);
        em.getTransaction().commit();
        desconectar();
    }

    public List<Prestamo> listarPrestamos() {
        conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p").getResultList();
        desconectar();
        return prestamos;
    }
}
