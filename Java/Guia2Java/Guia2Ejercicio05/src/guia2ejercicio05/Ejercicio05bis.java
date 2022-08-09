package guia2ejercicio05;

import guia2ejercicio05.Entidades.CuentaBis;
import guia2ejercicio05.Servicio.ServicioCuentaBis;
import java.util.Scanner;

//• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%.
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
public class Ejercicio05bis {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCuentaBis scb = new ServicioCuentaBis();

        System.out.println("ingrese el numero de Cuenta");
        int Cuenta = Leer.nextInt();
        System.out.println("ingrese el numero de DNI");
        long Dni = Leer.nextLong();
        System.out.println("Ingrese el Saldo de la Cuenta");
        double saldo = Leer.nextDouble();
        CuentaBis Bancaria = scb.creaCuenta(Cuenta, Dni, saldo);
        int Opcion = 0;
        do {
            System.out.println("Seleccione la operación a realizar:" + "\n"
                    + "1: Ingresar dinero. \n"
                    + "2: Retirar dinero. \n"
                    + "3: Extracción rápida. \n"
                    + "4. Consultar saldo. \n"
                    + "5. Consultar datos. \n"
                    + "6. Salir. ");
            Opcion = Leer.nextInt();
            switch (Opcion) {
                case 1:
                    System.out.println("Ingrese el valor a depositar: ");
                    saldo = Leer.nextDouble();
                    scb.IngresarDinero(Bancaria, saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar: ");
                    saldo = Leer.nextDouble();
                    scb.RetirarDinero(Bancaria, saldo);
                    break;
                case 3:
                    System.out.println("Ingrese el valor a retirar por extracción rapida: ");
                    saldo = Leer.nextDouble();
                    scb.RetiroRapido(Bancaria, saldo);
                    break;
                case 4:
                    scb.ConsultarSaldo(Bancaria);
                    break;
                case 5:
                    scb.ConsultarDatos(Bancaria);
                    break;
            }
        } while (Opcion != 6);

        /*
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBis Bancaria = new CuentaBis();

        System.out.println("ingrese el numero de Cuenta");
        int Cuenta = Leer.nextInt();
        System.out.println("ingrese el numero de DNI");
        long Dni = Leer.nextLong();
        System.out.println("Ingrese el Saldo de la Cuenta");
        double saldo = Leer.nextDouble();

        Bancaria.creaCuenta(Cuenta, Dni, saldo);
        int Opcion = 0;
        do {
            System.out.println("Seleecione la operacion a realizar:" + "\n"
                    + "1: Ingresar dinero \n"
                    + "2: Retirar Dinero \n"
                    + "3: Retiro Rapido de Dinero\n"
                    + "4. Consultar saldo\n"
                    + "5. Consultar datos.\n"
                    + "6. Salir. ");
            Opcion = Leer.nextInt();
            switch (Opcion) {
                case 1:
                    System.out.println("Ingrese el valor a depositar");
                    saldo = Leer.nextDouble();
                    Bancaria.IngresarDinero(saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar");
                    saldo = Leer.nextDouble();
                    Bancaria.RetirarDinero(saldo);
                    break;
                case 3:
                    System.out.println("Ingrese el valor a retirar por extraccion rapida");
                    saldo = Leer.nextDouble();
                    Bancaria.RetiroRapido(saldo);
                    break;
                case 4:
                    Bancaria.ConsultarSaldo();
                    break;
                case 5:
                    Bancaria.ConsultarDatos();
                    break;

            }
        } while (Opcion != 6);
         */
    }
}
