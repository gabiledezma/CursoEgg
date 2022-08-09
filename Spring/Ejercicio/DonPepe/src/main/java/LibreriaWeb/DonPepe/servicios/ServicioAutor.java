package LibreriaWeb.DonPepe.servicios;

import LibreriaWeb.DonPepe.entidades.Autor;
import LibreriaWeb.DonPepe.repositorios.RepositorioAutor;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioAutor {

    @Autowired
    private RepositorioAutor ra;

    @Transactional
    public Autor guardar(String nombre) throws Exception {
        this.validarDatos(nombre);
        Autor a = new Autor(nombre);
        a.setAlta(true);
        return ra.save(a);
    }

    public void validarDatos(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("Error en el nombre");
        }
    }

    @Transactional
    public Autor modificar(String id, String nombre) throws Exception {
        Optional<Autor> aux = ra.findById(id);
        if (aux.isPresent()) {
            this.validarDatos(nombre);
            Autor a = aux.get();
            a.setNombre(nombre);
            a.setAlta(true);
            return ra.save(a);
        } else {
            return null;
        }
    }

    @Transactional
    public Autor baja(String id) {
        Optional<Autor> aux = ra.findById(id);
        if (aux.isPresent()) {
            Autor a = aux.get();
            a.setAlta(false);
            return ra.save(a);
        } else {
            return null;
        }
    }

    public Autor alta(String id) {
        Optional<Autor> aux = ra.findById(id);
        if (aux.isPresent()) {
            Autor a = aux.get();
            a.setAlta(true);
            return ra.save(a);
        } else {
            return null;
        }
    }

    @Transactional
    public List<Autor> listarTodos() {
        return ra.findAll();
    }

    @Transactional
    public Autor elegir() throws Exception {
        List<Autor> autores = this.listarTodos();
        if (autores.isEmpty()) {
            throw new Exception("lista de autores vacia");
            //agregar autor
        } else {
            //mostrar lista de autores y que ingrese el nombre de alguno
            Autor aux = ra.buscarPorNombre("autor");
            return aux;
        }
    }

    @Transactional
    public Autor getOne(String id) {
        return ra.getOne(id);
    }

    @Transactional
    public Autor buscarAutor(String autor) {
        try {
            return ra.buscarPorNombre(autor);
        } catch (Exception e) {
            return null;
        }
    }
}
