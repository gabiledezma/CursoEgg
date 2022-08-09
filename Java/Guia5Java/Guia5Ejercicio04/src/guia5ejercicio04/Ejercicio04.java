package guia5ejercicio04;

import guia5ejercicio04.Entidades.Circulo;
import guia5ejercicio04.Entidades.Rectangulo;
import guia5ejercicio04.Servicios.ServicioCirculo;
import guia5ejercicio04.Servicios.ServicioRectangulo;

public class Ejercicio04 {

    public static void main(String[] args) {
        /*
            4. Se plantea desarrollar un programa que nos permita calcular el 
        área y el perímetro de formas geométricas, en este caso un circulo y un 
        rectángulo. Ya que este calculo se va a repetir en las dos formas 
        geométricas, vamos a crear una Interfaz, llamada calculosFormas que 
        tendrá, los dos métodos para calcular el área, el perímetro y el valor 
        de PI como constante.
            Desarrollar el ejercicio para que las formas implementen los métodos 
        de la interfaz y se calcule el área y el perímetro de los dos. En el 
        main se crearán las formas y se mostrará el resultado final.
    Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
         */

        ServicioRectangulo sr = new ServicioRectangulo();
        ServicioCirculo sc = new ServicioCirculo();
        Rectangulo r = sr.crearForma();
        Circulo c = sc.crearForma();
        System.out.println("El área del Rectángulo es: " + r.getArea() + " y su perimetro es: " + r.getPerimetro());
        System.out.println("El área del Círculo es: " + c.getArea() + " y su perimetro es: " + c.getPerimetro());
    }

}
