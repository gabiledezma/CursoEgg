package guia5ejercicio04.Entidades;

public abstract class Forma {

    protected Double area;
    protected Double perimetro;

    public Forma() {
    }

    public Forma(Double area, Double perimetro) {

        this.area = area;
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Forma{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }

}
