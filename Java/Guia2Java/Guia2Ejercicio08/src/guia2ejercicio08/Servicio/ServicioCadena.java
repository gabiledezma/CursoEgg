package guia2ejercicio08.Servicio;

import guia2ejercicio08.Entidades.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        Cadena micadena = new Cadena();
        System.out.println("Ingrese una frase: ");
        micadena.setFrase(leer.next());
        micadena.setLongitud(micadena.getFrase().length());
        return micadena;
    }

    public int mostrarVocales(Cadena micadena) {
        int contador = 0;
        for (int i = 0; i < micadena.getLongitud(); i++) {
            switch (micadena.getFrase().substring(i, i + 1).toUpperCase()) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(Cadena micadena) {
        String invertida = "";
        for (int i = micadena.getLongitud() - 1; i >= 0; i--) {
            invertida = invertida.concat(micadena.getFrase().substring(i, i + 1));
        }
        return invertida;
    }

    public int vecesRepetido(Cadena micadena, String letra) {
        int contador = 0;
        for (int i = 0; i < micadena.getLongitud(); i++) {
            if (micadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public void compararLongitud(Cadena micadena, String frase2) {
        if (frase2.length() > micadena.getLongitud()) {
            System.out.println("La frase ingresada es de longitud mayor a la frase previa.");
        } else if (frase2.length() < micadena.getLongitud()) {
            System.out.println("La frase ingresada es de longitud menor a la frase previa.");
        } else {
            System.out.println("Las frases son de igual longitud.");
        }
    }

    public void unirFrase(Cadena micadena, String frase2) {
        micadena.setFrase(micadena.getFrase().concat(frase2));
        System.out.println("Las frases unidas quedan: " + micadena.getFrase());
    }

    public void reemplazar(Cadena micadena, String nuevoCaracter) {
        System.out.println("La frase con las letras A reemplazada por " + nuevoCaracter + " queda asi: ");
        for (int i = 0; i < micadena.getLongitud(); i++) {
            switch (micadena.getFrase().substring(i, i + 1)) {
                case "a":
                case "A":
                    System.out.print(nuevoCaracter);
                    break;
                default:
                    System.out.print(micadena.getFrase().substring(i, i + 1));
            }
        }
        System.out.println("");
    }

    public boolean contiene(Cadena micadena, String letra) {
        for (int i = 0; i < micadena.getLongitud(); i++) {
            if (micadena.getFrase().substring(i, i + 1).toUpperCase().equals(letra.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public void menu(Cadena micadena) {
        int choice;
        do {
            System.out.println("---MENÚ---\n"
                    + "1. Mostrar Vocales. \n"
                    + "2. Invertir Frase. \n"
                    + "3. Veces Repetido. \n"
                    + "4. Comparar Longitud. \n"
                    + "5. Unir Frases. \n"
                    + "6. Reemplazar. \n"
                    + "7. Contiene. \n"
                    + "0. Salir. ");
            choice = leer.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("La cantidad de vocales es: " + this.mostrarVocales(micadena));
                    break;
                case 2:
                    System.out.println("La frase invertida es: " + this.invertirPalabra(micadena));
                    break;
                case 3:
                    System.out.println("Ingrese una letra:");
                    int letrarepetida = this.vecesRepetido(micadena, leer.next());
                    System.out.println("La letra ingresada se repite " + letrarepetida + " veces.");
                    break;
                case 4:
                    System.out.println("Ingrese una frase:");
                    this.compararLongitud(micadena, leer.next());
                    break;
                case 5:
                    System.out.println("Ingrese una frase:");
                    this.unirFrase(micadena, leer.next());
                    break;
                case 6:
                    System.out.println("Ingrese un caracter que reemplazará las letras A:");
                    this.reemplazar(micadena, leer.next());
                    break;
                case 7:
                    System.out.println("Ingrese una letra:");
                    if (this.contiene(micadena, leer.next())) {
                        System.out.println("Contiene la letra.");
                    } else {
                        System.out.println("No contiene la letra.");
                    }
            }
        } while (choice != 0);
    }
}
