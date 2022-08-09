package guia2ejerciciosextra06.Entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

    private Integer largo;
    private String[] palabra;
    private Integer letras;
    private Integer jugadasMax;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado() {
    }

    public Ahorcado(Integer largo, Integer letras, Integer jugadasMax) {
        this.largo = largo;
        this.letras = letras;
        this.jugadasMax = jugadasMax;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public Integer getLetras() {
        return letras;
    }

    public void setLetras(Integer letras) {
        this.letras = letras;
    }

    public Integer getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(Integer jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "largo=" + largo + ", palabra=" + Arrays.toString(palabra) + ", letras=" + letras + ", jugadasMax=" + jugadasMax + '}';
    }
    /*
    public void crearJuego() {
        System.out.println("Ingrese una palabra");
        String palab = leer.next();
        palab = palab.toUpperCase();
        this.largo = palab.length();
        this.palabra = new String[largo];
        for (int i = 0; i < palab.length(); i++) {
            this.palabra[i] = palab.substring(i, i + 1);
        }
        System.out.println("Ingrese la cantidad maxima de jugadas. ");
        this.jugadasMax = leer.nextInt();
        this.letras = 0;
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + this.palabra.length);
    }

    public void buscar(String letra) {
        int contador = 0;
        for (String palabra1 : this.palabra) {
            if (letra.equals(palabra1)) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("Mensaje: La letra pertenece a la palabra. ");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra. ");
        }
    }

    public boolean encontradas(String letra) {
        boolean resultado;
        int contador = 0;
        int faltantes;
        for (String palabra1 : this.palabra) {
            if (letra.equals(palabra1)) {
                this.letras++;
                contador++;
            }
        }
        faltantes = this.palabra.length - this.letras;
        System.out.println("Número de letras (encontradas, faltantes): (" + this.letras + "," + faltantes + ")");
        if (contador > 0) {
            return resultado = true;
        } else {
            return resultado = false;
        }

    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + this.jugadasMax);
    }

    public void juego() {
        String letra;
        this.crearJuego();
        this.longitud();
        do {
            System.out.println("Ingrese una letra:");
            letra = leer.next();
            letra = letra.toUpperCase();
            this.buscar(letra);
            if (this.encontradas(letra) == false) {
                this.jugadasMax = this.jugadasMax - 1;
                if (this.jugadasMax == 0) {
                    break;
                }
            }
            this.intentos();
        } while (this.letras != this.palabra.length);
    }
     */
}
