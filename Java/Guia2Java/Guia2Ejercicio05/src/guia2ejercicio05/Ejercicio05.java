package guia2ejercicio05;

import guia2ejercicio05.Entidades.Cuenta;
import guia2ejercicio05.Servicio.ServicioCuenta;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        /*
            5. Realizar una clase llamada Cuenta (bancaria) que debe tener como 
        mínimo los atributos: numeroCuenta (entero), el DNI del cliente (entero 
        largo), el saldo actual. Las operaciones asociadas a dicha clase son:
            • Constructor por defecto y constructor con DNI, saldo y número de 
        cuenta.
            • Agregar los métodos getters y setters correspondientes
            • Metodo para crear un objeto Cuenta, pidiéndole los datos al 
        usuario.
            • Método ingresar(double ingreso): el método recibe una cantidad de
        dinero a ingresar y se la sumara a saldo actual.
            • Método retirar(double retiro): el método recibe una cantidad de 
        dinero a retirar y se la restará al saldo actual. Si la cuenta no tiene 
        la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
            • Método extraccionRapida(): le permitirá sacar solo un 20% de su 
        saldo. Validar que el usuario no saque más del 20%.
            • Método consultarSaldo(): permitirá consultar el saldo disponible 
        en la cuenta.
            • Método consultarDatos(): permitirá mostrar todos los datos de la 
        cuenta.

         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta c = sc.crearCuenta();
        int opcion;
        do {
            System.out.println("---Menú---\n"
                    + "1. Ingresar dinero.\n"
                    + "2. Retirar dinero.\n"
                    + "3. Extraccion rápida.\n"
                    + "4. Consultar saldo.\n"
                    + "5. Consultar datos.\n"
                    + "6. Salir. ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sc.ingresar(c);
                    break;
                case 2:
                    sc.retirar(c);
                    break;
                case 3:
                    sc.extraccionrapida(c);
                    break;
                case 4:
                    sc.consultarSaldo(c);
                    break;
                case 5:
                    sc.consultarDatos(c);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("La opcion ingresada NO es válida. Inténtelo nuevamente.");
            }
        } while (opcion != 6);
    }
    /*
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cuenta c = new Cuenta();
        int opcion;
        c=c.crearCuenta();
        do {
            System.out.println("---Menú---\n"+
                    "1. Ingresar dinero.\n"+
                    "2. Retirar dinero.\n"+
                    "3. Extraccion rápida.\n"+
                    "4. Consultar saldo.\n"+
                    "5. Consultar datos.\n"+
                    "6. Salir. ");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    c.ingresar();
                    break;
                case 2:
                    c.retirar();
                    break;
                case 3:
                    c.extraccionrapida();
                    break;
                case 4:
                    c.consultarSaldo();
                    break;
                case 5:
                    c.consultarDatos();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("La opcion ingresada NO es válida. Inténtelo nuevamente.");
            }
        } while (opcion != 6); 
    }
     */
}
