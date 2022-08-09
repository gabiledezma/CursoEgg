package guia2ejercicio09;

import guia2ejercicio09.Entidades.Matematica;
import guia2ejercicio09.Servicio.ServicioMatematica;

public class Ejercicio09 {

    public static void main(String[] args) {
        /*
            9. Realizar una clase llamada Matemática que tenga como atributos 
        dos números reales con los cuales se realizarán diferentes operaciones
        matemáticas. La clase deber tener un constructor vacío, parametrizado y 
        get y set. En el main se creará el objeto y se usará el Math.random para
        generar los dos números y se guardaran en el objeto con su respectivos 
        set. Deberá además implementar los siguientes métodos:
            • Método devolverMayor() para retornar cuál de los dos atributos 
        tiene el mayor valor
            • Método calcularPotencia() para calcular la potencia del mayor 
        valor de la clase elevado al menor número. Previamente se deben 
        redondear ambos valores.
            • Método calculaRaiz(), para calcular la raíz cuadrada del menor de 
        los dos valores. Antes de calcular la raíz cuadrada se debe obtener el 
        valor absoluto del número.
         */
        ServicioMatematica sm = new ServicioMatematica ();
        Matematica mat = sm.crearMatematica();
        System.out.println("El primer número es: " + mat.getNumero1() + "\n"
                + "El segundo número es: " + mat.getNumero2() + "\n"
                + "El mayor entre los números ingresados es: " + sm.devolverMayor(mat) + "\n"
                + "La potencia del mayor número elevado al menor es: " + sm.calcularPotencia(mat) + "\n"
                + "La raiz cuadrada del menor número es: " + sm.calculaRaiz(mat));
        /*
        Matematica mat = new Matematica();
        mat.setNumero1((int) (Math.random() * 10));
        mat.setNumero2((int) (Math.random() * 10));
        System.out.println("El primer número es: " + mat.getNumero1() + "\n"
                + "El segundo número es: " + mat.getNumero2() + "\n"
                + "El mayor entre los números ingresados es: " + mat.devolverMayor() + "\n"
                + "La potencia del mayor número elevado al menor es: " + mat.calcularPotencia() + "\n"
                + "La raiz cuadrada del menor número es: " + mat.calculaRaiz());
*/
    }

}
