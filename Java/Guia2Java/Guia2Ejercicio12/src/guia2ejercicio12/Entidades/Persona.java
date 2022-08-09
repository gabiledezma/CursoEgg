package guia2ejercicio12.Entidades;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fechadenacimiento;
    private Integer edad;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
        fechadenacimiento = new Date();
    }

    public Persona(String nombre, Date fechadenacimiento, Integer edad) {
        this.nombre = nombre;
        this.fechadenacimiento = fechadenacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechadenacimiento=" + fechadenacimiento + ", edad=" + edad + '}';
    }

    /*

    public void crearPersona(Date fechaNacimiento) {

        this.fechadenacimiento = fechaNacimiento;

    }

    public void calcularEdad() {
        Date fechaActual = new Date();
        this.edad = fechaActual.getYear() - this.fechadenacimiento.getYear() + 1900;

        if (fechaActual.getMonth() < this.fechadenacimiento.getMonth()) {
            this.edad--;
        }
    }

    public boolean menorQue(int edad) {
        boolean resultado;
        if (this.edad < edad) {

            return resultado = true;
        }

        return resultado = false;
    }

    public void mostrarPersona() {
        System.out.println("*Nombre: " + this.nombre);
        System.out.println("*Fecha de Nacimiento: ");
        System.out.println(" - Dia: " + this.fechadenacimiento.getDate());
        System.out.println(" - Mes: " + this.fechadenacimiento.getMonth());
        System.out.println(" - Año: " + this.fechadenacimiento.getYear());
        System.out.println("*Edad: " + this.edad);
    }
     */
}
