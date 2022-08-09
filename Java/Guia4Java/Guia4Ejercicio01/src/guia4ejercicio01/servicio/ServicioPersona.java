package guia4ejercicio01.servicio;

import guia4ejercicio01.entidades.Perro;
import guia4ejercicio01.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ServicioPerro sp = new ServicioPerro();

    public Persona crearPersona(ArrayList<Perro> perros) {
        Persona p = new Persona();
        String opcion;
        System.out.println("Ingrese el nombre: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese el apellido: ");
        p.setApellido(leer.next());
        System.out.println("Ingrese la edad: ");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el DNI: ");
        p.setDni(leer.nextLong());
        if (this.contarPerros(perros) > 0) {
            System.out.println("¿Desea adoptar un perro?: (s/n)");
            do {
                opcion = leer.next();
                if (opcion.equalsIgnoreCase("s")) {
                    p.setMascota(this.adoptarPerro(perros));
                }
            } while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n"));
        }
        return p;
    }

    public Perro adoptarPerro(ArrayList<Perro> perros) {
        Perro p;
        Perro p2 = new Perro();
        boolean conf = false;
        System.out.println(perros.toString());
        int cont = 0;
        String nombre;
        do {
            do {
                System.out.println("¿Qué perro desea adoptar?");
                nombre = leer.next();
                for (Perro perro : perros) {
                    if (perro.getNombre().equalsIgnoreCase(nombre)) {
                        if (perro.getAdoptado()) {
                            System.out.println("El perro deseado no puede ser adoptado");
                            conf = true;
                        } else {
                            conf = false;
                        }
                    }
                }
            } while (conf == true);
            for (Perro perro : perros) {
                if (perro.getNombre().equalsIgnoreCase(nombre)) {
                    perro.setAdoptado(true);
                    p = perro;
                    return p;
                } else {
                    cont++;
                }
            }
            if (cont == perros.size()) {
                System.out.println("No se encontró el perro.");
            }
        } while (cont == perros.size());
        return p2;
    }

    public int contarPerros(ArrayList<Perro> perros) {
        int contador = 0;
        for (Perro perro : perros) {
            if (perro.getAdoptado() == false) {
                contador++;
            }
        }
        return contador;
    }

    public void mostrarPersonas(ArrayList<Persona> lista) {
        for (Persona persona : lista) {
            System.out.println(persona.toString());
        }
    }
}
