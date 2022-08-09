package com.ejemplo.spring.repositorios;

import com.ejemplo.spring.entidades.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioMascota extends JpaRepository<Mascota, String> {

    @Query("SELECT c FROM Mascota c WHERE c.usuario.id = :id")
    public Mascota buscarMascotaPorUsuario(@Param("id") String id);

    @Query("SELECT c FROM Mascota c WHERE c.nombre = :nombre")
    public Mascota buscarPorNombre(@Param("nombre") String nombre);
}
