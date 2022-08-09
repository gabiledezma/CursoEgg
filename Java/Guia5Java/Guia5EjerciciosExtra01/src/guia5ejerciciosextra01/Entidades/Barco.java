package guia5ejerciciosextra01.Entidades;

public class Barco {

    /*
            Un Barco se caracteriza por: su matrícula, su eslora en metros y año 
        de fabricación.
     */
    protected String matricula;
    protected Double eslora;
    protected Integer anioDeFabricacion;
    protected Double modulo;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, Integer anioDeFabricacion, Double modulo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
        this.modulo = modulo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(Integer anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public Double getModulo() {
        return modulo;
    }

    public void setModulo(Double modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioDeFabricacion=" + anioDeFabricacion + ", modulo=" + modulo + '}';
    }

}
