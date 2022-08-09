package guia4ejercicio02.servicios;

import guia4ejercicio02.entidades.Revolver;
import java.util.Random;

public class ServicioRevolver {

    Random aleatorio = new Random();

    public Revolver llenarRevolver() {
        Revolver r = new Revolver();
        r.setPosicionBala(aleatorio.nextInt(6));
        r.setPosicionActual(aleatorio.nextInt(6));
        return r;
    }

    public boolean mojar(Revolver r) {
        boolean conf;
        if (r.getPosicionBala() == r.getPosicionActual()) {
            conf = true;
        } else {
            conf = false;
        }
        return conf;
    }

    public void siguienteChorro(Revolver r) {
        if (r.getPosicionActual() == 5) {
            r.setPosicionActual(0);
        } else {
            r.setPosicionActual(r.getPosicionActual() + 1);
        }
    }
}
