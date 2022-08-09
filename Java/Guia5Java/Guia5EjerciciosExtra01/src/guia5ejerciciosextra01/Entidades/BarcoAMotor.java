package guia5ejerciciosextra01.Entidades;

public class BarcoAMotor extends Barco {

    /*
        • Potencia en CV para barcos a motor.
     */
    protected Double potenciaMotor;

    public BarcoAMotor() {
        super();
    }

    public BarcoAMotor(Double potenciaMotor, String matricula, Double eslora, Integer anioDeFabricacion, Double modulo) {
        super(matricula, eslora, anioDeFabricacion, modulo);
        this.potenciaMotor = potenciaMotor;
    }

    public Double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(Double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + super.toString() + "potenciaMotor=" + potenciaMotor + '}';
    }

}
