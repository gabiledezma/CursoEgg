package guia6ejercicio03;

import guia6ejercicio03.Entidades.DivisionNumero;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) throws Exception {
        /*
3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para
leer dos números en forma de String. A continuación, utilice el método parseInt() de la
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo
int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String num, num2;
        System.out.println("Ingrese los numeros: ");
        num = leer.next();
        num2 = leer.next();
        int numero, numero2;
        numero = Integer.parseInt(num);
        numero2 = Integer.parseInt(num2);
        DivisionNumero dn = new DivisionNumero();
        dn.division(numero, numero2);
    }

}
