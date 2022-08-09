package guia5ejercicio02.Entidades;

import guia5ejercicio02.Servicios.ServicioElectrodomestico;

public class Electrodomestico {

    /*
precio, color, consumo energético (letras entre A y F) y peso.
     */
    protected Double precio;
    protected String color;
    protected String consumoEnergetico;
    protected Double peso;
    private ServicioElectrodomestico se = new ServicioElectrodomestico();
    
    public Electrodomestico() {
    }
    
    public Electrodomestico(Double precio, String color, String consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = se.comprobarColor(color);
        this.consumoEnergetico = se.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    
    public Double getPrecio() {
        return precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = se.comprobarColor(color);
    }
    
    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = se.comprobarConsumoEnergetico(consumoEnergetico);
    }
    
    public Double getPeso() {
        return peso;
    }
    
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
}
