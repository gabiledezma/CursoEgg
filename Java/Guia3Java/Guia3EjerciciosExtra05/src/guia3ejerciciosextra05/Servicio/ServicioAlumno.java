package guia3ejerciciosextra05.Servicio;

import guia3ejerciciosextra05.Entidad.Alumno;
import java.util.Random;

public class ServicioAlumno {

    public Alumno crearAlumno() {
        Random aleatorio = new Random();
        Alumno a = new Alumno();
        a.setApellidos();
        a.setNombres();
        a.setDnis();
        a.setNombre(a.getNombres().get(aleatorio.nextInt(a.getNombres().size())));
        //System.out.println(a.getNombre());
        a.setApellido(a.getApellidos().get(aleatorio.nextInt(a.getApellidos().size())));
        //System.out.println(a.getApellido());
        a.setDni(a.getDnis());
        //System.out.println(a.getDni());
        a.setVotosRecibidos(0);
        return a;
    }
}
