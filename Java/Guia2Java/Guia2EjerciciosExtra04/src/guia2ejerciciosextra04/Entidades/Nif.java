package guia2ejerciciosextra04.Entidades;

import java.util.Scanner;

public class Nif {

    private long DNI;
    private String letra;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Nif() {
    }

    public Nif(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Nif{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }
    /*
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
        this.DNI = leer.nextLong();
        int num = (int) (this.DNI % 23);
        this.letra = digitoVerificador(num);
        return n;
    }

    public void mostrar(Nif n) {
        System.out.println(n.getDNI() + "-" + n.getLetra());
    }
     */
}
