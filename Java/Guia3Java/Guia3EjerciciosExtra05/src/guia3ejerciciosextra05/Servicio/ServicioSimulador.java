package guia3ejerciciosextra05.Servicio;

import guia3ejerciciosextra05.Entidad.Alumno;
import guia3ejerciciosextra05.Entidad.Simulador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ServicioSimulador {
    
    Random aleatorio = new Random();
    Simulador s = new Simulador();
    
    public ArrayList<Alumno> crearListado() {
        ServicioAlumno sa = new ServicioAlumno();
        ArrayList<Alumno> lista = new ArrayList();
        for (int i = 0; i < 10; i++) {
            lista.add(sa.crearAlumno());
        }
        System.out.println("---LISTADO DE ALUMNOS---");
        for (Alumno alumno : lista) {
            System.out.println(alumno.toString());
        }
        s.setEstudiantes(lista);
        return lista;
    }
    
    public void simular(ArrayList<Alumno> lista) {
        int num;
        for (int i = 0; i < lista.size(); i++) { // recorre la lista de alumnos
            for (int j = 0; j < 3; j++) { // bucle para agregar las 3 elecciones de cada alumno
                do {
                    num = aleatorio.nextInt(lista.size());
                } while (num == i); // bucle para que el alumno no se vote solo
                lista.get(num).setVotosRecibidos(lista.get(num).getVotosRecibidos()+1); // otorga cada voto
                
            }
        }
        
    }
    
    public void facilitadores(ArrayList<Alumno> lista) {
        Collections.sort(lista, Alumno.compararVotos);
        System.out.println("---FACILITADORES TITULARES---");
        for (int i = 0; i < 5; i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("---FACILITADORES SUPLENTES---");
        for (int i = 5; i < 10; i++) {
            System.out.println(lista.get(i));
        }
    }
    
}
