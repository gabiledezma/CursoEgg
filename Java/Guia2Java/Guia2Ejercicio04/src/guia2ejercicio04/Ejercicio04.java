package guia2ejercicio04;

import guia2ejercicio04.Entidades.Rectangulo;
import guia2ejercicio04.Servicio.ServicioRectangulo;

public class Ejercicio04 {

    public static void main(String[] args) {
        /*
            4. Crear una clase Rectángulo que modele rectángulos por medio de 
        un atributo privado base y un atributo privado altura. La clase incluirá 
        un método para crear el rectángulo con los datos del Rectángulo dados 
        por el usuario. También incluirá un método para calcular la superficie 
        del rectángulo y un método para calcular el perímetro del rectángulo. 
        Por último, tendremos un método que dibujará el rectángulo mediante 
        asteriscos usando la base y la altura. Se deberán además definir los 
        métodos getters, setters y constructores correspondientes.
            Superficie = base * altura / Perímetro = (base + altura) * 2.
         */
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo r = sr.crearRectangulo();
        System.out.println("La superficie del rectángulo es: " + sr.superficie(r));
        System.out.println("El perímetro del rectángulo es: " + sr.perimetro(r));
        sr.dibujarRectangulo(r);
        /*
        Rectangulo r = new Rectangulo();
        r=r.crearRectangulo();
        System.out.println("La superficie del rectángulo es: "+r.superficie());
        System.out.println("El perímetro del rectángulo es: "+r.perimetro());
        r.dibujarRectangulo();
         */
    }

}
