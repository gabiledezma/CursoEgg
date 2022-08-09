package guia5ejercicio04.Interfaces;

public interface calculosFormas <T>{

    /*
    Métodos para calcular el área, el perímetro y el valor de PI como constante.
     */

    public final double PI = Math.PI;
    
    public T crearForma();

    public void calcularArea(T t);

    public void calcularPerimetro(T t);
}
