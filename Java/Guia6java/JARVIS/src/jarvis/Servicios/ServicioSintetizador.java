package jarvis.Servicios;

import jarvis.Entidades.Sintetizador;

public class ServicioSintetizador {

    /*

     */
    private ServicioArmadura sa = new ServicioArmadura();

    public Sintetizador crearSintetizador(String colorPrimario, String colorSecundario, Integer resistencia) {
        Sintetizador s = new Sintetizador(colorPrimario, colorSecundario, resistencia);
        s.setConsumoDeEnergia(1);
        s.setNivelDeSalud(100);
        return s;
    }
}
