package com.ejemplo.spring.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Mascota {

    /*

     */
    @Id
    @GeneratedValue(generator = "uuid") // uuid : identificador unico universal; esta linea genera una cadena de texto que no se repetira nunca
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String nombre;

    public Mascota() {
    }

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + '}';
    }
    
    
    
}
