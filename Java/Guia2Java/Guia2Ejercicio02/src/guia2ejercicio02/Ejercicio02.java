package guia2ejercicio02;

import guia2ejercicio02.Servicio.ServicioCircunferencia;
import guia2ejercicio02.entidades.Circunferencia;

public class Ejercicio02 {

    public static void main(String[] args) {
        /*
            2. Declarar una clase llamada Circunferencia que tenga como 
        atributo privado el radio de tipo real. A continuación, se deben crear 
        los siguientes métodos:
                a) Método constructor que inicialice el radio pasado como 
                parámetro.
                b) Métodos get y set para el atributo radio de la clase 
                Circunferencia.
                c) Método para crearCircunferencia(): que le pide el radio y lo 
                guarda en el atributo del objeto.
                d) Método area(): para calcular el área de la circunferencia 
                    (Area = π ∗ radio!).
                e) Método perimetro(): para calcular el perímetro 
                    (Perimetro = 2 ∗ π ∗ radio)
         */
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia c = sc.crearCircunferencia();
        System.out.println("El area del radio es: " + sc.area(c));
        System.out.println("El perimetro del radio es: " + sc.perimetro(c));
        /*
        Circunferencia c = new Circunferencia();
        c=c.crearCircunferencia();
        System.out.println("El area del radio ingresado es: "+c.area());
        System.out.println("El perimetro del radio ingresado es: "+c.perimetro());
         */
    }

}
