package guia5ejerciciosextra02.Entidades;

public class EdificioDeOficinas extends Edificio {

    /*
        • Clase EdificioDeOficinas con sus atributos número de oficinas, 
        cantidad de personas por oficina y numero de pisos.
     */

    private Integer cantidadDeOficinas;
    private Integer personasPorOficina;
    private Integer pisos;

    public EdificioDeOficinas() {
        super();
    }

    public EdificioDeOficinas(Integer cantidadDeOficinas, Integer personasPorOficina, Integer pisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.cantidadDeOficinas = cantidadDeOficinas;
        this.personasPorOficina = personasPorOficina;
        this.pisos = pisos;
    }

    public Integer getCantidadDeOficinas() {
        return cantidadDeOficinas;
    }

    public void setCantidadDeOficinas(Integer cantidadDeOficinas) {
        this.cantidadDeOficinas = cantidadDeOficinas;
    }

    public Integer getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(Integer personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + super.toString() + "cantidadDeOficinas=" + cantidadDeOficinas + ", personasPorOficina=" + personasPorOficina + ", pisos=" + pisos + '}';
    }

}
