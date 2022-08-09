package guia3ejercicio03.Servicio;

import guia3ejercicio03.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarNotas(ArrayList<Alumno> Estudiantes) {
        Alumno a = new Alumno();
        ArrayList notas = new ArrayList();
        System.out.println("Ingrese el nombre del alumno: ");
        a.setNombre(leer.next());
        System.out.println("Ingrese las notas del alumno: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas.add(leer.nextInt());
        }
        a.setNotas(notas);
        Estudiantes.add(a);
    }

    public double notaFinal(ArrayList<Alumno> Estudiantes, String buscado) {
        double prom = 0;
        double sumatoria = 0;
        Iterator<Alumno> it = Estudiantes.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            if (a.getNombre().equals(buscado)) {
                for (int i = 0; i < a.getNotas().size(); i++) {
                    sumatoria = sumatoria + a.getNotas().get(i);
                }
                prom = sumatoria / a.getNotas().size();
                return prom;
            }
        }
        return 0;
    }
}
