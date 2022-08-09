package jarvis.Servicios;

import jarvis.Entidades.Bota;

public class ServicioBota {

    /*

     */
    private ServicioArmadura sa = new ServicioArmadura();

    public Bota crearBota(String colorPrimario, String colorSecundario, Integer resistencia) {
        Bota p = new Bota(colorPrimario, colorSecundario, resistencia);
        p.setConsumoDeEnergia(1);
        p.setNivelDeSalud(100);
        return p;
    }
}
