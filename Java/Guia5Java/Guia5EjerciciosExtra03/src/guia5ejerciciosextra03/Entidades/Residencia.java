package guia5ejerciciosextra03.Entidades;

public class Residencia extends AlojamientoExtraHotelero {

    /*
Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo.
     */

    private Integer cantidadHabitaciones;
    private Boolean descuentoGremios;
    private Boolean campoDeportivo;

    public Residencia() {
        super();
    }

    public Residencia(Integer cantidadHabitaciones, Boolean descuentoGremios, Boolean campoDeportivo, Boolean privado, Integer tamanio, String nombre, String direccion, String localidad, String gerente) {
        super(privado, tamanio, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Boolean getDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(Boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + super.toString() + "cantidadHabitaciones=" + cantidadHabitaciones + ", descuentoGremios=" + descuentoGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }

}
