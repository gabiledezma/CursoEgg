package LibreriaWeb.DonPepe.servicios;

import LibreriaWeb.DonPepe.entidades.Libro;
import LibreriaWeb.DonPepe.repositorios.RepositorioLibro;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioLibro {

    @Autowired
    private RepositorioLibro rl;
    @Autowired
    private ServicioAutor sa;
    @Autowired
    private ServicioEditorial se;

    @Transactional
    public Libro guardar(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, String autor, String editorial) throws Exception {
        this.validarDatos(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes);
        Libro l = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes);
        l.setAlta(true);
        l.setAutor(sa.buscarAutor(autor));
        l.setEditorial(se.buscarEditorial(editorial));
        return rl.save(l);
    }

    public void validarDatos(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes) throws Exception {
        if (isbn == null || isbn <= 0) {
            throw new Exception("Error en el isbn");
        }
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new Exception("Error en el titulo");
        }
        if (anio == null) {
            throw new Exception("Error en el año");
        }
        if (ejemplares == null || ejemplares < 0 || ejemplares != (ejemplaresPrestados + ejemplaresRestantes)) {
            throw new Exception("Error en la cantidad de ejemplares");
        }
        if (ejemplaresPrestados == null || ejemplaresPrestados < 0 || ejemplaresPrestados > ejemplares) {
            throw new Exception("Error en la cantidad de ejemplares prestados");
        }
        if (ejemplaresRestantes == null || ejemplaresRestantes < 0 || ejemplaresRestantes > ejemplares) {
            throw new Exception("Error en la cantidad de ejemplares restantes");
        }
    }

    @Transactional
    public Libro baja(String id) {
        Optional<Libro> aux = rl.findById(id);
        if (aux.isPresent()) {
            Libro l = aux.get();
            l.setAlta(false);
            return rl.save(l);
        } else {
            return null;
        }
    }

    @Transactional
    public Libro alta(String id) {
        Optional<Libro> aux = rl.findById(id);
        if (aux.isPresent()) {
            Libro l = aux.get();
            l.setAlta(true);
            return rl.save(l);
        } else {
            return null;
        }
    }

    @Transactional
    public List<Libro> listarTodos() {
        return rl.findAll();
    }

    @Transactional
    public Libro modificar(String id, Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, String autor, String editorial) throws Exception {
        Optional<Libro> aux = rl.findById(id);
        if (aux.isPresent()) {
            this.validarDatos(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes);
            Libro l = aux.get();
            l.setIsbn(isbn);
            l.setTitulo(titulo);
            l.setAnio(anio);
            l.setEjemplares(ejemplares);
            l.setEjemplaresPrestados(ejemplaresPrestados);
            l.setEjemplaresRestantes(ejemplaresRestantes);
            l.setAutor(sa.buscarAutor(autor));
            l.setEditorial(se.buscarEditorial(editorial));
            l.setAlta(true);
            return rl.save(l);
        } else {
            return null;
        }
    }

    @Transactional
    public Libro getOne(String id) {
        return rl.getOne(id);
    }
}
