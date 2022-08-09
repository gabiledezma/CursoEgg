package guia5ejerciciosextra01.Entidades;

import java.util.Date;

public class Alquiler {

    /*
        En un puerto se alquilan amarres para barcos de distinto tipo. 
        Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha 
        de alquiler, fecha de devolución, la posición del amarre y el barco que 
        lo ocupará.
     */
    private String nombre;
    private Long documento;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Integer posicionAmarre;
    private Barco barco;
    private Double montoAlquiler;

    public Alquiler() {
    }

    public Alquiler(String nombre, Long documento, Date fechaAlquiler, Date fechaDevolucion, Integer posicionAmarre, Barco barco, Double montoAlquiler) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.montoAlquiler = montoAlquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Double getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(Double montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + ", montoAlquiler=" + montoAlquiler + '}';
    }

    

}
