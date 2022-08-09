package guia2ejercicio07.Servicio;

import guia2ejercicio07.Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        Persona p = new Persona();
        boolean confirmacion;
        System.out.println("Ingrese su nombre: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese su edad: ");
        p.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese su sexo: ");
            p.setSexo(leer.next());
            p.setSexo(p.getSexo().toUpperCase());
            p.setSexo(p.getSexo().substring(0, 1));
            switch (p.getSexo()) {
                case "H":
                case "M":
                case "O":
                    confirmacion = true;
                    break;
                default:
                    System.out.println("La opción ingresada es inválida. Inténtelo nuevamente.");
                    confirmacion = false;
            }
        } while (confirmacion != true);
        System.out.println("Ingrese su peso (en kg): ");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura (en mts): ");
        p.setAltura(leer.nextDouble());
        return p;
    }

    public int calcularIMC(Persona p) {
        double imc;
        int resultado = 2;
        imc = p.getPeso() / (p.getAltura() * p.getAltura());
        if (imc < 20) {
            resultado = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultado = 0;
        } else if (imc > 25) {
            resultado = 1;
        }
        return resultado;
    }

    public boolean esMayorDeEdad(Persona p) {
        System.out.println(p.getEdad());
        boolean mayordeedad;
        if (p.getEdad() >= 18) {
            System.out.println("Es mayor de edad.");
            mayordeedad = true;
        } else {
            System.out.println("No es mayor de edad.");
            mayordeedad = false;
        }
        return mayordeedad;
    }

}
