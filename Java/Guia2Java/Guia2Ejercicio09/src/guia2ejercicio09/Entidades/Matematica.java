/*
            9. Realizar una clase llamada Matemática que tenga como atributos 
        dos números reales con los cuales se realizarán diferentes operaciones
        matemáticas. La clase deber tener un constructor vacío, parametrizado y 
        get y set. En el main se creará el objeto y se usará el Math.random para
        generar los dos números y se guardaran en el objeto con su respectivos 
        set. Deberá además implementar los siguientes métodos:
            • Método devolverMayor() para retornar cuál de los dos atributos 
        tiene el mayor valor
            • Método calcularPotencia() para calcular la potencia del mayor 
        valor de la clase elevado al menor número. Previamente se deben 
        redondear ambos valores.
            • Método calculaRaiz(), para calcular la raíz cuadrada del menor de 
        los dos valores. Antes de calcular la raíz cuadrada se debe obtener el 
        valor absoluto del número.
 */
package guia2ejercicio09.Entidades;

public class Matematica {

    private Integer numero1;
    private Integer numero2;

    public Matematica() {
    }

    public Matematica(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    /*

    public int devolverMayor() {
        return Math.max(this.getNumero1(), this.getNumero2());
    }

    public int calcularPotencia() {
        int max = Math.max(this.getNumero1(), this.getNumero2());
        int min = Math.min(this.getNumero1(), this.getNumero2());
        return (int) Math.pow(max, min);
    }

    public double calculaRaiz() {
        int min = Math.min(this.getNumero1(), this.getNumero2());
        return Math.sqrt(min);
    }
     */
}
