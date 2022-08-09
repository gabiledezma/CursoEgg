package guia5ejercicio02.Entidades;

public class Televisor extends Electrodomestico {

    /*

     */

    private Double resolucion;
    private Boolean TDT;

    public Televisor() {
        super();
    }

    public Televisor(Double resolucion, Boolean TDT, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + "resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }

}
