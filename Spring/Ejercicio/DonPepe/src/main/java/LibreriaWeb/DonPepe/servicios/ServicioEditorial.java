package LibreriaWeb.DonPepe.servicios;

import LibreriaWeb.DonPepe.entidades.Editorial;
import LibreriaWeb.DonPepe.repositorios.RepositorioEditorial;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEditorial {

    @Autowired
    private RepositorioEditorial re;

    @Transactional
    public Editorial guardar(String nombre) throws Exception {
        this.validarDatos(nombre);
        Editorial e = new Editorial(nombre);
        e.setAlta(true);
        return re.save(e);
    }

    public void validarDatos(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("Error en el nombre");
        }
    }

    @Transactional
    public Editorial modificar(String id, String nombre) throws Exception {
        Optional<Editorial> aux = re.findById(id);
        if (aux.isPresent()) {
            this.validarDatos(nombre);
            Editorial e = aux.get();
            e.setNombre(nombre);
            e.setAlta(true);
            return re.save(e);
        } else {
            return null;
        }
    }

    @Transactional
    public Editorial baja(String id) {
        Optional<Editorial> aux = re.findById(id);
        if (aux.isPresent()) {
            Editorial e = aux.get();
            e.setAlta(false);
            return re.save(e);
        } else {
            return null;
        }
    }

    @Transactional
    public Editorial alta(String id) {
        Optional<Editorial> aux = re.findById(id);
        if (aux.isPresent()) {
            Editorial e = aux.get();
            e.setAlta(true);
            return re.save(e);
        } else {
            return null;
        }
    }

    @Transactional
    public List<Editorial> listarTodos() {
        return re.findAll();
    }

    @Transactional
    public Editorial elegir() throws Exception {
        List<Editorial> editoriales = this.listarTodos();
        if (editoriales.isEmpty()) {
            throw new Exception("lista de editoriales vacia");
            //agregar editorial
        } else {
            //mostrar lista de editoriales y que ingrese el nombre de alguno
            Editorial aux = re.buscarPorNombre("editorial");
            return aux;
        }
    }

    @Transactional
    public Editorial getOne(String id) {
        return re.getOne(id);
    }

    @Transactional
    public Editorial buscarEditorial(String editorial) {
        try {
            return re.buscarPorNombre(editorial);
        } catch (Exception e) {
            return null;
        }
    }
}
