package guia5ejercicio02.Entidades;

public class Lavadora extends Electrodomestico {

    /*

     */
    private Integer carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Integer carga, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + "carga=" + carga + '}';
    }

}
