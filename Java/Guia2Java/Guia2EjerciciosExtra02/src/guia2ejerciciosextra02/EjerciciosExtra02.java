package guia2ejerciciosextra02;

import guia2ejerciciosextra02.Entidades.Punto;
import guia2ejerciciosextra02.Servicio.ServicioPunto;

public class EjerciciosExtra02 {

    public static void main(String[] args) {
        /*
            2. Definir una clase llamada Puntos que contendrá las coordenadas de
        dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un 
        punto. Generar un objeto puntos usando un método crearPuntos() que le 
        pide al usuario los dos números y los ingresa en los atributos del 
        objeto. Después, a través de otro método calcular y devolver la 
        distancia que existe entre los dos puntos que existen en la clase 
        Puntos.
         */
        ServicioPunto sp = new ServicioPunto();
        Punto p = sp.crearPunto();
        sp.calcularDistancia(p);
        sp.limites(p);
        sp.dibujarPunto(p);
        /*
        Punto p = new Punto();
        p = p.crearPunto();
        p.calcularDistancia();
        p.limites();
        p.dibujarPunto();
         */
    }

}
