package guia2ejerciciosextra05.Entidades;

import java.util.Random;

public class MesSecreto {

    private String mes;
    private String mesSecret;
    Random aleatorio = new Random();

    public MesSecreto() {
    }

    public MesSecreto(String mes, String mesSecret) {
        this.mes = mes;
        this.mesSecret = mesSecret;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMesSecret() {
        return mesSecret;
    }

    public void setMesSecret(String mesSecret) {
        this.mesSecret = mesSecret;
    }

    @Override
    public String toString() {
        return "MesSecreto{" + "mes=" + mes + ", mesSecret=" + mesSecret + '}';
    }
    /*
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
        this.mesSecret = meses(numMesSecreto);
        return x;
    }
     */

}
