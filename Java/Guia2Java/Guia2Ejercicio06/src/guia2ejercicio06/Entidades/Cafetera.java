package guia2ejercicio06.Entidades;

import java.util.Scanner;

/*
            6. Programa Nespresso. Desarrolle una clase Cafetera con los 
        atributos capacidadMaxima (la cantidad máxima de café que puede contener 
        la cafetera) y cantidadActual (la cantidad actual de café que hay en la 
        cafetera). Implemente, al menos, los siguientes métodos: 
                • Constructor predeterminado o vacío
                • Constructor con la capacidad máxima y la cantidad actual
                • Métodos getters y setters.
                • Método llenarCafetera(): hace que la cantidad actual sea igual
            a la capacidad máxima.
                • Método servirTaza(int): se pide el tamaño de una taza vacía, 
            el método recibe el tamaño de la taza y simula la acción de servir  
            la taza con la capacidad indicada. Si la cantidad actual de café “no
            alcanza” para llenar la taza, se sirve lo que quede. El método le 
            informará al usuario si se llenó o no la taza, y de no haberse 
            llenado en cuanto quedó la taza.
                • Método vaciarCafetera(): pone la cantidad de café actual en 
            cero.
                • Método agregarCafe(int): se le pide al usuario una cantidad de 
            café, el método lo recibe y se añade a la cafetera la cantidad de 
            café indicada.
 */
public class Cafetera {

    private Integer capacidadmax;
    private Integer cantactual;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera() {
    }

    public Cafetera(Integer capacidadmax, Integer cantactual) {
        this.capacidadmax = capacidadmax;
        this.cantactual = cantactual;
    }

    public Integer getCapacidadmax() {
        return capacidadmax;
    }

    public void setCapacidadmax(Integer capacidadmax) {
        this.capacidadmax = capacidadmax;
    }

    public Integer getCantactual() {
        return cantactual;
    }

    public void setCantactual(Integer cantactual) {
        this.cantactual = cantactual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadmax=" + capacidadmax + ", cantactual=" + cantactual + '}';
    }

    /*
    public void llenarCafetera() {
        cantactual = capacidadmax;
    }

    public void servirTaza() {
        int tamaniotaza;
        double porctaza, tamtaza;
        System.out.println("Ingrese el tamaño de la taza: ");
        tamaniotaza = leer.nextInt();
        tamtaza = tamaniotaza;
        if (cantactual > 0) {
            if (cantactual >= tamaniotaza) {
                cantactual = cantactual - tamaniotaza;
                System.out.println("Se llenó la taza.");
            } else {
                porctaza = (cantactual / tamtaza) * 100;
                cantactual = 0;
                System.out.println("La taza fue cargada hasta " + porctaza + "%.");
            }
        } else if (cantactual == 0) {
            System.out.println("La cafetera está vacía.");
        }
    }

    public void vaciarCafetera() {
        cantactual = 0;
    }

    public void agregarCafe() {
        int cafeextra;

        System.out.println("Ingrese la cantidad deseada a agregar: ");
        cafeextra = leer.nextInt();
        if ((cantactual + cafeextra) < capacidadmax) {
            cantactual = cantactual + cafeextra;
        }
    }
     */
}
