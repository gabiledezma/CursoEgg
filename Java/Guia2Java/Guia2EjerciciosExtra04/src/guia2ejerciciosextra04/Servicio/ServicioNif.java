package guia2ejerciciosextra04.Servicio;

import guia2ejerciciosextra04.Entidades.Nif;
import java.util.Scanner;

public class ServicioNif {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String digitoVerificador(int num) {
        String[] letras = new String[23];
        letras[0] = "T";
        letras[1] = "R";
        letras[2] = "W";
        letras[3] = "A";
        letras[4] = "G";
        letras[5] = "M";
        letras[6] = "Y";
        letras[7] = "F";
        letras[8] = "P";
        letras[9] = "D";
        letras[10] = "X";
        letras[11] = "B";
        letras[12] = "N";
        letras[13] = "J";
        letras[14] = "Z";
        letras[15] = "S";
        letras[16] = "Q";
        letras[17] = "V";
        letras[18] = "H";
        letras[19] = "L";
        letras[20] = "C";
        letras[21] = "K";
        letras[22] = "E";
        return letras[num];
    }

    public Nif crearNif() {
        Nif n = new Nif();
        System.out.println("Ingrese el número de DNI: ");
        n.setDNI(leer.nextLong());
        int num = (int) (n.getDNI() % 23);
        n.setLetra(digitoVerificador(num));
        return n;
    }

    public void mostrar(Nif n) {
        System.out.println(n.getDNI() + "-" + n.getLetra());
    }
}
