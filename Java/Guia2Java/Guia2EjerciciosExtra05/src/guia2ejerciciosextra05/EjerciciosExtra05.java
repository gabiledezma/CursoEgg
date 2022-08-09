package guia2ejerciciosextra05;

import guia2ejerciciosextra05.Entidades.MesSecreto;
import guia2ejerciciosextra05.Servicio.ServicioMesSecreto;
import java.util.Scanner;

public class EjerciciosExtra05 {

    public static void main(String[] args) {
        /*
        5. Crea una clase en Java donde declares una variable de tipo array de 
        Strings que contenga los doce meses del año, en minúsculas. A 
        continuación, declara una variable mesSecreto de tipo String, y hazla 
        igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El 
        programa debe pedir al usuario que adivine el mes secreto.
        Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que 
        vuelva a intentar adivinar el mes secreto.
         */
        
        ServicioMesSecreto sms = new ServicioMesSecreto();
        MesSecreto x = sms.crearMesSecreto();
        sms.adivinar(x);
        
/*Scanner leer = new Scanner(System.in).useDelimiter("\n");
        MesSecreto x = new MesSecreto();
        x.crearMesSecreto();
        System.out.println("Adivine el mes secreto. Ingrese el nombre de un mes: ");
        do {
            x.setMes(leer.next());
            if (!x.getMesSecret().equals(x.getMes())) {
                System.out.println("No ha acertado. Intente adivinarlo introduciewndo otro mes:");
            }
        } while (!x.getMesSecret().equals(x.getMes()));
        System.out.println("¡Ha acertado!");
*/
    }

}
