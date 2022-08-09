package guia2ejercicio02.entidades;

//import java.util.Scanner;
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    /*
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        Circunferencia c = new Circunferencia();
        System.out.println("Ingrese el radio: ");
        c.radio= leer.nextDouble();
        return c;
    }
    public double area() {
        double area;
        area=Math.PI * radio * radio;
        return  area; 
    }
    public double perimetro() {
        double perimetro;
        perimetro= 2 * radio * Math.PI;
        return perimetro;
    }
     */
}
