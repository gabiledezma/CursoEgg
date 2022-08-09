package guia5ejerciciosextra01.Entidades;

public class Yate extends BarcoAMotor {

    /*
        • Potencia en CV y número de camarotes para yates de lujo.
     */
    private Double camarotes;

    public Yate() {
        super();
    }

    public Yate(Double camarotes, Double potenciaMotor, String matricula, Double eslora, Integer anioDeFabricacion, Double modulo) {
        super(potenciaMotor, matricula, eslora, anioDeFabricacion, modulo);
        this.camarotes = camarotes;
    }

    public Double getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Double camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + super.toString() + "camarotes=" + camarotes + '}';
    }

}
