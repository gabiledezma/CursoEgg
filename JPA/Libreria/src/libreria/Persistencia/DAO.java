package libreria.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DAO {

//    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("LibreriaPU");
//    protected EntityManager em = EMF.createEntityManager();
    
    protected EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

    protected void conectar() {
        if (!em.isOpen()) {
            em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        }
    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
    
}
