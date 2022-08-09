package com.perrosv1.app.servicios;

import com.perrosv1.app.entidades.Usuario;
import com.perrosv1.app.repositorios.UsuarioRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServicio {
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    

    @Transactional
    public Usuario save(Long dni, String nombre, String apellido) throws Exception{
        validator(dni,nombre,apellido);
        Usuario entidad = new Usuario();
        entidad.setNombre(nombre);
        entidad.setDni(dni);
        entidad.getApellido();
        return usuarioRepositorio.save(entidad);
    }
    @Transactional
    public Usuario edit(String id, String nombre, String apellido, Long dni) throws Exception{
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {
            validator(dni,nombre,apellido);
            Usuario u = respuesta.get();
            u.setDni(dni);
            u.setNombre(nombre);
            u.setApellido(apellido);
            return usuarioRepositorio.save(u);
        }else{
            return null;
        }  
    }
    @Transactional
    public void delete(String id){
        usuarioRepositorio.deleteById(id);
    }
    
    @Transactional(readOnly = true)
    public List<Usuario> findAll(){
        return usuarioRepositorio.findAll();
    }
    
    @Transactional(readOnly = true)
    public Usuario getOne(String id){
        return usuarioRepositorio.getOne(id);
    }
    
    @Transactional(readOnly = true)
    public Usuario findByDni(Long dni){
        return usuarioRepositorio.findByDni(dni);
    }
    
    public void validator(Long dni, String nombre, String apellido) throws Exception{
        
        
        if (dni==null || dni <1) {
            throw new Exception("Documento invalido");
        }
        Usuario u = usuarioRepositorio.findByDni(dni);
        if (u != null) {
            throw new Exception("Este documento ya existe en la base de datos");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("Nombre invalido");
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new Exception("Apellido invalido");
        }
        
    } 
    
}
