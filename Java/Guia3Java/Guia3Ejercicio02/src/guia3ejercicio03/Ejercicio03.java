package guia3ejercicio03;

import guia3ejercicio03.Entidades.Alumno;
import guia3ejercicio03.Servicio.ServicioAlumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        /*
            3. Crear una clase llamada Alumno que mantenga información sobre las
        notas de distintos alumnos. La clase Alumno tendrá como atributos, su 
        nombre y una lista de tipo Integer con sus 3 notas.
            En el main deberemos tener un bucle que crea un objeto Alumno. Se 
        pide toda la información al usuario y ese Alumno se guarda en una lista 
        de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o
        no.
            Después de ese bluce tendremos el siguiente método en la clase 
        Alumno:
            Método notaFinal(): El usuario ingresa el nombre del alumno que 
        quiere calcular su nota final y se lo busca en la lista de Alumnos. Si 
        está en la lista, se llama al método. Dentro del método se usará la 
        lista notas para calcular el promedio final de alumno. Siendo este 
        promedio final, devuelto por el método y mostrado en el main.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> Estudiantes = new ArrayList();
        ServicioAlumno sa = new ServicioAlumno();
        String seguir;
        do {
            sa.cargarNotas(Estudiantes);
            System.out.println("¿Crear otro alumno? s/n");
            seguir = leer.next();
        } while (seguir.equals("s"));
        System.out.println("¿De qué alumno desea obtener la nota final?");
        String buscado = leer.next();
        if (sa.notaFinal(Estudiantes, buscado) == 0) {
            System.out.println("El alumno buscado NO se encuentra en la lista. ");
        } else {
            System.out.println("El promedio final de " + buscado + " es: " + sa.notaFinal(Estudiantes, buscado));
        }
    }
}
