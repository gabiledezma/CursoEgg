package com.perrosv1.app.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.perrosv1.app.entidades.Perro;
import org.springframework.data.repository.query.Param;

@Repository
public interface PerroRepository extends JpaRepository<Perro, String>{

	@Query("SELECT a from Perro a WHERE a.activo = true ")
	public List<Perro> buscarActivos();
        
        @Query("SELECT p FROM Perro p WHERE p.usuario.id = :user")
        public List<Perro> findByUser(@Param("user")String id);
	
}