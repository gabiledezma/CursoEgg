package guia4ejerciciosextra02.Entidades;


public class Asiento {

    private String nombre;
    private Boolean ocupado;
    private Integer fila;
    private Integer columna;

    public Asiento() {
    }

    public Asiento(String nombre, Boolean ocupado, Integer fila, Integer columna) {
        this.nombre = nombre;
        this.ocupado = ocupado;
        this.fila = fila;
        this.columna = columna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Integer getColumna() {
        return columna;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Asiento{" + "nombre=" + nombre + ", ocupado=" + ocupado + ", fila=" + fila + ", columna=" + columna + '}';
    }
    
    
}
