package guia5ejerciciosextra03.Entidades;

public class Camping extends AlojamientoExtraHotelero {

    /*
Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones.
     */

    private Integer limiteCarpas;
    private Integer cantidadBanios;
    private Boolean restaurant;

    public Camping() {
        super();
    }

    public Camping(Integer limiteCarpas, Integer cantidadBanios, Boolean restaurant, Boolean privado, Integer tamanio, String nombre, String direccion, String localidad, String gerente) {
        super(privado, tamanio, nombre, direccion, localidad, gerente);
        this.limiteCarpas = limiteCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurant = restaurant;
    }

    public Integer getLimiteCarpas() {
        return limiteCarpas;
    }

    public void setLimiteCarpas(Integer limiteCarpas) {
        this.limiteCarpas = limiteCarpas;
    }

    public Integer getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(Integer cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public Boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Camping{" + super.toString() + "limiteCarpas=" + limiteCarpas + ", cantidadBanios=" + cantidadBanios + ", restaurant=" + restaurant + '}';
    }

}
