package guia4ejerciciosextra02.Servicios;

import guia4ejerciciosextra02.Entidades.Espectador;
import java.util.Random;

public class ServicioEspectador {

    private Random aleatorio = new Random();

    public Espectador crearEspectador() {
        Espectador e = new Espectador();
        e.setEdad(aleatorio.nextInt(100));
        int dinero = (int) aleatorio.nextInt(1000000);
        e.setDineroDisponible((double) dinero / 100);
        e.setNombre(this.crearNombre(aleatorio.nextInt(10)));
        return e;
    }

    public String crearNombre(Integer opcion) {
        String nombre = "";
        switch (opcion) {
            case 0:
                nombre = "Gabriel";
                break;
            case 1:
                nombre = "Agustin";
                break;
            case 2:
                nombre = "Omar";
                break;
            case 3:
                nombre = "Abel";
                break;
            case 4:
                nombre = "Eduardo";
                break;
            case 5:
                nombre = "Maria";
                break;
            case 6:
                nombre = "Luz";
                break;
            case 7:
                nombre = "Guadalupe";
                break;
            case 8:
                nombre = "Victoria";
                break;
            case 9:
                nombre = "Claudia";
                break;
        }
        return nombre;
    }
}
