package guia2ejercicio03;

import guia2ejercicio03.Entidades.Operacion;
import guia2ejercicio03.Servicio.ServicioOperacion;

public class Ejercicio03 {

    public static void main(String[] args) {
        /*
            3. Crear una clase llamada Operacion que tenga como atributos 
        privados numero1 ynumero2. A continuación, se deben crear los siguientes 
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
        ServicioOperacion so = new ServicioOperacion();
        Operacion o = so.crearOperacion();
        System.out.println("La suma de los números es: " + so.sumar(o));
        System.out.println("La resta de los números es: " + so.restar(o));
        System.out.println("La multiplicación de los números es: " + so.multiplicar(o));
        if (o.getNumero2() != 0) {
            System.out.println("La división de los números es: " + so.dividir(o));
        }
        /*
        Operacion o = new Operacion();
        o=o.crearOperacion();
        System.out.println("La suma de los números es: "+o.sumar());
        System.out.println("La resta de los números es: "+o.restar());
        System.out.println("La multiplicación de los números es: "+o.multiplicar());
        System.out.println("La división de los números es: "+o.dividir());
         */
    }

}
