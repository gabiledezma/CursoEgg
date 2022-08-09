package guia5ejerciciosextra03.Entidades;

public class AlojamientoExtraHotelero extends Alojamiento {

    /*
los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa.
    Existen dos tipos de
alojamientos extrahoteleros: los Camping y las Residencias.
     */
    protected Boolean privado;
    protected Integer tamanio;//en metros cuadrados

    public AlojamientoExtraHotelero() {
        super();
    }

    public AlojamientoExtraHotelero(Boolean privado, Integer tamanio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.tamanio = tamanio;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "AlojamientoExtraHotelero{" + super.toString() + "privado=" + privado + ", tamanio=" + tamanio + '}';
    }

}
