package guia2ejerciciosextra03.Entidades;

public class Raiz {

    private Integer a;
    private Integer b;
    private Integer c;
    private double discriminante;

    //Formula ecuación 2do grado: (-b±√((b^2)-(4*a*c)))/(2*a)
    public Raiz() {
    }

    public Raiz(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante() {
        this.discriminante = ((double) ((Math.pow(b, 2)) - (4 * a * c)));
    }

    @Override
    public String toString() {
        return "Raiz{" + "a=" + a + ", b=" + b + ", c=" + c + ", discriminante=" + discriminante + '}';
    }
    /*
    public boolean tieneRaices() {
        boolean soluciones;
        if (discriminante > 0) {
            return soluciones = true;
        }
        return soluciones = false;
    }

    public boolean tieneRaiz() {
        boolean solucion;
        if (discriminante == 0) {
            return solucion = true;
        }
        return solucion = false;
    }

    public void obtenerRaices(boolean soluciones) {
        double solucion1, solucion2;
        if (soluciones == true) {
            solucion1 = ((double) ((this.b * -1) + ((double) (Math.sqrt(discriminante)))) / (2 * this.a));
            System.out.println("Solución 1:" + solucion1);
            solucion2 = ((double) ((this.b * -1) - ((double) (Math.sqrt(discriminante)))) / (2 * this.a));
            System.out.println("Solución 2: " + solucion2);
        }
    }

    public void obtenerRaiz(boolean solucion) {
        double solucion1;
        if (solucion == true) {
            solucion1 = (this.b * -1) / (2 * this.a);
            System.out.println("Solución:  " + solucion1);
        }
    }

    public void calcular() {
        if (this.tieneRaices() == true || this.tieneRaiz() == true) {
            this.obtenerRaices(this.tieneRaices());
            this.obtenerRaiz(this.tieneRaiz());
        } else {
            System.out.println("No tiene solución.");
        }
    }
     */

}
