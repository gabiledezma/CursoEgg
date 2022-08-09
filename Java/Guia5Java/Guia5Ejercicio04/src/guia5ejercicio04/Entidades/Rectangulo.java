package guia5ejercicio04.Entidades;

public class Rectangulo extends Forma {

    private Double base;
    private Double altura;

    public Rectangulo() {
        super();
    }

    public Rectangulo(Double base, Double altura, Double area, Double perimetro) {
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + super.toString() + "base=" + base + ", altura=" + altura + '}';
    }

}
