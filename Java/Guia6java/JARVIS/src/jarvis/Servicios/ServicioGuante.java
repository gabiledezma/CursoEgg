package jarvis.Servicios;

import jarvis.Entidades.Guante;

public class ServicioGuante {

    /*

     */
    private ServicioArmadura sa = new ServicioArmadura();

    public Guante crearGuante(String colorPrimario, String colorSecundario, Integer resistencia) {
        Guante r = new Guante(colorPrimario, colorSecundario, resistencia);
        r.setConsumoDeEnergia(1);
        r.setNivelDeSalud(100);
        return r;
    }
    
}
