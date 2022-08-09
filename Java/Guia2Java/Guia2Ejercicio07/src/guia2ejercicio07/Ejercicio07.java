package guia2ejercicio07;

import guia2ejercicio07.Entidades.Persona;
import guia2ejercicio07.Servicio.ServicioPersona;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) throws Exception {
        /*
            7. Realizar una clase llamada Persona que tenga los siguientes 
        atributos: nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y 
        altura. Si el alumno desea añadir algún otro atributo, puede hacerlo. 
        Los métodos que se implementarán son:
            • Un constructor por defecto.
            • Un constructor con todos los atributos como parámetro.
            • Métodos getters y setters de cada atributo.
            • Metodo crearPersona(): el método crear persona, le pide los 
        valores de los atributos al usuario y después se le asignan a sus 
        respectivos atributos para llenar el objeto Persona. Además, comprueba 
        que el sexo introducido sea correcto, es decir, H, M o O. Si no es 
        correcto se deberá mostrar un mensaje.
            • Método calcularIMC(): calculara si la persona está en su peso 
        ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado 
        un valor menor que 20, significa que la persona está por debajo de su 
        peso ideal y la función devuelve un -1. Si la fórmula da por resultado 
        un número entre 20 y 25 (incluidos), significa que la persona está en su
        peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
        fórmula es un valor mayor que 25 significa que la persona tiene 
        sobrepeso, y la función devuelve un 1.
            • Método esMayorDeEdad(): indica si la persona es mayor de edad. La
        función devuelve un booleano.
            A continuación, en la clase main hacer lo siguiente:
                Crear 4 objetos de tipo Persona con distintos valores, a 
        continuación, llamaremos todos los métodos para cada objeto, deberá 
        comprobar si la persona está en su peso ideal, tiene sobrepeso o está 
        por debajo de su peso ideal e indicar para cada objeto si la persona es 
        mayor de edad.
                Por último, guardaremos los resultados de los métodos calcular
        IMC y esMayorDeEdad en distintas variables, para después en el main, 
        calcular un porcentaje de esas 4 personas cuantas están por debajo de su
        peso, cuantas en su peso ideal y cuantos, por encima, y también 
        calcularemos un porcentaje de cuantos son mayores de edad y cuantos 
        menores.
         */

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPersona sp = new ServicioPersona();
        int IMC, contadorpersonas = 0, contadormayores = 0, contadormenores = 0, IMCalto = 0, IMCmedio = 0, IMCbajo = 0;
        double promIMCalto, promIMCmedio, promIMCbajo, promMayores, promMenores;
        boolean Edad;
        Persona z = new Persona();
        try {
            if (sp.esMayorDeEdad(z) == true) {
                System.out.println("No esta vacio");
            }
        } catch (Exception e) {
            System.out.println("La persona es nula, excepción controlada");
        }
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    Persona a = sp.crearPersona();
                    switch (sp.calcularIMC(a)) {
                        case 1:
                            System.out.println("Está por ensima de su peso ideal.");
                            IMCalto++;
                            break;
                        case 0:
                            System.out.println("Está en su peso ideal.");
                            IMCmedio++;
                            break;
                        case -1:
                            System.out.println("Está por debajo de su peso ideal.");
                            IMCbajo++;
                            break;
                    }
                    try {
                        if (sp.esMayorDeEdad(a) == true) {
                            contadormayores++;
                        } else {
                            contadormenores++;
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println("La persona es nula, excepción controlada");
                    }
                case 1:
                    Persona b = sp.crearPersona();
                    switch (sp.calcularIMC(b)) {
                        case 1:
                            System.out.println("Está por ensima de su peso ideal.");
                            IMCalto++;
                            break;
                        case 0:
                            System.out.println("Está en su peso ideal.");
                            IMCmedio++;
                            break;
                        case -1:
                            System.out.println("Está por debajo de su peso ideal.");
                            IMCbajo++;
                            break;
                    }
                    if (sp.esMayorDeEdad(b) == true) {
                        contadormayores++;
                    } else {
                        contadormenores++;
                    }
                    break;
                case 2:
                    Persona c = sp.crearPersona();
                    switch (sp.calcularIMC(c)) {
                        case 1:
                            System.out.println("Está por ensima de su peso ideal.");
                            IMCalto++;
                            break;
                        case 0:
                            System.out.println("Está en su peso ideal.");
                            IMCmedio++;
                            break;
                        case -1:
                            System.out.println("Está por debajo de su peso ideal.");
                            IMCbajo++;
                            break;
                    }
                    if (sp.esMayorDeEdad(c) == true) {
                        contadormayores++;
                    } else {
                        contadormenores++;
                    }
                    break;
                case 3:
                    Persona d = sp.crearPersona();
                    switch (sp.calcularIMC(d)) {
                        case 1:
                            System.out.println("Está por ensima de su peso ideal.");
                            IMCalto++;
                            break;
                        case 0:
                            System.out.println("Está en su peso ideal.");
                            IMCmedio++;
                            break;
                        case -1:
                            System.out.println("Está por debajo de su peso ideal.");
                            IMCbajo++;
                            break;
                    }
                    if (sp.esMayorDeEdad(d) == true) {
                        contadormayores++;
                    } else {
                        contadormenores++;
                    }
                    break;
            }
        }
        promIMCalto = (IMCalto / 4) * 100;
        promIMCmedio = (IMCmedio / 4) * 100;
        promIMCbajo = (IMCbajo / 4) * 100;
        promMayores = (contadormayores / 4) * 100;
        promMenores = (contadormenores / 4) * 100;
        System.out.println("El porcentaje de personas con IMC alto es: " + promIMCalto + "%.\n"
                + "El porcentaje de personas con IMC medio es: " + promIMCmedio + "%.\n"
                + "El porcentaje de personas con IMC bajo es: " + promIMCbajo + "%.\n"
                + "El porcentaje de personas mayores de edad es: " + promMayores + ".\n"
                + "El porcentaje de personas menores de edad es: " + promMenores + ".");
    }
}
