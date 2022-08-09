package guia3ejercicio01rebis.Entidades;

public class Perrorebis {

    private String raza;

    public Perrorebis() {
    }

    public Perrorebis(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perrorebis{" + "raza=" + raza + '}';
    }

}
