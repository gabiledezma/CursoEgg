package guia2ejercicio05.Entidades;

import java.util.Scanner;

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
public class Cuenta {

    private Integer numcuenta;
    private Long dni;
    private Double saldoactual;

    public Cuenta() {
    }

    public Cuenta(Integer numcuenta, Long dni, Double saldoactual) {
        this.numcuenta = numcuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
    }

    public Integer getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(Integer numcuenta) {
        this.numcuenta = numcuenta;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(Double saldoactual) {
        this.saldoactual = saldoactual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numcuenta=" + numcuenta + ", dni=" + dni + ", saldoactual=" + saldoactual + '}';
    }
    /*
    public Cuenta crearCuenta(){
        Cuenta c = new Cuenta();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su número de cuenta: ");
        c.numcuenta=leer.nextInt();
        System.out.println("Ingrese su número de DNI: ");
        c.dni=leer.nextLong();
        System.out.println("Ingrese su saldo actual: ");
        c.saldoactual=leer.nextDouble();
        return c;
    }
    public void ingresar(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double ingresos;
        System.out.println("Dinero a ingresar: ");
        ingresos=leer.nextDouble();
        saldoactual=saldoactual+ingresos;
        
    }
    public void retirar(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double extraccion;
        System.out.println("Dinero a retirar: ");
        extraccion=leer.nextDouble();
        if (saldoactual<extraccion) {
            System.out.println("No dispone de saldo suficiente. Su saldo actual es: $"+saldoactual);
        } else {
            saldoactual=saldoactual-extraccion;
        }
        
    }
    public void extraccionrapida(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double extraccion;
        System.out.println("Dinero a retirar: ");
        extraccion=leer.nextDouble();
        if (extraccion>(saldoactual*0.2)) {
            System.out.println("El monto ingresado NO es posible retirarlo. El máximo posible es el 20% de su saldo.");
        } else if (saldoactual<extraccion) {
            System.out.println("No dispone de saldo suficiente. Su saldo actual es: $"+saldoactual);
        } else {
            saldoactual=saldoactual-extraccion;
        }
        
    }
    public void consultarSaldo() {
        System.out.println("Su saldo es: "+saldoactual);
    }
    public void consultarDatos() {
        System.out.println("Número de cuenta: "+numcuenta+"\n"
                         + "DNI: "+dni);
    }
     */
}
