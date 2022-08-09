package guia2ejercicio12.Servicio;

import guia2ejercicio12.Entidades.Persona;
import java.util.Date;

public class ServicioPersona {

    public Persona crearPersona(Date fechaNacimiento) {
        Persona p1 = new Persona();
        p1.setFechadenacimiento(fechaNacimiento);
        return p1;
    }

    public void calcularEdad(Persona p1) {
        Date fechaActual = new Date();
        p1.setEdad(fechaActual.getYear() - p1.getFechadenacimiento().getYear() + 1900);

        if (fechaActual.getMonth() < p1.getFechadenacimiento().getMonth()) {
            p1.setEdad(p1.getEdad() - 1);
        }
    }

    public boolean menorQue(Persona p1, int edad) {
        boolean resultado;
        if (p1.getEdad() < edad) {

            return resultado = true;
        }

        return resultado = false;
    }

    public void mostrarPersona(Persona p1) {
        System.out.println("*Nombre: " + p1.getNombre());
        System.out.println("*Fecha de Nacimiento: ");
        System.out.println(" - Dia: " + p1.getFechadenacimiento().getDate());
        System.out.println(" - Mes: " + p1.getFechadenacimiento().getMonth());
        System.out.println(" - Año: " + p1.getFechadenacimiento().getYear());
        System.out.println("*Edad: " + p1.getEdad());
    }

}
