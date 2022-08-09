package guia2ejercicio08;

import guia2ejercicio08.Entidades.Cadena;
import guia2ejercicio08.Servicio.ServicioCadena;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        /*
            8. Realizar una clase llamada Cadena que tenga como atributos una 
        frase (de tipo de String) y su longitud. En el main se creará el objeto 
        y se le pedirá al usuario que ingrese una frase que puede ser una 
        palabra o varias palabras separadas por un espacio en blanco y a través 
        de los métodos set, se guardará la frase y la longitud de manera 
        automática según la longitud de la frase ingresada. Deberá además 
        implementar los siguientes métodos:
            • Método mostrarVocales(), deberá contabilizar la cantidad de
        vocales que tiene la frase ingresada.
            • Método invertirFrase(), deberá invertir la frase ingresada y 
        mostrarla por pantalla. Por ejemplo: 
                    Entrada: "casa blanca", Salida: "acnalb asac".
            • Método vecesRepetido(String letra), recibirá un carácter ingresado
        por el usuario y contabilizar cuántas veces se repite el carácter en la 
        frase, por ejemplo:
                    Entrada: frase = "casa blanca". 
                    Salida: El carácter 'a' se repite 4 veces.
            • Método compararLongitud(String frase), deberá comparar la longitud
        de la frase que compone la clase con otra nueva frase ingresada por el 
        usuario.
            • Método unirFrases(String frase), deberá unir la frase contenida en 
        la clase Cadena con una nueva frase ingresada por el usuario y mostrar 
        la frase resultante.
            • Método reemplazar(String letra), deberá reemplazar todas las 
        letras “a” que se encuentren en la frase, por algún otro carácter 
        seleccionado por el usuario y mostrar la frase resultante.
            • Método contiene(String letra), deberá comprobar si la frase 
        contiene una letra que ingresa el usuario y devuelve verdadero si la 
        contiene y falso si no.
         */
        ServicioCadena sc = new ServicioCadena();
        Cadena micadena = sc.crearCadena();
        sc.menu(micadena);
        /*
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena micadena = new Cadena();
        System.out.println("Ingrese una frase: ");
        micadena.setFrase(leer.next());
        micadena.setLongitud(micadena.getFrase().length());
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
                    System.out.println("La cantidad de vocales es: " + micadena.mostrarVocales());
                    break;
                case 2:
                    System.out.println("La frase invertida es: " + micadena.invertirPalabra());
                    break;
                case 3:
                    System.out.println("Ingrese una letra:");
                    int letrarepetida = micadena.vecesRepetido(leer.next());
                    System.out.println("La letra ingresada se repite " + letrarepetida + " veces.");
                    break;
                case 4:
                    System.out.println("Ingrese una frase:");
                    micadena.compararLongitud(leer.next());
                    break;
                case 5:
                    System.out.println("Ingrese una frase:");
                    micadena.unirFrase(leer.next());
                    break;
                case 6:
                    System.out.println("Ingrese un caracter que reemplazará las letras A:");
                    micadena.reemplazar(leer.next());
                    break;
                case 7:
                    System.out.println("Ingrese una letra:");
                    if (micadena.contiene(leer.next())) {
                        System.out.println("Contiene la letra.");
                    } else {
                        System.out.println("No contiene la letra.");
                    }
            }
        } while (choice != 0);
         */
    }
}
