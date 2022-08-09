package guia5ejercicio04.Entidades;

public class Circulo extends Forma {

    private Double radio;
    private Double diametro;

    public Circulo() {
        super();
    }

    public Circulo(Double radio, Double diametro, Double area, Double perimetro) {
        super(area, perimetro);
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString() + "radio=" + radio + ", diametro=" + diametro + '}';
    }

}
