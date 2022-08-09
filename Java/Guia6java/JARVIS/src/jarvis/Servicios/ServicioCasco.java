package jarvis.Servicios;

import jarvis.Entidades.Casco;

public class ServicioCasco {

    /*

     */
    private ServicioArmadura sa = new ServicioArmadura();

    public Casco crearCasco(String colorPrimario, String colorSecundario, Integer resistencia) {
        Casco c = new Casco(colorPrimario, colorSecundario, resistencia);
        c.setConsumoDeEnergia(1);
        c.setNivelDeSalud(100);
        return c;
    }
}
