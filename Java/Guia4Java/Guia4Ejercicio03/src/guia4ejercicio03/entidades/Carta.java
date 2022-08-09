package guia4ejercicio03.entidades;

public class Carta {
    /*
        Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y 
    un palo (espadas, bastos, oros y copas)
     */
    private Integer numero;
    private String palo;

    public Carta() {
    }

    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }

}
