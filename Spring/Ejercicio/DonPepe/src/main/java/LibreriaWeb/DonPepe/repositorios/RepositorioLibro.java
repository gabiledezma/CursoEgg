package LibreriaWeb.DonPepe.repositorios;

import LibreriaWeb.DonPepe.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLibro extends JpaRepository<Libro, String> {

    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    public Libro buscarPorTitulo(@Param("titulo") String titulo);

    @Query("SELECT l FROM Libro l WHERE l.isbn = :isbn")
    public Libro buscarPorIsbn(@Param("isbn") String isbn);

    @Query("SELECT l FROM Libro l WHERE l.autor.id = :id")
    public Libro buscarLibroPorAutor(@Param("id") String id);

    @Query("SELECT l FROM Libro l WHERE l.editorial.id = :id")
    public Libro buscarLibroPorEditorial(@Param("id") String id);

}
