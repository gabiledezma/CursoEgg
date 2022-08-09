package guia2ejercicio03.Entidades;

import java.util.Scanner;

    /*
            3. Crear una clase llamada Operacion que tenga como atributos 
        privados numero1 y numero2. A continuación, se deben crear los siguientes 
        métodos:
            a) Método constructor con todos los atributos pasados por parámetro.
            b) Metodo constructor sin los atributos pasados por parámetro.
            c) Métodos get y set.
            d) Método para crearOperacion(): que le pide al usuario los dos 
        números y los guarda en los atributos del objeto.
            e) Método sumar(): calcular la suma de los números y devolver el 
        resultado al main.
            f) Método restar(): calcular la resta de los números y devolver el 
        resultado al main.
            g) Método multiplicar(): primero valida que no se haga una 
        multiplicación por cero, si fuera a multiplicar por cero, el método 
        devuelve 0 y se le informa al usuario el error. Si no, se hace la 
        multiplicación y se devuelve el resultado al main.
            h) Método dividir(): primero valida que no se haga una división por 
        cero, si fuera a pasar una división por cero, el método devuelve 0 y se 
        le informa al usuario el error se le informa al usuario. Si no, se hace 
        la división y se devuelve el resultado al main.
        */

public class Operacion {
    private Integer numero1;
    private Integer numero2;

    public Operacion(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    /*
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Operacion o = new Operacion();
        System.out.println("Ingrese el valor del número 1: ");
        o.numero1=leer.nextInt();
        System.out.println("Ingrese el valor del número 2: ");
        o.numero2=leer.nextInt();
        return o;
    }
    public int sumar() {
        Operacion o = new Operacion();
        int suma;
        suma=numero1+numero2;
        return suma;
    }
    public int restar() {
        Operacion o = new Operacion();
        int resta;
        resta=numero1-numero2;
        return resta;
    }
    public int multiplicar() {
        Operacion o = new Operacion();
        int multiplicacion;
        if (numero2==0) {
            System.out.println("Error, Se intentó multiplicar por cero.");
            multiplicacion=0;
        } else {
            multiplicacion=numero1*numero2;
        }
        return multiplicacion;
    }
    public double dividir() {
        Operacion o = new Operacion();
        int division;
        if (numero2==0) {
            System.out.println("Error, Se intentó dividir por cero.");
            division=0;
        } else {
            division=numero1/numero2;
        }
        return division;
    }
    */
}
