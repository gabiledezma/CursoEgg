package guia5ejerciciosextra02.Servicios;

public abstract class ServicioEdificio {

    /*
        La clase edificio tendrá como métodos:
        • Método calcularSuperficie(): calcula la superficie del edificio.
        • Método calcularVolumen(): calcula el volumen del edifico.
     */

    public abstract int calcularSuperficie(Integer alto, Integer largo, Integer ancho);

    public abstract int calcularVolumen(Integer alto, Integer largo, Integer ancho);
}
