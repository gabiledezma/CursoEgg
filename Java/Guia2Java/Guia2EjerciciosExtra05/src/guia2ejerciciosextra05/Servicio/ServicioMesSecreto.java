package guia2ejerciciosextra05.Servicio;

import guia2ejerciciosextra05.Entidades.MesSecreto;
import java.util.Random;
import java.util.Scanner;

public class ServicioMesSecreto {

    Random aleatorio = new Random();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String meses(int num) {
        String[] meses = new String[12];
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
        return meses[num];
    }

    public MesSecreto crearMesSecreto() {
        MesSecreto x = new MesSecreto();
        int numMesSecreto = aleatorio.nextInt(12);
        x.setMesSecret(meses(numMesSecreto));
        return x;
    }

    public void adivinar(MesSecreto x) {
        System.out.println("Adivine el mes secreto. Ingrese el nombre de un mes: ");
        do {
            x.setMes(leer.next());
            if (!x.getMesSecret().equals(x.getMes())) {
                System.out.println("No ha acertado. Intente adivinarlo introduciewndo otro mes:");
            }
        } while (!x.getMesSecret().equals(x.getMes()));
        System.out.println("¡Ha acertado!");
    }
}
