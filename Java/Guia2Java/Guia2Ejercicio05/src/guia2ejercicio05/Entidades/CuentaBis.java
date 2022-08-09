package guia2ejercicio05.Entidades;

public class CuentaBis {

    private Integer numeroCuenta;
    private long Dni;
    private double SaldoActual;

    public CuentaBis() {
    }

    public CuentaBis(Integer numeroCuenta, long Dni, double SaldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.Dni = Dni;
        this.SaldoActual = SaldoActual;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", Dni=" + Dni + ", SaldoActual=" + SaldoActual + '}';
    }
    /*

    public void creaCuenta(int nroCuenta, long Dni, double SActual) {
        this.numeroCuenta = nroCuenta;
        this.Dni = Dni;
        this.SaldoActual = SActual;
    }

    public void IngresarDinero(double Ingreso) {
        this.SaldoActual = this.SaldoActual + Ingreso;
        System.out.println("El Saldo Actual es de: " + SaldoActual);
    }

    public void RetirarDinero(double Ingreso) {

        if (SaldoActual < Ingreso) {
            System.out.println("La cuenta No tiene fondos");
        } else {
            this.SaldoActual = this.SaldoActual - Ingreso;
            System.out.println("El Saldo Actual es de: " + SaldoActual);
        }
    }
       public void RetiroRapido(double Ingreso) {
              
        if ((SaldoActual*0.2) < Ingreso) {
            System.out.println("El monto supera el 20% de " + SaldoActual);
        } else {
            this.SaldoActual = this.SaldoActual - Ingreso;
            System.out.println("El Saldo Actual es de: " + SaldoActual);
        }
}
       public void ConsultarSaldo(){
           System.out.println("el Saldo de su cuenta es de: " +SaldoActual);
       }
       public void  ConsultarDatos(){
           System.out.println("El numero de cuenta es: " +numeroCuenta );
           System.out.println("El numero de DNI es: " +Dni);
       }
     */
}
