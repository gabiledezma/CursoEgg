package guia4ejerciciosextra02.Entidades;

public class Espectador {

    private String nombre;
    private Integer edad;
    private Double dineroDisponible;
    private Asiento lugar;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Double dineroDisponible, Asiento lugar) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public Asiento getLugar() {
        return lugar;
    }

    public void setLugar(Asiento lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + ", lugar=" + lugar + '}';
    }

    

}