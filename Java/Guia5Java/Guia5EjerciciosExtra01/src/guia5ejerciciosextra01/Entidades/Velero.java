package guia5ejerciciosextra01.Entidades;

public class Velero extends Barco {

    /*
        • Número de mástiles para veleros.
     */
    private Double mastiles;

    public Velero() {
        super();
    }

    public Velero(Double mastiles, String matricula, Double eslora, Integer anioDeFabricacion, Double modulo) {
        super(matricula, eslora, anioDeFabricacion, modulo);
        this.mastiles = mastiles;
    }

    public Double getMastiles() {
        return mastiles;
    }

    public void setMastiles(Double mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + super.toString() + "mastiles=" + mastiles + '}';
    }

}
