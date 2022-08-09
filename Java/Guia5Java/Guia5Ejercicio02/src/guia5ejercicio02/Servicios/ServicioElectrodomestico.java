package guia5ejercicio02.Servicios;

import guia5ejercicio02.Entidades.Electrodomestico;
import java.util.Scanner;

public class ServicioElectrodomestico {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
        • Método comprobarConsumoEnergetico(char letra): comprueba que 
        la letra es correcta, sino es correcta usara la letra F por defecto. 
        Este método se debe invocar al crear el objeto y no será visible.
     */
    public String comprobarConsumoEnergetico(String letra) {
        switch (letra.toUpperCase()) {
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
                return letra.toUpperCase();
            default:
                return "F";

        }
    }

    /*
        • Método comprobarColor(String color): comprueba que el color es
        correcto, y si no lo es, usa el color blanco por defecto. Los colores 
        disponibles para los electrodomésticos son blanco, negro, rojo, azul y 
        gris. No importa si el nombre está en mayúsculas o en minúsculas. Este 
        método se invocará al crear el objeto y no será visible.
     */
    public String comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return color.toLowerCase();
            default:
                return "blanco";
        }
    }

    /*
        • Metodo crearElectrodomestico(): le pide la información al 
        usuario y llena el electrodoméstico, también llama los métodos para 
        comprobar el color y el consumo. Al precio se le da un valor base de 
        $1000.
     */
    public Electrodomestico crearElectrodomestico() {
        Electrodomestico e = new Electrodomestico();
        double precio = 0;
        double peso = 0;
        System.out.println("Ingrese el precio: ");
        do {
            precio = leer.nextDouble();
            if (precio < 1000) {
                System.out.println("El precio base es 1000, intentelo nuevamente.");
            }
        } while (precio < 1000);
        e.setPrecio(precio);
        System.out.println("Ingrese el color: ");
        e.setColor(leer.next());
        System.out.println("Ingrese el consumo:(A, B, C, D, E o F) ");
        e.setConsumoEnergetico(leer.next());
        System.out.println("Ingrese el peso: ");
        do {
            peso = leer.nextDouble();
            if (peso < 1) {
                System.out.println("El peso minimo es 1, intentelo nuevamente.");
            }
        } while (peso < 1);
        e.setPeso(peso);
        return e;
    }

    /*
        • Método precioFinal(): según el consumo energético y su tamaño, 
        aumentará el valor del precio. Esta es la lista de precios:
        
        LETRA PRECIO                        PESO                        PRECIO
        A     $1000                         Entre 1 y 19 kg              $100
        B     $800                          Entre 20 y 49 kg             $500
        C     $600                          Entre 50 y 79 kg             $800
        D     $500                          Mayor que 80 kg             $1000
        E     $300
        F     $100
        
     */
    public double precioFinal(String consumoEnergetico, double peso) {
        double aumentoPorConsumo = 0;
        double aumentoPorPeso = 0;
        switch (consumoEnergetico) {
            case "A":
                aumentoPorConsumo = 1000;
                break;
            case "B":
                aumentoPorConsumo = 800;
                break;
            case "C":
                aumentoPorConsumo = 600;
                break;
            case "D":
                aumentoPorConsumo = 500;
                break;
            case "E":
                aumentoPorConsumo = 300;
                break;
            case "F":
                aumentoPorConsumo = 100;
                break;
        }
        if (peso > 80) {
            aumentoPorPeso = 1000;
        } else {
            if (peso >= 50) {
                aumentoPorPeso = 800;
            } else {
                if (peso >= 20) {
                    aumentoPorPeso = 500;
                } else {
                    aumentoPorPeso = 100;
                }
            }
        }
        double aumentoTotal = aumentoPorConsumo + aumentoPorPeso;
        return aumentoTotal;
    }
}
