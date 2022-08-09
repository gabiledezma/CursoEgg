package guia2ejercicio05.Servicio;

import guia2ejercicio05.Entidades.CuentaBis;

public class ServicioCuentaBis {

    public CuentaBis creaCuenta(int nroCuenta, long Dni, double SActual) {
        CuentaBis Bancaria = new CuentaBis();
        Bancaria.setNumeroCuenta(nroCuenta);
        Bancaria.setDni(Dni);
        Bancaria.setSaldoActual(SActual);
        return Bancaria;
    }

    public void IngresarDinero(CuentaBis Bancaria, double Ingreso) {
        Bancaria.setSaldoActual(Bancaria.getSaldoActual() + Ingreso);
        System.out.println("El saldo actual es de: " + Bancaria.getSaldoActual());
    }

    public void RetirarDinero(CuentaBis Bancaria, double Ingreso) {

        if (Bancaria.getSaldoActual() < Ingreso) {
            System.out.println("La cuenta NO tiene fondos");
        } else {
            Bancaria.setSaldoActual(Bancaria.getSaldoActual() - Ingreso);
            System.out.println("El saldo actual es de: " + Bancaria.getSaldoActual());
        }
    }

    public void RetiroRapido(CuentaBis Bancaria, double Ingreso) {

        if ((Bancaria.getSaldoActual() * 0.2) < Ingreso) {
            System.out.println("El monto supera el 20% de " + Bancaria.getSaldoActual());
        } else {
            Bancaria.setSaldoActual(Bancaria.getSaldoActual() - Ingreso);
            System.out.println("El saldo actual es de: " + Bancaria.getSaldoActual());
        }
    }

    public void ConsultarSaldo(CuentaBis Bancaria) {
        System.out.println("El saldo de su cuenta es de: " + Bancaria.getSaldoActual());
    }

    public void ConsultarDatos(CuentaBis Bancaria) {
        System.out.println("El número de cuenta es: " + Bancaria.getNumeroCuenta());
        System.out.println("El número de DNI es: " + Bancaria.getDni());
    }
}
