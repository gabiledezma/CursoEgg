package jarvis.Servicios;

import jarvis.Entidades.Generador;

public class ServicioGenerador {

    /*

     */
    private ServicioArmadura sa = new ServicioArmadura();

    public Generador crearGenerador(String colorPrimario, String colorSecundario, Integer resistencia) {
        Generador g = new Generador(colorPrimario, colorSecundario, resistencia);
        g.setConsumoDeEnergia(0);
        return g;
    }
}
