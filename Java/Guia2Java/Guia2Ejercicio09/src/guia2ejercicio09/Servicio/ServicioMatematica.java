package guia2ejercicio09.Servicio;

import guia2ejercicio09.Entidades.Matematica;

public class ServicioMatematica {

    public Matematica crearMatematica() {
        Matematica mat = new Matematica();
        mat.setNumero1((int) (Math.random() * 10));
        mat.setNumero2((int) (Math.random() * 10));
        return mat;
    }

    public int devolverMayor(Matematica mat) {
        return Math.max(mat.getNumero1(), mat.getNumero2());
    }

    public int calcularPotencia(Matematica mat) {
        int max = Math.max(mat.getNumero1(), mat.getNumero2());
        int min = Math.min(mat.getNumero1(), mat.getNumero2());
        return (int) Math.pow(max, min);
    }

    public double calculaRaiz(Matematica mat) {
        int min = Math.min(mat.getNumero1(), mat.getNumero2());
        return Math.sqrt(min);
    }

}
