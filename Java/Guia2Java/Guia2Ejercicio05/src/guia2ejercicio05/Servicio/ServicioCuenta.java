package guia2ejercicio05.Servicio;

import guia2ejercicio05.Entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    public Cuenta crearCuenta() {
        Cuenta c = new Cuenta();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su número de cuenta: ");
        c.setNumcuenta(leer.nextInt());
        System.out.println("Ingrese su número de DNI: ");
        c.setDni(leer.nextLong());
        System.out.println("Ingrese su saldo actual: ");
        c.setSaldoactual(leer.nextDouble());
        return c;
    }

    public void ingresar(Cuenta c) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double ingresos;
        System.out.println("Dinero a ingresar: ");
        ingresos = leer.nextDouble();
        c.setSaldoactual(c.getSaldoactual() + ingresos);

    }

    public void retirar(Cuenta c) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double extraccion;
        System.out.println("Dinero a retirar: ");
        extraccion = leer.nextDouble();
        if (c.getSaldoactual() < extraccion) {
            System.out.println("No dispone de saldo suficiente. Su saldo actual es: $" + c.getSaldoactual());
        } else {
            c.setSaldoactual(c.getSaldoactual() - extraccion);
        }

    }

    public void extraccionrapida(Cuenta c) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double extraccion;
        System.out.println("Dinero a retirar: ");
        extraccion = leer.nextDouble();
        if (extraccion > (c.getSaldoactual() * 0.2)) {
            System.out.println("El monto ingresado NO es posible retirarlo. El máximo posible es el 20% de su saldo.");
        } else if (c.getSaldoactual() < extraccion) {
            System.out.println("No dispone de saldo suficiente. Su saldo actual es: $" + c.getSaldoactual());
        } else {
            c.setSaldoactual(c.getSaldoactual() - extraccion);
        }

    }

    public void consultarSaldo(Cuenta c) {
        System.out.println("Su saldo es: " + c.getSaldoactual());
    }

    public void consultarDatos(Cuenta c) {
        System.out.println("Número de cuenta: " + c.getNumcuenta() + "\n"
                + "DNI: " + c.getDni());
    }

}
