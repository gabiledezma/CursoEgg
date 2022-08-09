package guia3ejerciciosextra04.Entidad;

public class Ciudad {
    private String nombre;
    private Integer codigopostal;

    public Ciudad() {
    }

    public Ciudad(String nombre, Integer codigopostal) {
        this.nombre = nombre;
        this.codigopostal = codigopostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(Integer codigopostal) {
        this.codigopostal = codigopostal;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "Nombre=" + nombre + ", Codigo Postal=" + codigopostal + '}';
    }
    
}
