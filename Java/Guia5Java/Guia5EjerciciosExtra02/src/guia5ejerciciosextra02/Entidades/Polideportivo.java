package guia5ejerciciosextra02.Entidades;

public class Polideportivo extends Edificio {

    /*
        • Clase Polideportivo con su nombre y tipo de instalación que puede ser 
        Techado o Abierto, esta clase implementará los dos métodos abstractos y 
        los atributos del padre.
     */

    private String nombre;
    private Boolean techado;

    public Polideportivo() {
        super();
    }

    public Polideportivo(String nombre, Boolean techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + super.toString() + "nombre=" + nombre + ", techado=" + techado + '}';
    }

}
