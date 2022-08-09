package juegotruco.entidades;

import java.util.Random;
import java.util.Scanner;

public class Partida {

    private Integer cantidaddejugadores;
    private final Integer mazo = 40;
    private Integer limitedepuntos;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Random aleatorio = new Random();
// tipo_de_dato nombre_de_variable;
// nombre_de_variable = aleatorio.next tipo_de_dato(ValorMaximo);   

    public Partida() {
    }

    public Partida(Integer cantidaddejugadores, Integer limitedepuntos) {
        this.cantidaddejugadores = cantidaddejugadores;
        this.limitedepuntos = limitedepuntos;
    }

    public Partida crearPartida() {
        Partida nueva = new Partida();
        String letra;
        System.out.println("Ingrese la cantidad de participantes: ");
        this.cantidaddejugadores = leer.nextInt();
        do {
            System.out.println("¿A cuánto van a jugar, 15 ( A ) o 30 ( B )?");
            letra = leer.next();
            letra = letra.toUpperCase();
            switch (letra) {
                case "A":
                    this.limitedepuntos = 15;
                case "B":
                    this.limitedepuntos = 30;
                default:
                    System.out.println("La opción ingresada es inválida. ");
            }

        } while (!letra.equals("A") || (!letra.equals("B")));
        return nueva;
    }

}
