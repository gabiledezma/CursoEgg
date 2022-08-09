package guia3ejerciciosextra05.Entidad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Alumno {

    private String nombre;
    private String apellido;
    private Integer dni;
    private ArrayList<String> nombres;
    private ArrayList<String> apellidos;
    private Integer dnis;
    private Integer votosRecibidos;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public ArrayList<String> getNombres() {
        return nombres;
    }

    public void setNombres() {
        ArrayList<String> lista = new ArrayList();
        lista.add("Santo");
        lista.add("Luis");
        lista.add("Omar");
        lista.add("Gabriel");
        lista.add("Abel");
        lista.add("Eduardo");
        lista.add("Marcelina");
        lista.add("Nilda");
        lista.add("Claudia");
        lista.add("Maria");
        lista.add("Guadalupe");
        lista.add("Victoria");
        this.nombres = lista;

    }

    public ArrayList<String> getApellidos() {
        return apellidos;
    }

    public void setApellidos() {
        ArrayList<String> lista = new ArrayList();
        lista.add("Fernandez");
        lista.add("Andrade");
        lista.add("Ledezma");
        lista.add("Lafuente");
        lista.add("Borsine");
        lista.add("Anchava");
        this.apellidos = lista;
    }

    public Integer getDnis() {
        return dnis;
    }

    public void setDnis() {
        Random aleatorio = new Random();
        int num;
        do {
            num = (int) (Math.random() * 100000000);
        } while (num > 50000000 || num < 1000000);
        this.dnis = num;
    }

    public Integer getVotosRecibidos() {
        return votosRecibidos;
    }

    public void setVotosRecibidos(Integer votosRecibidos) {
        this.votosRecibidos = votosRecibidos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre = " + nombre + ", Apellido = " + apellido + ", DNI = " + dni + ", Votos Recibidos = " + votosRecibidos + '}';
    }

    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return a2.getVotosRecibidos().compareTo(a1.getVotosRecibidos());
        }
    };

}
