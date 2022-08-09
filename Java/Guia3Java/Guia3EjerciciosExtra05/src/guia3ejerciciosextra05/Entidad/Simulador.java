package guia3ejerciciosextra05.Entidad;

import java.util.ArrayList;

public class Simulador {

    private ArrayList<Alumno> estudiantes;

    public Simulador() {
    }

    public Simulador(ArrayList<Alumno> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Alumno> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Alumno> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Simulador{" + "estudiantes=" + estudiantes + '}';
    }

    
}
